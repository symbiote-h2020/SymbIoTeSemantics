package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class BIM_MOBILITY {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v2.3.0 2018/07/23 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.3.0"; }
    public static final ObjectProperty hasObservationType = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#hasObservationType" );
    
    public static final ObjectProperty hasPoIType = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#hasPoIType" );
    
    public static final DatatypeProperty hint = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#hint" );
    
    public static final OntClass Level = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#Level" );
    
    public static final OntClass MovementType = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#MovementType" );
    
    public static final OntClass ObservationType = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#ObservationType" );
    
    public static final OntClass PointOfInterest = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#PointOfInterest" );
    
    public static final OntClass PointOfInterestType = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#PointOfInterestType" );
    
    public static final OntClass Waypoint = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#Waypoint" );
    
    public static final Individual artsCenter = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#artsCenter", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual bar = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#bar", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual bicycle = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#bicycle", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cafe = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#cafe", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual car = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#car", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual casino = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#casino", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cinema = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#cinema", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dailyAverage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#dailyAverage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual fastFoodRestaurant = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#fastFoodRestaurant", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual foodCourt = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#foodCourt", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual forthnightlyAverage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#forthnightlyAverage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual high = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#high", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual hourlyAverage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#hourlyAverage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual jogging = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#jogging", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual library = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#library", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual low = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#low", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual marketplace = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#marketplace", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual medium = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#medium", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual monthlyAverage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#monthlyAverage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nightclub = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#nightclub", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual none = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#none", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual placeOfWorship = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#placeOfWorship", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual pub = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#pub", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual quarterlyAverage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#quarterlyAverage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual restaurant = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#restaurant", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual truck = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#truck", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual variableAverage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#variableAverage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual weeklyAverage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#weeklyAverage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual yearlyAverage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartmobility#yearlyAverage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
