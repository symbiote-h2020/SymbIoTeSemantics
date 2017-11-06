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
    public static final String VERSION_INFO = "v 2.0.0 2017/10/25 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.0.0"; }
    public static final ObjectProperty definesAttribute = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#definesAttribute" );
    
    public static final ObjectProperty hasAttribute = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasAttribute" );
    
    public static final ObjectProperty hasDefinition = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasDefinition" );
    
    public static final ObjectProperty hasDestinationModel = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasDestinationModel" );
    
    public static final ObjectProperty hasMembers = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasMembers" );
    
    public static final ObjectProperty hasMetaAttribute = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasMetaAttribute" );
    
    public static final ObjectProperty hasPopularity = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasPopularity" );
    
    public static final ObjectProperty hasResource = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasResource" );
    
    public static final ObjectProperty hasService = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasService" );
    
    public static final ObjectProperty hasSourceModel = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasSourceModel" );
    
    public static final ObjectProperty hasStatus = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#hasStatus" );
    
    public static final ObjectProperty isOwnerOf = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#isOwnerOf" );
    
    public static final ObjectProperty ownedBy = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#ownedBy" );
    
    public static final ObjectProperty providedBy = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#providedBy" );
    
    public static final ObjectProperty supportsOptionalFeature = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#supportsOptionalFeature" );
    
    public static final ObjectProperty timeframe = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#timeframe" );
    
    public static final ObjectProperty usedBy = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#usedBy" );
    
    public static final ObjectProperty usesInformationModel = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/meta#usesInformationModel" );
    
    public static final DatatypeProperty isAvailable = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#isAvailable" );
    
    public static final DatatypeProperty load = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#load" );
    
    public static final DatatypeProperty password = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#password" );
    
    public static final DatatypeProperty public_ = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#public" );
    
    public static final DatatypeProperty slaDefinition = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#slaDefinition" );
    
    public static final DatatypeProperty systemAssigned = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#systemAssigned" );
    
    public static final DatatypeProperty trust = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#trust" );
    
    public static final DatatypeProperty url = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#url" );
    
    public static final DatatypeProperty username = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#username" );
    
    public static final DatatypeProperty views = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/meta#views" );
    
    public static final OntClass AccessAttribute = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#AccessAttribute" );
    
    public static final OntClass Federation = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#Federation" );
    
    public static final OntClass InformationModel = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#InformationModel" );
    
    public static final OntClass InterworkingService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#InterworkingService" );
    
    public static final OntClass Mapping = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#Mapping" );
    
    public static final OntClass MetaAccessAttribute = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#MetaAccessAttribute" );
    
    public static final OntClass OptionalFeature = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#OptionalFeature" );
    
    public static final OntClass Platform = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#Platform" );
    
    public static final OntClass ResourcePopularity = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#ResourcePopularity" );
    
    public static final OntClass ResourceStatus = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#ResourceStatus" );
    
    public static final OntClass User = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/meta#User" );
    
    public static final Individual exclusiveAccessFeature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#exclusiveAccessFeature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual prioritizedAccessFeature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#prioritizedAccessFeature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual reservationFeature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#reservationFeature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual subscriptionFeature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/meta#subscriptionFeature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
