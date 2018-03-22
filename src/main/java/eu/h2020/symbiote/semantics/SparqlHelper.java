package eu.h2020.symbiote.semantics;

import org.apache.jena.rdf.model.Resource;

/**
 * Helper class for SPARQL queries
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class SparqlHelper {

    /**
     * Returns query for finding resource by name
     *
     * @param name name of the resource
     * @return SPARQL select query finding resource by name
     */
    public static String getQueryFindResourceBy(String name) {
        return FIND_BY_NAME.replace(TAG_NAME, name);
    }

    /**
     * Returns query for finding resource by type and name
     *
     * @param type type of the resource, i.e. a RDF class
     * @param name name of the resource
     * @return SPARQL select query finding resource by type and name
     */
    public static String getQueryFindResourceBy(Resource type, String name) {
        return FIND_BY_TYPE_AND_NAME
                .replace(TAG_TYPE, type.toString())
                .replace(TAG_NAME, name);
    }

    /**
     * Tags
     */
    private static final String TAG_NAME = "[NAME]";
    private static final String TAG_TYPE = "[TYPE]";

    /**
     * Queries
     */
    private static final String FIND_DUPLICATE_NAMES
            = "SELECT\n"
            + "DISTINCT ?name\n"
            + "WHERE {\n"
            + "	  ?x core:name ?name .\n"
            + "	  ?y core:name ?temp .\n"
            + "	  FILTER(?x != ?y && ?name = ?temp)\n"
            + "}";

    private static final String FIND_BY_NAME
            = "SELECT \n"
            + "DISTINCT ?s \n"
            + "WHERE {\n"
            + "    ?s core:name \"" + TAG_NAME + "\" .\n"
            + "}";

    private static final String FIND_BY_TYPE_AND_NAME
            = "SELECT \n"
            + "DISTINCT ?s \n"
            + "WHERE {\n"
            + "    ?s a <" + TAG_TYPE + "> .\n"
            + "    ?s core:name \"" + TAG_NAME + "\" .\n"
            + "}";

    private SparqlHelper() {

    }
}
