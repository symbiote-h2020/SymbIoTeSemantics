package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class WGS84 {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.w3.org/2003/01/geo/wgs84_pos#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    public static final OntProperty alt = M_MODEL.createOntProperty( "http://www.w3.org/2003/01/geo/wgs84_pos#alt" );
    
    public static final OntProperty lat = M_MODEL.createOntProperty( "http://www.w3.org/2003/01/geo/wgs84_pos#lat" );
    
    public static final OntProperty lat_long = M_MODEL.createOntProperty( "http://www.w3.org/2003/01/geo/wgs84_pos#lat_long" );
    
    public static final OntProperty location = M_MODEL.createOntProperty( "http://www.w3.org/2003/01/geo/wgs84_pos#location" );
    
    public static final OntProperty long_ = M_MODEL.createOntProperty( "http://www.w3.org/2003/01/geo/wgs84_pos#long" );
    
}
