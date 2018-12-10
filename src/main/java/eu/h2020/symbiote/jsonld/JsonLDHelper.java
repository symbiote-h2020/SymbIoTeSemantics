package eu.h2020.symbiote.jsonld;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import eu.h2020.symbiote.core.internal.RDFFormat;
import static eu.h2020.symbiote.jsonld.JsonLdProperties.CONTEXT;
import static eu.h2020.symbiote.jsonld.JsonLdProperties.ID;
import static eu.h2020.symbiote.jsonld.JsonLdProperties.TYPE;
import eu.h2020.symbiote.semantics.ModelHelper;
import java.io.IOException;
import java.util.Set;
import org.apache.jena.ext.com.google.common.collect.Sets;
import org.apache.jena.rdf.model.Model;

/**
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class JsonLDHelper {

    public static JsonNode asJsonNode(String json) {
        try {
            return new ObjectMapper().readTree(json);
        } catch (IOException ex) {
            return null;
        }
    }

    public static Set<String> findTypes(Class clazz) {
        try {
            return findTypes(asJsonNode(new JsonLDObjectMapper().writeValueAsString(clazz.newInstance())));
        } catch (InstantiationException | IllegalAccessException | JsonProcessingException ex) {
            throw new IllegalArgumentException("could not instantiate class", ex);
        }
    }

    public static Set<String> findTypes(JsonNode node) {
        Set<String> result = Sets.newHashSet();
        if (node == null) {
            return result;
        }
        if (node.has(TYPE)) {
            JsonNode type = node.get(TYPE);
            if (type.isTextual()) {
                result.add(type.asText());
            } else if (type.isArray()) {
                for (JsonNode typeEntry : type) {
                    if (typeEntry.isTextual()) {
                        result.add(typeEntry.asText());
                    }
                }
            }
        }
        if (!node.isContainerNode()) {
            return result;
        }
        for (JsonNode child : node) {
            result.addAll(findTypes(child));
        }
        return result;
    }

    public static boolean isJsonLD(String json) {
        try {
            jsonLDToRdf(json);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isJsonLD(JsonNode node) {
        try {
            return isJsonLD(new JsonLDObjectMapper().writeValueAsString(node));
        } catch (JsonProcessingException ex) {
            return false;
        }
    }

    public static Model jsonLDToRdf(String json) throws IOException {
        return ModelHelper.readModel(json, RDFFormat.JSONLD);
    }

    public static JsonNode removeJSONLDInfo(JsonNode node) {
        if (node.isObject()) {
            ObjectNode rootObject = (ObjectNode) node;
            rootObject.remove(TYPE);
            rootObject.remove(ID);
            rootObject.remove(CONTEXT);
        }
        node.elements().forEachRemaining(x -> removeJSONLDInfo(x));
        return node;
    }

    private JsonLDHelper() {
    }

}
