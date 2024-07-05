
// Constructing URL object and getting protocol, host name, port number and file name from URL object.  
import java.net.*;

public class URLExampleOne {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com:8000/media/index.html");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
        } catch (MalformedURLException e) {
            System.out.println("Exception happened.");
        }
    }
}
