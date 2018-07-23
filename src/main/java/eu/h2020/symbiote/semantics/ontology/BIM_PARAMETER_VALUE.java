package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class BIM_PARAMETER_VALUE {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v2.3.0 2018/07/23 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.3.0"; }
    public static final ObjectProperty hasParameterLookupInfo = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#hasParameterLookupInfo" );
    
    public static final ObjectProperty hasParameterValueLookupInfo = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#hasParameterValueLookupInfo" );
    
    public static final ObjectProperty hasSensorLookupInfo = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#hasSensorLookupInfo" );
    
    public static final ObjectProperty useSensor = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#useSensor" );
    
    public static final ObjectProperty withFeatureOfInterest = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#withFeatureOfInterest" );
    
    public static final ObjectProperty withProperty = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#withProperty" );
    
    public static final OntClass MultiSensorLookupInfo = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#MultiSensorLookupInfo" );
    
    public static final OntClass ParameterSensorLookupInfo = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#ParameterSensorLookupInfo" );
    
    public static final OntClass ParameterValueLookupInfo = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#ParameterValueLookupInfo" );
    
    public static final OntClass ServiceLookupInfo = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#ServiceLookupInfo" );
    
    public static final OntClass SingleSensorLookupInfo = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#SingleSensorLookupInfo" );
    
    public static final Individual serviceLookupInfoParameter = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/parametervalues#serviceLookupInfoParameter", M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Parameter" ) );
    
}
