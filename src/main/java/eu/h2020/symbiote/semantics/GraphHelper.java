package eu.h2020.symbiote.semantics;

import java.io.IOException;

import eu.h2020.symbiote.core.internal.RDFFormat;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.ReadWrite;
import org.apache.jena.rdf.model.Model;

/**
 * Helper class for RDF graph manipulation
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class GraphHelper {

    private static final Log log = LogFactory.getLog(GraphHelper.class);

    /**
     * Insert triples serialized as String under given graph in dataset
     *
     * @param dataset dataset where <code>rdf</code> will be inserted
     * @param graphURI URI of the graph under which <code>rdf</code> will be
     * inserted
     * @param rdf triples to insert
     * @param format serialization format of <code>rdf</code>
     */
    public static void insertGraph(Dataset dataset, String graphURI, String rdf, RDFFormat format) {
        try {
            OntModel model = ModelHelper.readModel(rdf, format, false, false);
            if (ModelHelper.getOntologyDefinitions(model).size() == 1) {
                ModelHelper.loadImports(model);
            }
            insertGraph(dataset, graphURI, model);
        } catch (IOException ex) {
            log.error("error creating model from RDF", ex);
        }
    }

    /**
     * Insert triples stored inside Model under given graph in dataset
     *
     * @param dataset dataset where <code>rdf</code> will be inserted
     * @param graphURI URI of the graph under which <code>rdf</code> will be
     * inserted
     * @param model triples to insert
     */
    public static void insertGraph(Dataset dataset, String graphURI, Model model) {
        dataset.begin(ReadWrite.WRITE);
        dataset.getNamedModel(graphURI).add(model);
        dataset.commit();
        dataset.end();
    }

    /**
     * Remove graph from dataset
     *
     * @param dataset dataset containing graph
     * @param graphURI URI of graph to remove
     */
    public static void removeGraph(Dataset dataset, String graphURI) {
        dataset.begin(ReadWrite.WRITE);
        dataset.removeNamedModel(graphURI);
        dataset.commit();
        dataset.end();
    }

    private GraphHelper() {

    }
}
