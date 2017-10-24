/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.h2020.symbiote.semantics;

import eu.h2020.symbiote.core.internal.RDFFormat;
import eu.h2020.symbiote.core.internal.RDFInfo;
import eu.h2020.symbiote.semantics.ontology.INTERNAL;
import eu.h2020.symbiote.semantics.sparql.SPARQL;
import eu.h2020.symbiote.semantics.util.StreamHelper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.jena.ontology.OntDocumentManager;
import static org.apache.jena.ontology.OntDocumentManager.ONTOLOGY_SPEC;
import static org.apache.jena.ontology.OntDocumentManager.PREFIX;
import static org.apache.jena.ontology.OntDocumentManager.PUBLIC_URI;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.shared.PrefixMapping;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDF;

/**
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class ModelHelper {

    private static final Log log = LogFactory.getLog(ModelHelper.class);

    private static final String ONT_DOC_MANAGER_CONFIG = "localOntologiesMapping.ttl";

    public static PrefixMapping PREFIXES;

    protected static OntDocumentManager DOC_MANAGER;
    protected static final OntModelSpec MODEL_SPEC_OWL = OntModelSpec.OWL_DL_MEM;
    protected static final OntModelSpec MODEL_SPEC_OWL_INF = OntModelSpec.OWL_DL_MEM_RDFS_INF;

    static {
        try {
        String configFile = Thread.currentThread().getContextClassLoader().getResource(ONT_DOC_MANAGER_CONFIG).toString();
        init(configFile);
        } catch (Exception ex) {
            log.error("error initializing " + ModelHelper.class.getName(), ex);
        }
    }

    protected static void init(String configFilePath) {
        try {
            Model config = readModel(configFilePath);
            loadPrefixes(config);
            DOC_MANAGER = new OntDocumentManager(config);
            MODEL_SPEC_OWL.setDocumentManager(DOC_MANAGER);
            MODEL_SPEC_OWL_INF.setDocumentManager(DOC_MANAGER);
        } catch (IOException ex) {
            log.error("error loading config file for ModelHelper " + configFilePath, ex);
        }
    }

    private static void loadPrefixes(Model config) {
        PREFIXES = PrefixMapping.Factory.create();
        for (ResIterator i = config.listResourcesWithProperty(RDF.type, ONTOLOGY_SPEC); i.hasNext();) {
            Resource root = i.nextResource();
            Statement s = root.getProperty(PUBLIC_URI);
            if (s != null) {
                String publicURI = s.getResource().getURI();
                s = root.getProperty(PREFIX);
                if (s != null) {
                    PREFIXES.setNsPrefix(s.getLiteral().getString(), publicURI);
                }
            }
        }

    }

    private ModelHelper() {

    }

    public static String getMappingURI(String mappingId) {
        return INTERNAL.MAPPING_GRAPH + "/" + mappingId;
    }

    public static String getPlatformURI(String platformId) {
        return INTERNAL.PLATFORMS_GRAPH + "/" + platformId;
    }

    public static String getInformationModelURI(String modelId) {
        return INTERNAL.MODEL_GRAPH + "/" + modelId;
    }

    public static String getResourceURI(String resourceId) {
        return INTERNAL.RESOURCES_GRAPH + "/" + resourceId;
    }

    public static OntModel createModel(boolean withInference) {
        OntModel result = ModelFactory.createOntologyModel(
                withInference
                        ? MODEL_SPEC_OWL_INF
                        : MODEL_SPEC_OWL,
                ModelFactory.createDefaultModel());
        return result;
    }

    public static OntModel asOntModel(Model model, boolean includeImport, boolean withInference) throws IOException {
        OntModel result = createModel(withInference);
        result.getDocumentManager().setProcessImports(false);
        result.add(model);
        if (includeImport) {
            loadImports(result);
        }
        return result;
    }

    public static OntModel readModel(RDFInfo rdfInfo) throws IOException {
        return readModel(rdfInfo, false, false);
    }

    public static OntModel readModel(RDFInfo rdfInfo, boolean includeImport, boolean withInference) throws IOException {
        return readModel(rdfInfo.getRdf(), rdfInfo.getRdfFormat(), includeImport, withInference);
    }

    public static OntModel readModel(String filePath) throws IOException {
        return readModel(filePath, false, false);
    }

    public static OntModel readModel(String filePath, boolean includeImport, boolean withInference) throws IOException {
        return asOntModel(
                (DOC_MANAGER != null ? DOC_MANAGER.getFileManager() : FileManager.get()).loadModel(filePath),
                includeImport,
                withInference);
    }

    public static OntModel readModel(String rdf, RDFFormat format) throws IOException {
        return readModel(rdf, format, false, false);
    }

    public static OntModel readModel(String rdf, RDFFormat format, boolean includeImport, boolean withInference) throws IOException {
        OntModel model = createModel(withInference);
        model.getDocumentManager().setProcessImports(false);
        try (InputStream is = new ByteArrayInputStream(rdf.getBytes())) {
            model.read(is, null, format.name());
        }
        if (includeImport) {
            loadImports(model);
        }
        return model;
    }

    public static void loadImports(OntModel model) throws IOException {
        model.getDocumentManager().setProcessImports(true);
        List<String> failedImports = Collections.synchronizedList(new ArrayList<>());
        model.getDocumentManager().setReadFailureHandler((String url, Model model1, Exception e) -> {
            failedImports.add("URL: " + url + ", Reason: " + e.getMessage());
        });
        model.loadImports();
        model.getDocumentManager().setReadFailureHandler(null);
        if (!failedImports.isEmpty()) {
            throw new IOException("failed to load imported ontologies: " + failedImports.toString());
        }
    }

    public static void unloadImports(OntModel model) {
        model.listImportedOntologyURIs().forEach(x -> DOC_MANAGER.unloadImport(model, x));
    }

    public static OntModel withInf(Model model) {
        if (model instanceof OntModel) {
            OntModel ontModel;
            ontModel = (OntModel) model;
            if (ontModel.getSpecification().equals(MODEL_SPEC_OWL_INF)) {
                return ontModel;
            }
        }
        return ModelFactory.createOntologyModel(MODEL_SPEC_OWL_INF, model);
    }

    public static String writeModel(Model model, RDFFormat format) {
        StringWriter writer = new StringWriter();
        model.write(writer, format.name());
        return writer.toString();
    }

    public static String writeAll(OntModel model, RDFFormat format) {
        StringWriter writer = new StringWriter();
        model.writeAll(writer, format.name());
        return writer.toString();
    }

    public static Set<String> getOntologyDefinitionsURI(OntModel model) {
        return getOntologyDefinitions(model)
                .stream()
                .map(x -> x.getURI())
                .collect(Collectors.toSet());
    }

    public static Set<Resource> getOntologyDefinitions(OntModel model) {
        return model.listSubjectsWithProperty(RDF.type, OWL.Ontology)
                .toSet().stream()
                .collect(Collectors.toSet());
    }

    private static QueryExecution createQuery(String queryString, Model model) {
        return QueryExecutionFactory.create(
                new ParameterizedSparqlString(queryString, PREFIXES).asQuery(),
                model);
    }

    private static <T> List<T> executeSelectAsList(Model model, String query, Function<? super QuerySolution, ? extends T> mapFunction) {
        try (QueryExecution qexec = createQuery(query, model)) {
            return StreamHelper.stream(qexec.execSelect())
                    .map(mapFunction)
                    .collect(Collectors.toList());
        }
    }

    private static <T> Optional<T> executeSelectAsValue(Model model, String query, Function<? super QuerySolution, ? extends T> mapFunction) {
        Optional<T> result = Optional.empty();
        List<T> temp = executeSelectAsList(model, query, mapFunction);
        if (temp != null && !temp.isEmpty()) {
            result = Optional.ofNullable(temp.get(0));
            if (temp.size() > 1) {
                throw new IllegalStateException("query returned more than one result!");
            }
        }
        return result;
    }

    private static Optional<Resource> executeSelectAsResource(Model model, String query) {
        return executeSelectAsValue(model, query, x -> x.getResource(x.varNames().next()));
    }

    private static Optional<Literal> executeSelectAsLiteral(Model model, String query) {
        return executeSelectAsValue(model, query, x -> x.getLiteral(x.varNames().next()));
    }

    private static Optional<RDFNode> executeSelectAsNode(Model model, String query) {
        return executeSelectAsValue(model, query, x -> x.get(x.varNames().next()));
    }

    public static List<String> executeSelectAsNamedResultsList(OntModel model, String query) {
        return executeSelectAsNamedResultsList(model, query, "");
    }

    public static List<String> executeSelectAsNamedResultsList(OntModel model, String query, String message) {
        return executeSelectAsList(model, query, x
                -> message + StreamHelper.stream(x.varNames())
                        .map(y -> y + ": " + x.get(y))
                        .collect(Collectors.joining(",")));
    }

    public static List<Resource> executeSelectAsResourceList(Model model, String query) {
        return executeSelectAsList(model, query, x -> x.getResource(x.varNames().next()));
    }

    public static List<Literal> executeSelectAsLiteralList(Model model, String query) {
        return executeSelectAsList(model, query, x -> x.getLiteral(x.varNames().next()));
    }

    public static List<String> executeSelectAsList(OntModel model, String query) {
        return executeSelectAsList(model, query, x -> x.get(x.varNames().next()).toString());
    }

    public static List<RDFNode> executeSelectAsNodeList(OntModel model, String query) {
        return executeSelectAsList(model, query, x -> x.get(x.varNames().next()));
    }

    public static Optional<Resource> findResource(String name, Model model) {
        return executeSelectAsResource(model, SPARQL.findResourceBy(name));
    }

    public static Optional<Resource> findResource(String name, String pimID, Dataset dataset) {
        return findResource(name, dataset.getNamedModel(getInformationModelURI(pimID)));
    }

    public static Optional<Resource> findResource(Resource type, String name, Model model) {
        return executeSelectAsResource(model, SPARQL.findResourceBy(type, name));
    }

    public static Optional<Resource> findResource(Resource type, String name, String pimID, Dataset dataset) {
        return findResource(type, name, dataset.getNamedModel(getInformationModelURI(pimID)));
    }
}
