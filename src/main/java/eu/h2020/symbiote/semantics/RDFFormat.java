package eu.h2020.symbiote.semantics;

import org.apache.commons.io.FilenameUtils;

/**
 * Enum containing list of understandable RDF formats.
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public enum RDFFormat {
    Turtle("TURTLE"),
    NTriples("NTRIPLES"),
    RDFXML("RDFXML"),
    N3("N3"),
    JSONLD("JSONLD");

    private final String name;

    RDFFormat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static RDFFormat fromFilenameExtension(String filename) {
        String extension = filename;
        if (filename.contains(FilenameUtils.EXTENSION_SEPARATOR_STR)) {
            extension = FilenameUtils.getExtension(filename);
        }
        switch (extension) {
            case "ttl":
                return RDFFormat.Turtle;
            case "nt":
                return RDFFormat.NTriples;
            case "rdf":
            case "owl":
            case "xml":
                return RDFFormat.RDFXML;
            case "n3":
                return RDFFormat.N3;
            case "jsonld":
                return RDFFormat.JSONLD;
            default:
                throw new IllegalArgumentException("unknown file extension '" + extension + "'");
        }
    }
}
