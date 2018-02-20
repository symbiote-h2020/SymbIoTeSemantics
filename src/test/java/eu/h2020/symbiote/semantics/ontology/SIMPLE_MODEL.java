package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class SIMPLE_MODEL {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/simpleModel#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v 2.2.0 2017/12/12 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.2.0"; }
    public static final OntClass A = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/simpleModel#A" );
    
    public static final OntClass B = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/simpleModel#B" );
    
    public static final Individual instanceOfA = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/simpleModel#instanceOfA", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual instanceOfB = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/simpleModel#instanceOfB", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
