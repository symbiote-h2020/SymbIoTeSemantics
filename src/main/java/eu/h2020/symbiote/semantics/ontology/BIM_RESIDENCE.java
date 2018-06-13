package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class BIM_RESIDENCE {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v2.2.0 2018/03/13 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.2.0"; }
    public static final OntClass BloodPressureMeter = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#BloodPressureMeter" );
    
    public static final OntClass BodyScale = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#BodyScale" );
    
    public static final OntClass CloseCapability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#CloseCapability" );
    
    public static final OntClass CloseEffect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#CloseEffect" );
    
    public static final OntClass Curtain = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#Curtain" );
    
    public static final OntClass DimmerCapability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#DimmerCapability" );
    
    public static final OntClass DimmerEffect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#DimmerEffect" );
    
    public static final OntClass ElectricityMeter = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#ElectricityMeter" );
    
    public static final OntClass EnviromentalSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#EnviromentalSensor" );
    
    public static final OntClass Fancoil = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#Fancoil" );
    
    public static final OntClass GaitMeasureDevice = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#GaitMeasureDevice" );
    
    public static final OntClass HealthDevice = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#HealthDevice" );
    
    public static final OntClass HumiditySensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#HumiditySensor" );
    
    public static final OntClass Light = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#Light" );
    
    public static final OntClass OnOffCapability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#OnOffCapability" );
    
    public static final OntClass OnOffEffect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#OnOffEffect" );
    
    public static final OntClass OpenCapability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#OpenCapability" );
    
    public static final OntClass OpenEffect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#OpenEffect" );
    
    public static final OntClass Person = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#Person" );
    
    public static final OntClass PowerMeter = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#PowerMeter" );
    
    public static final OntClass RGBCapability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#RGBCapability" );
    
    public static final OntClass RGBEffect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#RGBEffect" );
    
    public static final OntClass Room = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#Room" );
    
    public static final OntClass SetPositionCapability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#SetPositionCapability" );
    
    public static final OntClass SetPositionEffect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#SetPositionEffect" );
    
    public static final OntClass SetTemperatureCapability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#SetTemperatureCapability" );
    
    public static final OntClass SetTemperatureEffect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#SetTemperatureEffect" );
    
    public static final OntClass StopCapability = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#StopCapability" );
    
    public static final OntClass StopEffect = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#StopEffect" );
    
    public static final OntClass TemperatureSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#TemperatureSensor" );
    
    public static final OntClass VoltageMeter = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#VoltageMeter" );
    
    public static final OntClass Window = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#Window" );
    
    public static final Individual BitValueRestriction = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#BitValueRestriction", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual activityState = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#activityState", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cadence = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#cadence", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual color = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#color", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual diastolicBloodPressure = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#diastolicBloodPressure", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual heartRate = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#heartRate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual onOffState = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#onOffState", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual openCloseState = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#openCloseState", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual position = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#position", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual stepLength = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#stepLength", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual strideLength = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#strideLength", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual systolicBloodPressure = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartresidence#systolicBloodPressure", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
