/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.h2020.symbiote.semantics;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.ReadWrite;
import org.apache.jena.rdf.model.Model;

/**
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class GraphHelper {
    private static final Log log = LogFactory.getLog(GraphHelper.class);
    
     private static void insertGraph(Dataset dataset, String graphURI, String rdf, RDFFormat format) {
        try {
            OntModel model = ModelHelper.readModel(rdf, format, true, false);
            insertGraph(dataset, graphURI, model);
        } catch (IOException ex) {
            log.error("error creating model from RDF", ex);
        }
    }

    private static void insertGraph(Dataset dataset, String graphURI, Model model) {
        dataset.begin(ReadWrite.WRITE);
        dataset.getNamedModel(graphURI).add(model);
        dataset.commit();
        dataset.end();
    }

    private static void removeGraph(Dataset dataset, String graphURI) {
        dataset.begin(ReadWrite.WRITE);
        dataset.removeNamedModel(graphURI);
        dataset.commit();
        dataset.end();
    }
    
    private GraphHelper() {
        
    }
}
