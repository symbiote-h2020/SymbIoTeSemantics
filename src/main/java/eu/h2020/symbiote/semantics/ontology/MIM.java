package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class MIM {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/meta#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v2.3.0 2018/07/23 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.3.0"; }
    public static final ObjectProperty definesAttribute = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#definesAttribute" );
    
    public static final ObjectProperty hasAttribute = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasAttribute" );
    
    public static final ObjectProperty hasComparator = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasComparator" );
    
    public static final ObjectProperty hasDefinition = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasDefinition" );
    
    public static final ObjectProperty hasDestinationModel = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasDestinationModel" );
    
    public static final ObjectProperty hasMembers = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasMembers" );
    
    public static final ObjectProperty hasMetaAttribute = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasMetaAttribute" );
    
    public static final ObjectProperty hasMetric = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasMetric" );
    
    public static final ObjectProperty hasPopularity = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasPopularity" );
    
    public static final ObjectProperty hasResource = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasResource" );
    
    public static final ObjectProperty hasResourceType = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasResourceType" );
    
    public static final ObjectProperty hasSLAConstraint = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasSLAConstraint" );
    
    public static final ObjectProperty hasService = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasService" );
    
    public static final ObjectProperty hasSourceModel = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasSourceModel" );
    
    public static final ObjectProperty hasStatus = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasStatus" );
    
    public static final ObjectProperty isConnectedTo = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#isConnectedTo" );
    
    public static final ObjectProperty isOwnerOf = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#isOwnerOf" );
    
    public static final ObjectProperty ownedBy = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#ownedBy" );
    
    public static final ObjectProperty providedBy = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#providedBy" );
    
    public static final ObjectProperty supportsOptionalFeature = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#supportsOptionalFeature" );
    
    public static final ObjectProperty timeframe = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#timeframe" );
    
    public static final ObjectProperty usedBy = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#usedBy" );
    
    public static final ObjectProperty usesInformationModel = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#usesInformationModel" );
    
    public static final DatatypeProperty available = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#available" );
    
    public static final DatatypeProperty duration = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#duration" );
    
    public static final DatatypeProperty isAvailable = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#isAvailable" );
    
    public static final DatatypeProperty load = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#load" );
    
    public static final DatatypeProperty mac = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#mac" );
    
    public static final DatatypeProperty password = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#password" );
    
    public static final DatatypeProperty public_ = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#public" );
    
    public static final DatatypeProperty systemAssigned = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#systemAssigned" );
    
    public static final DatatypeProperty threshold = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#threshold" );
    
    public static final DatatypeProperty trust = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#trust" );
    
    public static final DatatypeProperty url = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#url" );
    
    public static final DatatypeProperty username = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#username" );
    
    public static final DatatypeProperty views = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#views" );
    
    public static final OntClass AccessAttribute = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#AccessAttribute" );
    
    public static final OntClass Comparator = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#Comparator" );
    
    public static final OntClass Enabler = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#Enabler" );
    
    public static final OntClass Federation = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#Federation" );
    
    public static final OntClass InformationModel = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#InformationModel" );
    
    public static final OntClass InterworkingService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#InterworkingService" );
    
    public static final OntClass Mapping = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#Mapping" );
    
    public static final OntClass MetaAccessAttribute = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#MetaAccessAttribute" );
    
    public static final OntClass OptionalFeature = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#OptionalFeature" );
    
    public static final OntClass Platform = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#Platform" );
    
    public static final OntClass QoSConstraint = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#QoSConstraint" );
    
    public static final OntClass QoSMetric = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#QoSMetric" );
    
    public static final OntClass ResourcePopularity = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#ResourcePopularity" );
    
    public static final OntClass ResourceStatus = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#ResourceStatus" );
    
    public static final OntClass SmartDevice = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#SmartDevice" );
    
    public static final OntClass SmartSpace = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#SmartSpace" );
    
    public static final OntClass System = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#System" );
    
    public static final OntClass User = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#User" );
    
    public static final Individual availability = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#availability", QoSMetric );
    
    public static final Individual equals = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#equals", Comparator );
    
    public static final Individual exclusiveAccessFeature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#exclusiveAccessFeature", OptionalFeature );
    
    public static final Individual greaterThan = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#greaterThan", Comparator );
    
    public static final Individual greaterThanOrEqual = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#greaterThanOrEqual", Comparator );
    
    public static final Individual lessThan = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#lessThan", Comparator );
    
    public static final Individual lessThanOrEqual = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#lessThanOrEqual", Comparator );
    
    public static final Individual prioritizedAccessFeature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#prioritizedAccessFeature", OptionalFeature );
    
    public static final Individual reservationFeature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#reservationFeature", OptionalFeature );
    
    public static final Individual subscriptionFeature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#subscriptionFeature", OptionalFeature );
    
}
