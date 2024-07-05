import java.net.URI;
import java.net.URISyntaxException;

public class URIExampleOne {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.google.com:8000/media/index.html?name=java&author=gopal#section1");

            System.out.println("URI: " + uri);

            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());

        } catch (URISyntaxException e) {
            System.out.println("URISyntaxException occurred.");
            e.printStackTrace();
        }
    }
}
