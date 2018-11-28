package eu.h2020.symbiote.jsonld;

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
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;
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
            return findTypes(new JsonLDObjectMapper().valueToTree(clazz.newInstance()));
        } catch (InstantiationException | IllegalAccessException ex) {
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

    public static boolean isJsonLD(JsonNode node) {
        if (node == null) {
            return false;
        }
        if (node.isValueNode()) {
            return true;
        }
        if (node.isObject()) {
            if (!node.hasNonNull(TYPE)) {
                return false;
            }
            return StreamSupport.stream(
                    Spliterators.spliteratorUnknownSize(node.fields(), Spliterator.ORDERED),
                    false)
                    .filter(x -> !x.getKey().equalsIgnoreCase(CONTEXT))
                    .map(x -> x.getValue())
                    .allMatch(x -> isJsonLD(x));
        }
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(node.elements(), Spliterator.ORDERED),
                false)
                .allMatch(x -> isJsonLD(x));
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
