/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.h2020.symbiote.semantics.ontology;

import org.apache.commons.lang3.StringUtils;
import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

/**
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class INTERNAL {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/internal";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v 2.0.0 2017/10/12 12:00:00";
    
    
    public static final String MIM_GRAPH = MIM.getURI();
    public static final String CORE_GRAPH = CIM.getURI();
    public static final String MAPPING_GRAPH = NS + "/mappings";
    public static final String PLATFORMS_GRAPH = NS + "/platforms";
    public static final String SSPS_GRAPH = NS + "/ssps";
    public static final String MODEL_GRAPH = NS + "/models";
    public static final String RESOURCES_GRAPH = NS + "/resources";
    public static final String SDEVS_GRAPH = NS + "/sdevs";

    
    public static final ObjectProperty actsOn = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#actsOn" );
    public static final DatatypeProperty value = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#value" );    
    public static final OntClass Actuator = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Actuator" );
}
