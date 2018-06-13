package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class BIM_YACHTING {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v2.2.0 2018/03/13 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.2.0"; }
    public static final ObjectProperty causedByFault = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#causedByFault" );
    
    public static final ObjectProperty hasComponent = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#hasComponent" );
    
    public static final ObjectProperty hasPoint = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#hasPoint" );
    
    public static final ObjectProperty hasPotentialSupplier = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#hasPotentialSupplier" );
    
    public static final ObjectProperty hasServiceType = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#hasServiceType" );
    
    public static final ObjectProperty hasSupportedService = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#hasSupportedService" );
    
    public static final ObjectProperty supportsServiceType = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#supportsServiceType" );
    
    public static final DatatypeProperty hint = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#hint" );
    
    public static final DatatypeProperty occurance = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#occurance" );
    
    public static final DatatypeProperty timestamp = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#timestamp" );
    
    public static final OntClass BlackWaterTank = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#BlackWaterTank" );
    
    public static final OntClass ConsumableNeed = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#ConsumableNeed" );
    
    public static final OntClass Exhaust = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#Exhaust" );
    
    public static final OntClass Fault = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#Fault" );
    
    public static final OntClass FreshWaterTank = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#FreshWaterTank" );
    
    public static final OntClass GreyWaterTank = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#GreyWaterTank" );
    
    public static final OntClass HarbourServiceType = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#HarbourServiceType" );
    
    public static final OntClass MaintenanceNeed = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#MaintenanceNeed" );
    
    public static final OntClass Port = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#Port" );
    
    public static final OntClass PortExhaust = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#PortExhaust" );
    
    public static final OntClass PotentialSupplierOrganization = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#PotentialSupplierOrganization" );
    
    public static final OntClass Route = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#Route" );
    
    public static final OntClass RoutePoint = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#RoutePoint" );
    
    public static final OntClass ServiceFuelOilTank = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#ServiceFuelOilTank" );
    
    public static final OntClass SmartYachtingService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#SmartYachtingService" );
    
    public static final OntClass StarboardExhaust = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#StarboardExhaust" );
    
    public static final OntClass StorageFuelOilTank = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#StorageFuelOilTank" );
    
    public static final OntClass Tank = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#Tank" );
    
    public static final OntClass Waypoint = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#Waypoint" );
    
    public static final OntClass Yacht = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#Yacht" );
    
    public static final OntClass YachtComponent = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#YachtComponent" );
    
    public static final Individual AutoRepair = M_MODEL.createIndividual( "http://schema.org/AutoRepair", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ComputerStore = M_MODEL.createIndividual( "http://schema.org/ComputerStore", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual DepartmentStore = M_MODEL.createIndividual( "http://schema.org/DepartmentStore", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual DryCleaningOrLaundry = M_MODEL.createIndividual( "http://schema.org/DryCleaningOrLaundry", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Electrician = M_MODEL.createIndividual( "http://schema.org/Electrician", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ElectronicsStore = M_MODEL.createIndividual( "http://schema.org/ElectronicsStore", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual GasStation = M_MODEL.createIndividual( "http://schema.org/GasStation", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual GroceryStore = M_MODEL.createIndividual( "http://schema.org/GroceryStore", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HVACBusiness = M_MODEL.createIndividual( "http://schema.org/HVACBusiness", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HardwareStore = M_MODEL.createIndividual( "http://schema.org/HardwareStore", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Plumber = M_MODEL.createIndividual( "http://schema.org/Plumber", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Winery = M_MODEL.createIndividual( "http://schema.org/Winery", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HVACFault = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#HVACFault", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ascService = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#ascService", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual automatedSupplyChain = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#automatedSupplyChain", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual averageFuelConsumptionPerNauticalMile = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#averageFuelConsumptionPerNauticalMile", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual electricFault = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#electricFault", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual engineFault = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#engineFault", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual exhaustTemperature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#exhaustTemperature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual getConsumableNeedsService = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#getConsumableNeedsService", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual getLatestRouteService = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#getLatestRouteService", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual getLatestSensorDataService = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#getLatestSensorDataService", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual getMaintenanceNeedsService = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#getMaintenanceNeedsService", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual hydraulicFault = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#hydraulicFault", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual smartMooring = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#smartMooring", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual smartMooringService = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#smartMooringService", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual tankLevel = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#tankLevel", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual weelhouseFault = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartyachting#weelhouseFault", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
