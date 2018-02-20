package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class CIM {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/core#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v 2.2.0 2018/02/20 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.2.0"; }
    public static final ObjectProperty actsOn = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#actsOn" );
    
    public static final ObjectProperty affects = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#affects" );
    
    public static final ObjectProperty basedOnClass = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#basedOnClass" );
    
    public static final ObjectProperty basedOnProperty = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#basedOnProperty" );
    
    public static final ObjectProperty hasBaseDatatype = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasBaseDatatype" );
    
    public static final ObjectProperty hasCapability = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasCapability" );
    
    public static final ObjectProperty hasDatatype = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasDatatype" );
    
    public static final ObjectProperty hasEffect = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasEffect" );
    
    public static final ObjectProperty hasFeatureOfInterest = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasFeatureOfInterest" );
    
    public static final ObjectProperty hasObservation = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasObservation" );
    
    public static final ObjectProperty hasObservationValue = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasObservationValue" );
    
    public static final ObjectProperty hasObservedProperty = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasObservedProperty" );
    
    public static final ObjectProperty hasParameter = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasParameter" );
    
    public static final ObjectProperty hasProperty = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasProperty" );
    
    public static final ObjectProperty hasRestriction = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasRestriction" );
    
    public static final ObjectProperty hasResultType = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasResultType" );
    
    public static final ObjectProperty hasUnitOfMeasurement = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#hasUnitOfMeasurement" );
    
    public static final ObjectProperty locatedAt = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#locatedAt" );
    
    public static final ObjectProperty madeFrom = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#madeFrom" );
    
    public static final ObjectProperty observedBy = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#observedBy" );
    
    public static final ObjectProperty observesProperty = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#observesProperty" );
    
    public static final ObjectProperty onlyInstancesOfClass = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#onlyInstancesOfClass" );
    
    public static final ObjectProperty providesService = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#providesService" );
    
    public static final ObjectProperty resultTime = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#resultTime" );
    
    public static final ObjectProperty samplingTime = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#samplingTime" );
    
    public static final ObjectProperty valueProperty = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/core#valueProperty" );
    
    public static final DatatypeProperty description = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#description" );
    
    public static final DatatypeProperty id = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#id" );
    
    public static final DatatypeProperty isArray = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#isArray" );
    
    public static final DatatypeProperty mandatory = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#mandatory" );
    
    public static final DatatypeProperty max = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#max" );
    
    public static final DatatypeProperty min = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#min" );
    
    public static final DatatypeProperty name = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#name" );
    
    public static final DatatypeProperty pattern = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#pattern" );
    
    public static final DatatypeProperty step = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#step" );
    
    public static final DatatypeProperty symbol = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#symbol" );
    
    public static final DatatypeProperty value = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/core#value" );
    
    public static final OntClass Actuator = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Actuator" );
    
    public static final OntClass Capability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Capability" );
    
    public static final OntClass ComplexDatatype = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#ComplexDatatype" );
    
    public static final OntClass ComplexProperty = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#ComplexProperty" );
    
    public static final OntClass DataProperty = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#DataProperty" );
    
    public static final OntClass Datatype = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Datatype" );
    
    public static final OntClass Device = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Device" );
    
    public static final OntClass Effect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Effect" );
    
    public static final OntClass EnumRestriction = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#EnumRestriction" );
    
    public static final OntClass FeatureOfInterest = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#FeatureOfInterest" );
    
    public static final OntClass InstanceOfRestriction = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#InstanceOfRestriction" );
    
    public static final OntClass LengthRestriction = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#LengthRestriction" );
    
    public static final OntClass Location = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Location" );
    
    public static final OntClass MobileSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#MobileSensor" );
    
    public static final OntClass Observation = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Observation" );
    
    public static final OntClass ObservationValue = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#ObservationValue" );
    
    public static final OntClass Parameter = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Parameter" );
    
    public static final OntClass PrimitiveDatatype = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#PrimitiveDatatype" );
    
    public static final OntClass PrimitiveProperty = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#PrimitiveProperty" );
    
    public static final OntClass Property = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Property" );
    
    public static final OntClass RangeRestriction = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#RangeRestriction" );
    
    public static final OntClass RegExRestriction = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#RegExRestriction" );
    
    public static final OntClass Resource = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Resource" );
    
    public static final OntClass Restriction = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Restriction" );
    
    public static final OntClass Sensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Sensor" );
    
    public static final OntClass Service = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#Service" );
    
    public static final OntClass StationarySensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#StationarySensor" );
    
    public static final OntClass StepRestriction = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#StepRestriction" );
    
    public static final OntClass SymbolicLocation = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#SymbolicLocation" );
    
    public static final OntClass UnitOfMeasurement = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#UnitOfMeasurement" );
    
    public static final OntClass WGS84Location = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#WGS84Location" );
    
    public static final OntClass WKTLocation = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/core#WKTLocation" );
    
    public static final Individual base64Binary = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#base64Binary", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual base64BinaryArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#base64BinaryArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual boolean_ = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#boolean", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual booleanArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#booleanArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual byte_ = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#byte", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual byteArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#byteArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dateTime = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#dateTime", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dateTimeArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#dateTimeArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dateTimeStamp = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#dateTimeStamp", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dateTimeStampArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#dateTimeStampArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual decimal = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#decimal", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual decimalArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#decimalArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual double_ = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#double", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual doubleArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#doubleArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual float_ = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#float", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual floatArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#floatArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual hexBinary = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#hexBinary", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual hexBinaryArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#hexBinaryArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual int_ = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#int", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual intArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#intArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual langString = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#langString", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual langStringArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#langStringArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual long_ = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#long", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual longArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#longArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual short_ = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#short", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual shortArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#shortArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual string = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#string", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual stringArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#stringArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual unsignedByte = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#unsignedByte", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual unsignedByteArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#unsignedByteArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual unsignedInt = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#unsignedInt", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual unsignedIntArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#unsignedIntArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual unsignedLong = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#unsignedLong", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual unsignedLongArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#unsignedLongArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual unsignedShort = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#unsignedShort", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual unsignedShortArray = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/core#unsignedShortArray", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
