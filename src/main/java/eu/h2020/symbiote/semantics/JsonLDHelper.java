/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.h2020.symbiote.semantics;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.h2020.symbiote.core.internal.RDFFormat;
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

    public static final String TAG_TYPE = "@type";

    private JsonLDHelper() {
    }

    public static Model jsonLDToRdf(String json) throws IOException {
        return ModelHelper.readModel(json, RDFFormat.JSONLD);
    }

    public static JsonNode asJsonNode(String json) {
        try {
            return new ObjectMapper().readTree(json);
        } catch (IOException ex) {
            return null;
        }
    }

    public static boolean isJsonLD(JsonNode node) {
        if (node == null) {
            return false;
        }
        if (node.isValueNode()) {
            return true;
        }
        if (node.isObject() && !node.hasNonNull(TAG_TYPE)) {
            return false;
        }
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(node.elements(), Spliterator.ORDERED),
                false)
                .allMatch(x -> isJsonLD(x));
    }

    public static Set<String> findTypes(JsonNode node) {
        Set<String> result = Sets.newHashSet();
        if (node == null) {
            return result;
        }
        if (node.has(TAG_TYPE)) {
            JsonNode type = node.get(TAG_TYPE);
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

}
