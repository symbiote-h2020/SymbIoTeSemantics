/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.h2020.symbiote.semantics;

import org.apache.jena.rdf.model.Resource;

/**
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class SPARQL {
    /**
     * Tags
     */
    public static final String TAG_NAME = "[NAME]";
    public static final String TAG_TYPE = "[TYPE]";

    /**
     * Queries
     */
    public static final String FIND_DUPLICATE_NAMES
            = "SELECT\n"
            + "DISTINCT ?name\n"
            + "WHERE {\n"
            + "	  ?x core:name ?name .\n"
            + "	  ?y core:name ?temp .\n"
            + "	  FILTER(?x != ?y && ?name = ?temp)\n"
            + "}";

    public static final String FIND_BY_NAME
            = "SELECT \n"
            + "DISTINCT ?s \n"
            + "WHERE {\n"
            + "    ?s core:name \"" + TAG_NAME + "\" .\n"
            + "}";
    
        public static final String FIND_BY_TYPE_AND_NAME
            = "SELECT \n"
            + "DISTINCT ?s \n"
            + "WHERE {\n"
            + "    ?s a <" + TAG_TYPE + "> .\n"
            + "    ?s core:name \"" + TAG_NAME + "\" .\n"
            + "}";
    
    public static String findResourceBy(String name) {
        return FIND_BY_NAME.replace(TAG_NAME, name);
    }
    
    public static String findResourceBy(Resource type, String name) {
        return FIND_BY_TYPE_AND_NAME
                .replace(TAG_TYPE, type.toString())
                .replace(TAG_NAME, name);
    }

    private SPARQL() {

    }
}
