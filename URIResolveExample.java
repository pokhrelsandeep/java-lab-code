import java.net.URI;
import java.net.URISyntaxException;

public class URIResolveExample {
    public static void main(String[] args) {
        try {
            URI baseURI = new URI("https://www.example.com/path/to/");

            URI relativeURI = new URI("resource?query=example#fragment");

            URI resolvedURI = baseURI.resolve(relativeURI);

            System.out.println("Base URI: " + baseURI);
            System.out.println("Relative URI: " + relativeURI);
            System.out.println("Resolved URI: " + resolvedURI);

        } catch (URISyntaxException e) {
            System.out.println("URISyntaxException occurred.");
            e.printStackTrace();
        }
    }
}
