package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class BIM_UNIT {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/bim/unit#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v2.0.0 2017/09/04 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.0.0"; }
    public static final OntClass SurfaceDensityRateUnit = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/unit#SurfaceDensityRateUnit" );
    
    public static final Individual beatsPerMinute = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#beatsPerMinute", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual breathsPerMinute = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#breathsPerMinute", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual degreeFahrenheit = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#degreeFahrenheit", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual kilogramPerSquareMetreSecond = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#kilogramPerSquareMetreSecond", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual kilogramSecondPerCubicMetre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#kilogramSecondPerCubicMetre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual microgramDayPerCubicMetre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#microgramDayPerCubicMetre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual microgramHourPerCubicMetre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#microgramHourPerCubicMetre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual microgramPerSquareMetreDay = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#microgramPerSquareMetreDay", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual milligramDayPerCubicMetre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#milligramDayPerCubicMetre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual milligramHourPerCubicMetre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#milligramHourPerCubicMetre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual milligramPerDecilitre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#milligramPerDecilitre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual milligramPerSquareMetreMonth = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#milligramPerSquareMetreMonth", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nanogram = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#nanogram", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nanogramPerCubicMetre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#nanogramPerCubicMetre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nanogramPerLitre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#nanogramPerLitre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nanogramPerSquareMetre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#nanogramPerSquareMetre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nanogramPerSquareMetreDay = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#nanogramPerSquareMetreDay", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual onePerMeter = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#onePerMeter", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual onePerMinute = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#onePerMinute", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual partsPerBillion = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#partsPerBillion", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual partsPerMillion = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#partsPerMillion", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual partsPerTrillion = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#partsPerTrillion", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual picogram = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#picogram", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual picogramPerCubicMetre = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#picogramPerCubicMetre", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual revolutionsPerMinute = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/unit#revolutionsPerMinute", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
