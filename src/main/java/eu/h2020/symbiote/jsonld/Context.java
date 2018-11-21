package eu.h2020.symbiote.jsonld;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import static eu.h2020.symbiote.jsonld.JsonLdProperties.VOCAB;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class Context {

    @JsonProperty(VOCAB)
    private String vocab;
    private Map<String, String> properties;

    public Context() {
        this.properties = new HashMap<>();
    }

    public Context(String base) {
        this();
        this.vocab = base;
    }

    public String getVocab() {
        return vocab;
    }

    public void setVocab(String vocab) {
        this.vocab = vocab;
    }

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    @JsonAnySetter
    public void addProperty(String key, String value) {
        this.properties.put(key, value);
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
