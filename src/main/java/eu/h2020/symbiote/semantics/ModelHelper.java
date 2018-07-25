package eu.h2020.symbiote.semantics;

import eu.h2020.symbiote.core.internal.RDFFormat;
import eu.h2020.symbiote.core.internal.RDFInfo;
import eu.h2020.symbiote.semantics.ontology.INTERNAL;
import eu.h2020.symbiote.semantics.util.JarLocator;
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
 * Helper class for Apache Jena model manipulation
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class ModelHelper {

    public static PrefixMapping PREFIXES;
    private static final String ONT_DOC_MANAGER_CONFIG = "localOntologiesMapping.ttl";
    private static final Log log = LogFactory.getLog(ModelHelper.class);

    protected static OntDocumentManager DOC_MANAGER;
    protected static final OntModelSpec MODEL_SPEC_OWL = OntModelSpec.OWL_DL_MEM;
    protected static final OntModelSpec MODEL_SPEC_OWL_INF = OntModelSpec.OWL_DL_MEM_RDFS_INF;

    static {
        try {
            FileManager fileManager = FileManager.makeGlobal();
            fileManager.addLocator(new JarLocator());
            FileManager.setGlobalFileManager(fileManager);
            init();
        } catch (Exception ex) {
            log.error("error initializing " + ModelHelper.class.getName(), ex);
        }
    }

    /**
     * Converts RDF model to OWL model, optionally with inference and included
     * imports
     *
     * @param model input model
     * @param includeImport true if owl:import should be loaded recursively,
     * otherwise false
     * @param withInference true if OWL inference should be enable in new model,
     * otherwise false
     * @return OWL model, optionally with imports included and OWL inference
     * @throws IOException
     */
    public static OntModel asOntModel(Model model, boolean includeImport, boolean withInference) throws IOException {
        OntModel result = createModel(withInference);
        result.getDocumentManager().setProcessImports(false);
        result.add(model);
        if (includeImport) {
            loadImports(result);
        }
        return result;
    }

    /**
     * Creates a new OWL model
     *
     * @param withInference true if use OWL inference, else false
     * @return empty OWL model, optionally with inference support enabled
     */
    public static OntModel createModel(boolean withInference) {
        OntModel result = ModelFactory.createOntologyModel(
                withInference
                        ? MODEL_SPEC_OWL_INF
                        : MODEL_SPEC_OWL,
                ModelFactory.createDefaultModel());
        return result;
    }

    /**
     * Executes SPARQL <code>query</code> as select against <code>model</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL select query to execute
     * @return list of values as string of first selected variable in
     * <code>query</code>
     */
    public static List<String> executeSelectAsList(OntModel model, String query) {
        return executeSelectAsList(model, query, x -> x.get(x.varNames().next()).toString());
    }

    /**
     * Executes SPARQL <code>query</code> as select against <code>model</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL select query to execute
     * @return list of values as liertals of first selected variable in
     * <code>query</code>
     */
    public static List<Literal> executeSelectAsLiteralList(Model model, String query) {
        return executeSelectAsList(model, query, x -> x.getLiteral(x.varNames().next()));
    }

    /**
     * Executes SPARQL <code>query</code> as select against <code>model</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL select query to execute
     * @return list of results formatted as string like "?var1: value1, ?var2:
     * value2, ...)"
     */
    public static List<String> executeSelectAsNamedResultsList(OntModel model, String query) {
        return executeSelectAsNamedResultsList(model, query, "");
    }

    /**
     * Executes SPARQL <code>query</code> as select against <code>model</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL select query to execute
     * @param message message to be added as prefix to each result
     * @return list of results formatted as string like "<code>message</code>
     * ?var1: value1, ?var2: value2, ...)"
     */
    public static List<String> executeSelectAsNamedResultsList(OntModel model, String query, String message) {
        return executeSelectAsList(model, query, x
                -> message + StreamHelper.stream(x.varNames())
                        .map(y -> y + ": " + x.get(y))
                        .collect(Collectors.joining(",")));
    }

    /**
     * Executes SPARQL <code>query</code> as select against <code>model</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL select query to execute
     * @return list of values as <code>Node</code> of first selected variable in
     * <code>query</code>
     */
    public static List<RDFNode> executeSelectAsNodeList(OntModel model, String query) {
        return executeSelectAsList(model, query, x -> x.get(x.varNames().next()));
    }

    /**
     * Executes SPARQL <code>query</code> as select against <code>model</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL select query to execute
     * @return list of values as <code>Resource</code> of first selected
     * variable in <code>query</code>
     */
    public static List<Resource> executeSelectAsResourceList(Model model, String query) {
        return executeSelectAsList(model, query, x -> x.getResource(x.varNames().next()));
    }

    /**
     * Find resource with <code>name</code> in <code>model</code>
     *
     * @param name name of the <code>Resource</code> to find
     * @param model model to query
     * @return <code>Resource</code> if exists, empty <code>Optional</code>
     * otherwise
     */
    public static Optional<Resource> findResource(String name, Model model) {
        return executeSelectAsResource(model, SparqlHelper.getQueryFindResourceBy(name));
    }

    /**
     * Find resource with <code>name</code> in PIM
     *
     * @param name name of the <code>Resource</code> to find
     * @param pimID ID of the PIM to search
     * @param dataset dataset containing the PIM
     * @return <code>Resource</code> if exists, empty <code>Optional</code>
     * otherwise
     */
    public static Optional<Resource> findResource(String name, String pimID, Dataset dataset) {
        return findResource(name, dataset.getNamedModel(getInformationModelURI(pimID)));
    }

    /**
     * Find resource with <code>name</code> and of given <code>type</code> in
     * <code>model</code>
     *
     * @param type type of resource, i.e. an RDF class
     * @param name name of the <code>Resource</code> to find
     * @param model model to query
     * @return <code>Resource</code> if exists, empty <code>Optional</code>
     * otherwise
     */
    public static Optional<Resource> findResource(Resource type, String name, Model model) {
        return executeSelectAsResource(model, SparqlHelper.getQueryFindResourceBy(type, name));
    }

    /**
     * Find resource with <code>name</code> and of given <code>type</code> in
     * PIM
     *
     * @param type type of resource, i.e. an RDF class
     * @param name name of the <code>Resource</code> to find
     * @param pimID ID of the PIM to search
     * @param dataset dataset containing the PIM
     * @return <code>Resource</code> if exists, empty <code>Optional</code>
     * otherwise
     */
    public static Optional<Resource> findResource(Resource type, String name, String pimID, Dataset dataset) {
        return findResource(type, name, dataset.getNamedModel(getInformationModelURI(pimID)));
    }

    /**
     * @param modelId id of the model
     * @return URI of a model used in symbIoTe
     */
    public static String getInformationModelURI(String modelId) {
        return INTERNAL.MODEL_GRAPH + "/" + modelId;
    }

    /**
     * @param mappingId id of the mapping
     * @return URI of a mapping used in symbIoTe
     */
    public static String getMappingURI(String mappingId) {
        return INTERNAL.MAPPING_GRAPH + "/" + mappingId;
    }

    /**
     * Finds all owl:ontology definitions in given <code>model</code>
     *
     * @param model OWL model
     * @return set of resources used in the owl:ontology definitions
     */
    public static Set<Resource> getOntologyDefinitions(OntModel model) {
        return model.listSubjectsWithProperty(RDF.type, OWL.Ontology)
                .toSet().stream()
                .collect(Collectors.toSet());
    }

    /**
     * Finds all owl:ontology definitions in given <code>model</code>
     *
     * @param model OWL model
     * @return set of URIs used in the owl:ontology definitions
     */
    public static Set<String> getOntologyDefinitionsURI(OntModel model) {
        return getOntologyDefinitions(model)
                .stream()
                .map(x -> x.getURI())
                .collect(Collectors.toSet());
    }

    /**
     * @param platformId id of the platform
     * @return URI of a platform used in symbIoTe
     */
    public static String getPlatformURI(String platformId) {
        return INTERNAL.PLATFORMS_GRAPH + "/" + platformId;
    }

    /**
     * @param sspId id of the smart space
     * @return URI of a smart space used in symbIoTe
     */
    public static String getSspURI(String sspId) {
        return INTERNAL.SSPS_GRAPH + "/" + sspId;
    }

    /**
     * @param resourceId id of the resource
     * @return URI of a resource used in symbIoTe
     */
    public static String getResourceURI(String resourceId) {
        return INTERNAL.RESOURCES_GRAPH + "/" + resourceId;
    }

    /**
     * @param sdevId id of the smart device
     * @return URI of a smart device used in symbIoTe
     */
    public static String getSdevURI(String sdevId) {
        return INTERNAL.SDEVS_GRAPH + "/" + sdevId;
    }

    /**
     * Recursively loads imports of OWL model
     *
     * @param model OWL model
     * @throws IOException when there are errors loading an import
     */
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

    /**
     * creates OWL model
     *
     * @param rdfInfo RDF triples to put into model
     * @param includeImport true if owl:import should be loaded recursively,
     * otherwise false
     * @param withInference true if OWL inference should be enable in new model,
     * otherwise false
     * @return OWL model, optionally with imports included and OWL inference
     * @throws IOException
     */
    public static OntModel readModel(RDFInfo rdfInfo, boolean includeImport, boolean withInference) throws IOException {
        return readModel(rdfInfo.getRdf(), rdfInfo.getRdfFormat(), includeImport, withInference);
    }

    /**
     * creates OWL model with no imports loaded and no inference support
     *
     * @param rdfInfo RDF triples to put into model
     * @return OWL model with no imports loaded and no inference support
     * @throws IOException
     */
    public static OntModel readModel(RDFInfo rdfInfo) throws IOException {
        return readModel(rdfInfo, false, false);
    }

    /**
     * creates OWL model with no imports loaded and no inference support
     *
     * @param filePath filepath of serialized RDF
     * @return OWL model with no imports loaded and no inference support
     * @throws IOException
     */
    public static OntModel readModel(String filePath) throws IOException {
        return readModel(filePath, false, false);
    }

    /**
     * creates OWL model
     *
     * @param filePath filepath of serialized RDF
     * @param includeImport true if owl:import should be loaded recursively,
     * otherwise false
     * @param withInference true if OWL inference should be enable in new model,
     * otherwise false
     * @return OWL model, optionally with imports included and OWL inference
     * @throws IOException
     */
    public static OntModel readModel(String filePath, boolean includeImport, boolean withInference) throws IOException {
        return asOntModel(
                (DOC_MANAGER != null ? DOC_MANAGER.getFileManager() : FileManager.get()).loadModel(filePath),
                includeImport,
                withInference);
    }

    /**
     * creates OWL model with no imports loaded and no inference support
     *
     * @param rdf string containing serialzed RDF
     * @param format serialization format of <code>rdf</code>
     * @return OWL model with no imports loaded and no inference support
     * @throws IOException
     */
    public static OntModel readModel(String rdf, RDFFormat format) throws IOException {
        return readModel(rdf, format, false, false);
    }

    /**
     * creates OWL model
     *
     * @param rdf string containing serialzed RDF
     * @param format serialization format of <code>rdf</code>
     * @param includeImport true if owl:import should be loaded recursively,
     * otherwise false
     * @param withInference true if OWL inference should be enable in new model,
     * otherwise false
     * @return OWL model, optionally with imports included and OWL inference
     * @throws IOException
     */
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

    /**
     * Unloads/removes triples from all import
     *
     * @param model OWL model
     */
    public static void unloadImports(OntModel model) {
        model.listImportedOntologyURIs().forEach(x -> DOC_MANAGER.unloadImport(model, x));
    }

    /**
     * Adds OWL inference to RDF model
     *
     * @param model RDF model
     * @return OWL model with OWL inference
     */
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

    /**
     * Serializes the <code>model</code> including all loaded imports using the
     * <code>format</code>
     *
     * @param model OWL model
     * @param format RDF format
     * @return String serialization of <code>model</code>
     */
    public static String writeAll(OntModel model, RDFFormat format) {
        StringWriter writer = new StringWriter();
        model.writeAll(writer, format.name());
        return writer.toString();
    }

    /**
     * Serializes the <code>model</code> using the <code>format</code>
     *
     * @param model RDF model
     * @param format RDF format
     * @return String serialization of <code>model</code>
     */
    public static String writeModel(Model model, RDFFormat format) {
        StringWriter writer = new StringWriter();
        model.write(writer, format.name());
        return writer.toString();
    }

    /**
     * Create SPARQL Query against Jena <code>model</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL query to execute
     * @return <code>QueryExecution</code> object
     */
    public static QueryExecution createQuery(String query, Model model) {
        return QueryExecutionFactory.create(
                new ParameterizedSparqlString(query, PREFIXES).asQuery(),
                model);
    }

    /**
     * Executes SPARQL SELECT query and converts result to generic
     * <code>List<T></code>
     *
     * @param <T> return type for list
     * @param model model to execute <code>query</code> against
     * @param query SPARQL SELECT query
     * @param mapFunction mapping function from <code>QuerySolution</code> to
     * <code>T</code> for transformation of single result
     * @return result of SPARQL SELECT query as list
     */
    public static <T> List<T> executeSelectAsList(Model model, String query, Function<? super QuerySolution, ? extends T> mapFunction) {
        try (QueryExecution qexec = createQuery(query, model)) {
            return StreamHelper.stream(qexec.execSelect())
                    .map(mapFunction)
                    .collect(Collectors.toList());
        }
    }

    /**
     * Executes SPARQL SELECT query and returns first result element as
     * <code>Literal</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL SELECT query
     * @return first element of result as <code>Literal</code>
     */
    public static Optional<Literal> executeSelectAsLiteral(Model model, String query) {
        return executeSelectAsValue(model, query, x -> x.getLiteral(x.varNames().next()));
    }

    /**
     * Executes SPARQL SELECT query and returns first result element as
     * <code>RDFNode</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL SELECT query
     * @return first element of result as <code>RDFNode</code>
     */
    public static Optional<RDFNode> executeSelectAsNode(Model model, String query) {
        return executeSelectAsValue(model, query, x -> x.get(x.varNames().next()));
    }

    /**
     * Executes SPARQL SELECT query and returns first result element as
     * <code>Resource</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL SELECT query
     * @return first element of result as <code>Resource</code>
     */
    public static Optional<Resource> executeSelectAsResource(Model model, String query) {
        return executeSelectAsValue(model, query, x -> x.getResource(x.varNames().next()));
    }

    /**
     * Executes SPARQL SELECT query and returns first result element as
     * <code>T</code>
     *
     * @param model model to execute <code>query</code> against
     * @param query SPARQL SELECT query
     * @param mapFunction function to map from <code>QuerySolution</code> to
     * <code>T</code>
     * @return first element of result as <code>T</code>
     * @throws IllegalStateException when query returns more than a single
     * result
     */
    public static <T> Optional<T> executeSelectAsValue(Model model, String query, Function<? super QuerySolution, ? extends T> mapFunction) {
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

    private static void loadPrefixes(Model config) {
        PREFIXES = PrefixMapping.Factory.create();
        for (ResIterator i = config.listResourcesWithProperty(RDF.type, OntDocumentManager.ONTOLOGY_SPEC); i.hasNext();) {
            Resource root = i.nextResource();
            Statement s = root.getProperty(OntDocumentManager.PUBLIC_URI);
            if (s != null) {
                String publicURI = s.getResource().getURI();
                s = root.getProperty(OntDocumentManager.PREFIX);
                if (s != null) {
                    PREFIXES.setNsPrefix(s.getLiteral().getString(), publicURI);
                }
            }
        }

    }

    protected static void init() {
        String configFile = Thread.currentThread().getContextClassLoader().getResource(ONT_DOC_MANAGER_CONFIG).toString();
        init(configFile);
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

    private ModelHelper() {

    }

}
