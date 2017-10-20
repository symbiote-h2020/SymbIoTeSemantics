package eu.h2020.symbiote.semantics;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.apache.jena.shared.PrefixMapping;
import org.junit.Before;
import org.junit.Test;

public class ModelHelperTest {
    
    private static final String ONTOLOGY_NAMING_CONFIG = "localOntologiesMappingTest.ttl";

    @Before
    public void init() throws MalformedURLException, IOException, URISyntaxException {
        
    }

    @Test
    public void testLoadPrefixes() {
        ModelHelper.init(ONTOLOGY_NAMING_CONFIG);
        PrefixMapping PREFIXES = ModelHelper.PREFIXES;
        assert(!PREFIXES.getNsPrefixURI("TEST").isEmpty());
    }

}
