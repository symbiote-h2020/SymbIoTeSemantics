package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class BIM_PROPERTY {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/bim/property#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v2.0.0 2017/09/04 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/2.0.0"; }
    public static final OntClass Backscatter = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/property#Backscatter" );
    
    public static final OntClass Precipitation = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/property#Precipitation" );
    
    public static final OntClass SignalNoiseRatio = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/property#SignalNoiseRatio" );
    
    public static final OntClass SurfaceDensityRate = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/property#SurfaceDensityRate" );
    
    public static final Individual ButeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1-ButeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HexeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1-HexeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylAnthraceneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1-MethylAnthraceneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylAnthracene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1-MethylAnthracene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylNaphthalene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1-MethylNaphthalene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylPhenanthrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1-MethylPhenanthrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PenteneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1-PenteneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dichloroethaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.1-dichloroethaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual trichloroethaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.1.1-trichloroethaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual trichloroethaneConcentration_INSTANCE = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.1.2-trichloroethaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dichloroethaneConcentration_INSTANCE = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.2-dichloroethaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dichloroethyleneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.2-dichloroethyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual TrimethylbenzeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.2.3-TrimethylbenzeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual TrimethylbenzeneConcentration_INSTANCE = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.2.4-TrimethylbenzeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual TrimethylbenzeneConcentration_INSTANCE1 = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.3.5-TrimethylbenzeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ButadieneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.3ButadieneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dichlorobenzeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#1.4-dichlorobenzeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylAnthracene_precip_And_drydep_Concentration_INSTANCE = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#2-MethylAnthracene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylNaphthalene_precip_And_drydep_Concentration_INSTANCE = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#2-MethylNaphthalene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylPhenanthrene_precip_And_drydep_Concentration_INSTANCE = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#2-MethylPhenanthrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PentenesConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#2-PentenesConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylenePhenanthreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#4.5-MethylenePhenanthreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylenePhenanthrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#4.5-MethylenePhenanthrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylChryseneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#5-MethylChryseneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylChryseneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#5-MethylChryseneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylChrysene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#5-MethylChrysene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylAnthraceneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#9-MethylAnthraceneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual MethylAnthracene_precip_And_drydep_Concentration_INSTANCE1 = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#9-MethylAnthracene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Benzo_a_pyreneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#Benzo_a_pyreneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Benzo_e_pyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#Benzo_e_pyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual CFC_113Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#CFC-113Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual CFC_11Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#CFC-11Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual CFC_12Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#CFC-12Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ChlorobenzeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ChlorobenzeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ChryseneTriphenylene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ChryseneTriphenylene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Dibenzo_ai_pyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#Dibenzo_ai_pyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Dibenzofuran_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#Dibenzofuran_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Fluoride_exceptHF_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#Fluoride_exceptHF_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HCB_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#HCB_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HCB_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#HCB_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HCC2_C6_excl_AROM__And_CHLH__air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#HCC2-C6_excl.AROM._And_CHLH__air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HCFC_123Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#HCFC-123Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HCFC_22Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#HCFC-22Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HC_GreaterThan_C6_excl_AROM__And_CHLH__air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#HC_GreaterThan_C6_excl.AROM._And_CHLH__air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual HydrogenFluorideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#HydrogenFluorideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual Indeno123cdPyreneInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#Indeno123cdPyreneInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N_ButaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N-ButaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N_PentaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N-PentaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N_Pentane_And_I_Pentane_2_methylbutane_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N-Pentane_And_I-Pentane_2-methylbutane_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N1methylnaphthalene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N1methylnaphthalene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N1methylphenanthrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N1methylphenanthrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2butanoneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2butanoneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2butenalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2butenalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2methylanthracene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2methylanthracene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2methylnaphthalene_ai_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2methylnaphthalene_ai_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2methylnezencarbaldehydeConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2methylnezencarbaldehydeConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2methylphenanthrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2methylphenanthrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2methylpropenalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2methylpropenalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2methylpropenal_And_ButanalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2methylpropenal_And_ButanalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2oxopropanalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2oxopropanalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N2propenalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N2propenalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N3buten2oneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N3buten2oneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N3methylbenzencarbaldehydeConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N3methylbenzencarbaldehydeConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N3methylpentaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N3methylpentaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N3methylphenanthrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N3methylphenanthrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N4methylbenzencarbaldehydeConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N4methylbenzencarbaldehydeConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual N9methylphenanthrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#N9methylphenanthrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual NOyConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#NOyConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual O_XyleneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#O-XyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB101_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB101_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB101_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB101_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB101_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB101_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB105_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB105_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB105_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB105_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB114_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB114_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB118_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB118_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB118_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB118_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB118_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB118_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB122_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB122_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB123_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB123_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB128_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB128_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB128_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB128_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB138_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB138_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB138_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB138_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB138_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB138_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB141_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB141_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB149_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB149_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB149_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB149_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB153_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB153_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB153_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB153_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB153_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB153_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB156_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB156_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB156_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB156_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB157_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB157_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB167_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB167_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB177_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB177_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB180_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB180_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB180_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB180_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB180_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB180_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB183_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB183_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB187_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB187_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB189_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB189_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB18_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB18_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB18_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB18_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB194_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB194_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB206_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB206_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB209_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB209_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB26_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB26_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB28_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB28_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB28_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB28_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB28_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB28_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB31_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB31_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB31_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB31_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB33_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB33_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB37_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB37_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB44_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB44_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB47_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB47_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB52_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB52_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB52_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB52_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB52_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB52_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB60_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB60_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB66_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB66_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB74_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB74_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PCB99_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PCB99_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ParticulateMatter_LessThan_10um_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ParticulateMatter_LessThan_10um_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual PeroxyacetylNitrateConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#PeroxyacetylNitrateConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual TotalNon_methaneHydrocarbonsConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#TotalNon-methaneHydrocarbonsConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual TotalVolatileOrganicCompundsConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#TotalVolatileOrganicCompundsConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual acenaphthene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#acenaphthene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual acenaphthene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#acenaphthene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual acenaphthylene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#acenaphthylene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual acenaphtylene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#acenaphtylene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual acidity_H_And___precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#acidity_H_And___precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual acidity_pH_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#acidity_pH_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual acrylonitrileConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#acrylonitrileConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual airQualityScheme = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#airQualityScheme", M_MODEL.createClass( "http://www.w3.org/2004/02/skos/core#Scheme" ) );
    
    public static final Individual aldrin_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#aldrin_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual alphaHCH_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#alphaHCH_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual alphaHCH_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#alphaHCH_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual alphaHCH_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#alphaHCH_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual aluminium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#aluminium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual aluminium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#aluminium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ammoniaConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ammoniaConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ammoniumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ammoniumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ammoniumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ammoniumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ammonium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ammonium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual anthathreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#anthathreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual antheanthrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#antheanthrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual antheanthrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#antheanthrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual anthraceneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#anthraceneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual anthracene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#anthracene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual anthracene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#anthracene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual anthracene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#anthracene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual aromatics_exceptC6H6_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#aromatics_exceptC6H6_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual arsenicInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#arsenicInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual arsenicInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#arsenicInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual arsenicInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#arsenicInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual arsenic_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#arsenic_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual arsenic_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#arsenic_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual arsenic_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#arsenic_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual availability = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#availability", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual averageSpeed = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#averageSpeed", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual backscatter = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#backscatter", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual batteryLevel = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#batteryLevel", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual beatRate = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#beatRate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzenecarbaldehydeConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzenecarbaldehydeConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_anthraceneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_anthraceneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_anthraceneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_anthraceneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_anthraceneInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_anthraceneInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_anthracene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_anthracene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_anthracene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_anthracene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_fluoranthene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_fluoranthene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_fluorene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_fluorene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_pyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_pyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_pyreneInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_pyreneInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_pyreneInPM2_5_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_pyreneInPM2.5_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_pyrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_pyrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_pyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_pyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_a_pyrene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_a_pyrene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_j_k_fluorantheneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b.j.k_fluorantheneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_j_k_fluorantheneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b.j.k_fluorantheneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_j_k_fluoranthene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b.j.k_fluoranthene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_j_k_fluoranthene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b.j.k_fluoranthene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_j_fluorantheneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b.j_fluorantheneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_j_fluoranthene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b.j_fluoranthene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_And_j_And_k_fluoranthenes_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_And_j_And_k_fluoranthenes_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_And_j_fluorantheneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_And_j_fluorantheneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_fluorantheneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_fluorantheneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_fluorantheneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_fluorantheneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_fluorantheneInPM2_5_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_fluorantheneInPM2.5_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_fluoranthene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_fluoranthene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_fluoranthene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_fluoranthene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_fluorene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_fluorene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_luoranthene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_luoranthene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_naphtha_2_1_d_thiopheneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_naphtha_2.1-d_thiopheneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_naphtha_2_1_d_thiopheneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_naphtha_2.1-d_thiopheneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_b_naphtha_2_1_d_thiophene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_b_naphtha_2.1-d_thiophene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_c_phenanthreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_c_phenanthreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_c_phenanthreneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_c_phenanthreneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_c_phenanthrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_c_phenanthrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_e_pyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_e_pyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_ghi_fluoranthene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_ghi_fluoranthene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_ghi_fluoranthene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_ghi_fluoranthene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_ghi_peryleneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_ghi_peryleneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_ghi_perylene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_ghi_perylene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_ghi_perylene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_ghi_perylene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_ghi_perylene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_ghi_perylene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_j_fluorantheneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_j_fluorantheneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_j_fluorantheneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_j_fluorantheneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_j_fluorantheneInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_j_fluorantheneInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_j_fluoranthene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_j_fluoranthene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_j_fluoranthene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_j_fluoranthene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_j_fluoranthene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_j_fluoranthene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_j_fluorine_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_j_fluorine_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_k_fluorantheneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_k_fluorantheneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_k_fluorantheneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_k_fluorantheneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_k_fluorantheneInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_k_fluorantheneInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_k_fluoranthene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_k_fluoranthene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_k_fluoranthene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_k_fluoranthene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual benzo_k_fluoranthene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#benzo_k_fluoranthene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual betaHCH_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#betaHCH_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual betaHCH_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#betaHCH_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual biphenyl_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#biphenyl_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual biphenyl_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#biphenyl_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual blackCarbon_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#blackCarbon_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual blackSmokeConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#blackSmokeConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual butanalesConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#butanalesConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual butenesConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#butenesConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cadmiumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cadmiumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cadmiumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cadmiumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cadmiumInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cadmiumInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cadmium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cadmium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cadmium_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cadmium_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cadmium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cadmium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual calciumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#calciumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual calciumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#calciumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual calcium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#calcium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual calcium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#calcium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual carbonDioxideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#carbonDioxideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual carbonDisulphideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#carbonDisulphideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual carbonMonoxideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#carbonMonoxideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual carbontetrachlorideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#carbontetrachlorideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chlorideInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chlorideInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chlorideInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chlorideInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chlorideInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chlorideInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chloride_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chloride_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chloride_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chloride_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chlorinatedHydrocarbonsConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chlorinatedHydrocarbonsConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cholanthreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cholanthreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cholanthrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cholanthrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chromiumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chromiumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chromiumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chromiumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chromiumInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chromiumInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chromium_aerosol_concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chromium_aerosol_concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chromium_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chromium_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chromium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chromium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chryseneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chryseneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chryseneTriphenylene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chryseneTriphenylene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chrysene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chrysene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chrysene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chrysene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual chrysene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#chrysene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cis_2_ButeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cis-2-ButeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cis_2_penteneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cis-2-penteneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cisCD_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cisCD_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cisCD_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cisCD_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cisNO_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cisNO_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cobaltInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cobaltInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cobaltInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cobaltInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cobalt_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cobalt_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cobalt_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cobalt_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual copperInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#copperInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual copperInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#copperInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual copperInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#copperInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual copper_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#copper_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual copper_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#copper_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual copper_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#copper_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual coroneneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#coroneneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual coronene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#coronene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual coronene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#coronene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cyclohexaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cyclohexaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cyclopenta_c_d_pyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cyclopenta_c.d_pyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cyclopenta_c_d_pyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cyclopenta_c.d_pyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual cyklopenta_cd_pyrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#cyklopenta_cd_pyrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenz_ac_And_ah_anthracenes_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenz_ac_And_ah_anthracenes_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenz_ac_And_ah_anthracenes_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenz_ac_And_ah_anthracenes_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenz_ah_anthracene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenz_ah_anthracene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ac_And_ah_anthraceneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ac_And_ah_anthraceneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ac_And_ah_anthracenes_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ac_And_ah_anthracenes_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ac_And_ah_anthracenes_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ac_And_ah_anthracenes_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ac_anthraceneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ac_anthraceneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ac_anthraceneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ac_anthraceneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ac_anthracene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ac_anthracene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ae_pyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ae_pyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ae_pyrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ae_pyrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ae_pyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ae_pyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_And_ac_anthraceneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_And_ac_anthraceneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_And_ac_anthraceneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_And_ac_anthraceneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_anthraceneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_anthraceneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_anthraceneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_anthraceneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_anthraceneInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_anthraceneInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_anthracene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_anthracene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_anthracene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_anthracene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_anthracene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_anthracene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_pyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_pyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_pyrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_pyrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ah_pyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ah_pyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ai_pyrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ai_pyrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ai_pyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ai_pyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_ai_pyrene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_ai_pyrene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_al_pyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_al_pyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzo_al_pyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzo_al_pyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dibenzothiopene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dibenzothiopene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dichloroethyleneConcentration_INSTANCE = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dichloroethyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dieldrin_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dieldrin_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dieldrin_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dieldrin_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual dinitrogenoxideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#dinitrogenoxideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual electricConductivityprecip = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#electricConductivityprecip", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual elementalCarbonInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#elementalCarbonInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual elementalCarbonInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#elementalCarbonInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual elementalCarbon_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#elementalCarbon_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual elementalGaseousMercury_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#elementalGaseousMercury_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual endrin_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#endrin_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ethanalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ethanalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ethaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ethaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ethanedialConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ethanedialConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ethene_ethylene_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ethene_ethylene_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ethylBenzeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ethylBenzeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ethyltolueneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ethyltolueneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ethyne_acetylene_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ethyne_acetylene_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual fluorantheneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#fluorantheneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual fluoranthene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#fluoranthene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual fluoranthene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#fluoranthene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual fluoranthene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#fluoranthene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual fluorene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#fluorene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual fluorene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#fluorene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual formaldehydeConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#formaldehydeConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual gaseousNitricAcidConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#gaseousNitricAcidConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual halon1211Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#halon1211Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual halon1301Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#halon1301Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual healthScheme = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#healthScheme", M_MODEL.createClass( "http://www.w3.org/2004/02/skos/core#Scheme" ) );
    
    public static final Individual heptachlorEpoxide_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#heptachlorEpoxide_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual heptachlor_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#heptachlor_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual hexanalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#hexanalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual hydrogenChlorideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#hydrogenChlorideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual hydrogenSulphideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#hydrogenSulphideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual i_Butane_2_methylpropane_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#i-Butane_2-methylpropane_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual i_Hexane_2_methylpentane_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#i-Hexane_2-methylpentane_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual i_Octane_2_2_4_trimethylpentane_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#i-Octane_2.2.4-trimethylpentane_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual i_Pentane_2_methylbutane_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#i-Pentane_2-methylbutane_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual indeno123cdPyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#indeno123cdPyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual indeno123cdPyreneInPM10_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#indeno123cdPyreneInPM10_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual indeno123cdPyrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#indeno123cdPyrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual indeno123cdPyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#indeno123cdPyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual indeno123cdPyrene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#indeno123cdPyrene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ironInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ironInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ironInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ironInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual iron_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#iron_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual iron_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#iron_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual isoheptaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#isoheptaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual isoprene_2_methyl_1_3_butadiene_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#isoprene_2-methyl-1.3-butadiene_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual leadInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#leadInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual leadInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#leadInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual leadInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#leadInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual lead_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#lead_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual lead_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#lead_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual lead_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#lead_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual lindane_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#lindane_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual lindane_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#lindane_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual lindane_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#lindane_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual m_xyleneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#m-xyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual m_p_XyleneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#m.p-XyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual magnesiumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#magnesiumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual magnesiumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#magnesiumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual magnesium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#magnesium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual magnesium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#magnesium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual manganeseInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#manganeseInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual manganeseInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#manganeseInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual manganeseInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#manganeseInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual manganese_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#manganese_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual manganese_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#manganese_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual mercuryInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#mercuryInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual mercuryInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#mercuryInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual mercuryInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#mercuryInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual mercury_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#mercury_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual mercury_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#mercury_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual mercury_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#mercury_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual methaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#methaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual metyhchloroformConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#metyhchloroformConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual mobileSensingScheme = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#mobileSensingScheme", M_MODEL.createClass( "http://www.w3.org/2004/02/skos/core#Scheme" ) );
    
    public static final Individual molybdenum_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#molybdenum_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual n_HexaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#n-HexaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual n_Nonane = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#n-Nonane", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual n_OctaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#n-OctaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual n_heptaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#n-heptaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual naphtalene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#naphtalene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual naphthalene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#naphthalene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual neohexaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#neohexaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual neopentaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#neopentaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nickelInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nickelInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nickelInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nickelInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nickelInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nickelInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nickel_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nickel_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nickel_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nickel_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nickel_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nickel_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nitrateInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nitrateInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nitrateInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nitrateInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nitrate_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nitrate_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nitrogenDioxideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nitrogenDioxideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nitrogenMonoxideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nitrogenMonoxideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual nitrogenOxidesConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#nitrogenOxidesConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual non_volatilePM10Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#non-volatilePM10Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual non_volatilePM1Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#non-volatilePM1Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual non_volatilePM2_5Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#non-volatilePM2.5Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual numberOfCars = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#numberOfCars", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual opDDD_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#opDDD_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual opDDD_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#opDDD_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual opDDE_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#opDDE_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual opDDE_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#opDDE_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual opDDT_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#opDDT_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual opDDT_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#opDDT_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual organicCarbonInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#organicCarbonInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual organicCarbonInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#organicCarbonInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual organicCarbon_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#organicCarbon_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ozoneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ozoneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual p_xyleneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#p-xyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual pH = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#pH", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual particulateAmmonium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#particulateAmmonium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual particulateMatter_LessThan_1um_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#particulateMatter_LessThan_1um_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual particulateMatter_LessThan_2_5um_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#particulateMatter_LessThan_2.5um_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual particulateNitrate_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#particulateNitrate_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual particulateSulphate_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#particulateSulphate_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual pentanalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#pentanalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual pentenesConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#pentenesConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual peryleneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#peryleneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual perylene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#perylene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual perylene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#perylene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual phenanthreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#phenanthreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual phenanthrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#phenanthrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual phenanthrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#phenanthrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual phenanthrene_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#phenanthrene_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual phenyletanoneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#phenyletanoneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual phosphate_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#phosphate_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual polyachromaticHydrocarbons_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#polyachromaticHydrocarbons_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual potassiumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#potassiumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual potassiumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#potassiumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual potassium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#potassium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual potassium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#potassium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ppDDD_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ppDDD_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ppDDD_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ppDDD_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ppDDE_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ppDDE_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ppDDE_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ppDDE_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ppDDT_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ppDDT_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual ppDDT_recip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#ppDDT_recip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual precipitationAmount = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#precipitationAmount", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual precipitationAmountOff = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#precipitationAmountOff", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual propanalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#propanalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual propaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#propaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual propanoneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#propanoneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual propanone_And_N2propenalConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#propanone_And_N2propenalConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual propeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#propeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual propene_And_IsobutaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#propene_And_IsobutaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual propylbenzeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#propylbenzeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual pyreneInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#pyreneInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual pyrene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#pyrene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual pyrene_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#pyrene_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual radioactivity = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#radioactivity", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual reactiveMercury_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#reactiveMercury_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual respirationRate = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#respirationRate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual retene_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#retene_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual seleniumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#seleniumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual seleniumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#seleniumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual selenium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#selenium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual signalNoiseRatio = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#signalNoiseRatio", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sodiumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sodiumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sodiumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sodiumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sodiumInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sodiumInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sodium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sodium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sodium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sodium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual strongAcidityConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#strongAcidityConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual styreneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#styreneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sulphateCorrected_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sulphateCorrected_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sulphateInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sulphateInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sulphateInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sulphateInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sulphate_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sulphate_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sulphurDioxideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sulphurDioxideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sumPCB_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sumPCB_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual sumSulphDioxSulphate_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#sumSulphDioxSulphate_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual surfaceDensityRate = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#surfaceDensityRate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual tetrachloroethyleneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#tetrachloroethyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual tetrachloromethaneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#tetrachloromethaneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual tinInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#tinInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual titanium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#titanium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual tolualdehydeConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#tolualdehydeConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual tolueneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#tolueneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual totalAmmonium_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#totalAmmonium_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual totalGaseousMercury_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#totalGaseousMercury_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual totalNitrate_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#totalNitrate_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual totalSuspendedParticulates_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#totalSuspendedParticulates_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual trafficScheme = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#trafficScheme", M_MODEL.createClass( "http://www.w3.org/2004/02/skos/core#Scheme" ) );
    
    public static final Individual trans_2_ButeneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#trans-2-ButeneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual trans_2_penteneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#trans-2-penteneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual transCD_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#transCD_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual transCD_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#transCD_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual transNO_air_And_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#transNO_air_And_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual transNO_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#transNO_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual trichloroethyleneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#trichloroethyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual vanadium_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#vanadium_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual vanadium_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#vanadium_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual vanediumInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#vanediumInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual vanediumInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#vanediumInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual vinylChlorideConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#vinylChlorideConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual volatilePM10Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#volatilePM10Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual volatilePM1Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#volatilePM1Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual volatilePM2_5Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#volatilePM2.5Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual wetNitrogenDeposition = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#wetNitrogenDeposition", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual xyleneConcentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#xyleneConcentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual zincInPM10_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#zincInPM10_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual zincInPM2_5_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#zincInPM2.5_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual zincInTSP_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#zincInTSP_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual zinc_aerosol_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#zinc_aerosol_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual zinc_precip_And_drydep_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#zinc_precip_And_drydep_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    public static final Individual zinc_precip_Concentration = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/property#zinc_precip_Concentration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
