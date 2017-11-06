package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class BIM_STADIUM {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v2.0.0 2017/10/25 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.0.0"; }
    public static final ObjectProperty hasAttachment = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#hasAttachment" );
    
    public static final ObjectProperty hasMessage = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#hasMessage" );
    
    public static final ObjectProperty hasOrderItem = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#hasOrderItem" );
    
    public static final ObjectProperty hasProduct = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#hasProduct" );
    
    public static final ObjectProperty hasPromotion = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#hasPromotion" );
    
    public static final ObjectProperty hasSender = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#hasSender" );
    
    public static final ObjectProperty referencesProduct = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#referencesProduct" );
    
    public static final ObjectProperty referencesPromotion = M_MODEL.createObjectProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#referencesPromotion" );
    
    public static final DatatypeProperty content = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#content" );
    
    public static final DatatypeProperty discount = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#discount" );
    
    public static final DatatypeProperty end = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#end" );
    
    public static final DatatypeProperty newPrice = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#newPrice" );
    
    public static final DatatypeProperty picture = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#picture" );
    
    public static final DatatypeProperty price = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#price" );
    
    public static final DatatypeProperty productId = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#productId" );
    
    public static final DatatypeProperty quantity = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#quantity" );
    
    public static final DatatypeProperty start = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#start" );
    
    public static final DatatypeProperty timestamp = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#timestamp" );
    
    public static final DatatypeProperty type = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#type" );
    
    public static final OntClass Attachment = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#Attachment" );
    
    public static final OntClass Catalog = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#Catalog" );
    
    public static final OntClass FoodStore = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#FoodStore" );
    
    public static final OntClass GetCatalogService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#GetCatalogService" );
    
    public static final OntClass GetInformationService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#GetInformationService" );
    
    public static final OntClass GoodStore = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#GoodStore" );
    
    public static final OntClass Message = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#Message" );
    
    public static final OntClass NotificationService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#NotificationService" );
    
    public static final OntClass Order = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#Order" );
    
    public static final OntClass OrderItem = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#OrderItem" );
    
    public static final OntClass PlaceOrderService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#PlaceOrderService" );
    
    public static final OntClass Product = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#Product" );
    
    public static final OntClass Promotion = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#Promotion" );
    
    public static final OntClass PromowallDevice = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#PromowallDevice" );
    
    public static final OntClass PromowallService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#PromowallService" );
    
    public static final OntClass PublishInformationService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#PublishInformationService" );
    
    public static final OntClass PublishPromotionService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#PublishPromotionService" );
    
    public static final OntClass RetailerDevice = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#RetailerDevice" );
    
    public static final OntClass RetailerService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#RetailerService" );
    
    public static final OntClass Sender = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#Sender" );
    
    public static final OntClass Store = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#Store" );
    
    public static final OntClass VisitorDevice = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#VisitorDevice" );
    
    public static final OntClass VisitorService = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartstadium#VisitorService" );
    
}
