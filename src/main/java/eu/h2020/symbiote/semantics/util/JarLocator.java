package eu.h2020.symbiote.semantics.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.jena.util.Locator;
import org.apache.jena.util.TypedStream;

/**
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class JarLocator implements Locator {

    @Override
    public String getName() {
        return "LocatorJar";
    }

    @Override
    public TypedStream open(String filenameOrURI) {
        if (!filenameOrURI.startsWith("jar:")) {
            return null;
        }
        try {
            URL url = new URL(filenameOrURI);
            InputStream is = url.openStream();
            return new TypedStream(is);
        } catch (IOException ex) {
            return null;
        }
    }

}
