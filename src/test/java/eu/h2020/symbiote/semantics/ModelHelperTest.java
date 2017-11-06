package eu.h2020.symbiote.semantics;

import eu.h2020.symbiote.semantics.ontology.BIM;
import eu.h2020.symbiote.semantics.ontology.BIM_MOBILITY;
import eu.h2020.symbiote.semantics.ontology.BIM_PARAMETER_VALUE;
import eu.h2020.symbiote.semantics.ontology.BIM_PROPERTY;
import eu.h2020.symbiote.semantics.ontology.BIM_QU_ALIGN;
import eu.h2020.symbiote.semantics.ontology.BIM_RESIDENCE;
import eu.h2020.symbiote.semantics.ontology.BIM_STADIUM;
import eu.h2020.symbiote.semantics.ontology.BIM_UNIT;
import eu.h2020.symbiote.semantics.ontology.BIM_YACHTING;
import eu.h2020.symbiote.semantics.ontology.CIM;
import eu.h2020.symbiote.semantics.ontology.MIM;
import eu.h2020.symbiote.semantics.ontology.SIMPLE_MODEL;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.shared.PrefixMapping;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ModelHelperTest {

    private static final String ONTOLOGY_NAMING_CONFIG = "localOntologiesMappingTest.ttl";
    private static final String QUERY_PATH = "/queries/";
    private static final String QUERY_OWL_CLASSES = "OWL_CLASSES";

    private String getQuery(String name) throws IOException {
        return IOUtils.toString(this.getClass().getResource(QUERY_PATH + name + ".sparql"));
    }

    @Before
    public void init() throws MalformedURLException, IOException, URISyntaxException {
        ModelHelper.init(ONTOLOGY_NAMING_CONFIG);
    }

    @Test
    public void testLoadPrefixes() throws IOException {
        PrefixMapping PREFIXES = ModelHelper.PREFIXES;
        assert (PREFIXES.getNsURIPrefix(CIM.NS).equalsIgnoreCase("core"));
    }

    @Test
    public void testExecuteSelectAsList() throws IOException {
        OntModel simpleModel = ModelHelper.readModel(SIMPLE_MODEL.getURI());
        String query = getQuery(QUERY_OWL_CLASSES);
        List<Resource> resourceList = ModelHelper.executeSelectAsResourceList(simpleModel, query);
        List<String> stringList = ModelHelper.executeSelectAsList(simpleModel, query);
        List<String> resourceListAsString = resourceList.stream().map(x -> x.getURI()).collect(Collectors.toList());
        assertTrue(resourceList.size() == 2);
        assertTrue(resourceListAsString.containsAll(stringList));
        assertTrue(stringList.containsAll(resourceListAsString));
    }

    @Test
    public void testFindResourceByName() throws IOException {
        OntModel simpleModel = ModelHelper.readModel(SIMPLE_MODEL.getURI());
        String name = simpleModel.getIndividual(SIMPLE_MODEL.instanceOfA.getURI()).getProperty(CIM.name).getString();
        Optional<Resource> result = ModelHelper.findResource(name, simpleModel);
        assertTrue(result.isPresent());
        assertTrue(SIMPLE_MODEL.instanceOfA.getURI().equals(result.get().getURI()));
    }

    @Test
    public void testFindResourceByNameAndType() throws IOException {
        OntModel simpleModel = ModelHelper.readModel(SIMPLE_MODEL.getURI());
        String name = simpleModel.getIndividual(SIMPLE_MODEL.instanceOfA.getURI()).getProperty(CIM.name).getString();
        Optional<Resource> result = ModelHelper.findResource(SIMPLE_MODEL.A, name, simpleModel);
        assertTrue(result.isPresent());
        assertTrue(SIMPLE_MODEL.instanceOfA.getURI().equals(result.get().getURI()));
    }

    @Test
    public void testModelWithInference() throws IOException {
        OntModel simpleModel = ModelHelper.readModel(SIMPLE_MODEL.getURI());
        Set<Individual> instancesOfAWithoutInference = simpleModel.listIndividuals(SIMPLE_MODEL.A).toSet();
        assert (instancesOfAWithoutInference.size() == 1);
        simpleModel = ModelHelper.withInf(simpleModel);
        Set<Individual> instancesOfAWithInference = simpleModel.listIndividuals(SIMPLE_MODEL.A).toSet();
        assert (instancesOfAWithInference.size() == 2);
    }

    @Test
    public void testLoadImports() throws IOException {
        OntModel simpleModel = ModelHelper.readModel(SIMPLE_MODEL.getURI());
        assertFalse(simpleModel.containsResource(CIM.Resource));
        ModelHelper.loadImports(simpleModel);
        assertTrue(simpleModel.containsResource(CIM.Resource));
    }

    @Test
    public void testGetOntologyDefinitions() throws IOException {
        OntModel simpleModel = ModelHelper.readModel(SIMPLE_MODEL.getURI());
        Set<Resource> ontologyDefinitions = ModelHelper.getOntologyDefinitions(simpleModel);
        assert (ontologyDefinitions.size() == 1);
        assert (ontologyDefinitions.iterator().next().getURI().equals(SIMPLE_MODEL.getURI()));
    }

    @Test
    public void testLoadSymbIoTeOntologies() throws IOException {
        // load original config file as used in deployment
        ModelHelper.init();
        // check that all symbIoTe models are loadable from cache
        ModelHelper.readModel(CIM.getURI());
        ModelHelper.readModel(MIM.getURI());
        ModelHelper.readModel(BIM.getURI());
        ModelHelper.readModel(BIM_MOBILITY.getURI());
        ModelHelper.readModel(BIM_PARAMETER_VALUE.getURI());
        ModelHelper.readModel(BIM_PROPERTY.getURI());
        ModelHelper.readModel(BIM_QU_ALIGN.getURI());
        ModelHelper.readModel(BIM_RESIDENCE.getURI());
        ModelHelper.readModel(BIM_STADIUM.getURI());
        ModelHelper.readModel(BIM_UNIT.getURI());
        ModelHelper.readModel(BIM_YACHTING.getURI());
        // also check loading by versionURI
        ModelHelper.readModel(CIM.getVersionURI());
        ModelHelper.readModel(MIM.getVersionURI());
        ModelHelper.readModel(BIM.getVersionURI());
        ModelHelper.readModel(BIM_MOBILITY.getVersionURI());
        ModelHelper.readModel(BIM_PARAMETER_VALUE.getVersionURI());
        ModelHelper.readModel(BIM_PROPERTY.getVersionURI());
        ModelHelper.readModel(BIM_QU_ALIGN.getVersionURI());
        ModelHelper.readModel(BIM_RESIDENCE.getVersionURI());
        ModelHelper.readModel(BIM_STADIUM.getVersionURI());
        ModelHelper.readModel(BIM_UNIT.getVersionURI());
        ModelHelper.readModel(BIM_YACHTING.getVersionURI());
    }

}
