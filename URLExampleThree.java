
import java.net.*;
import java.io.*;

public class URLExampleThree {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://pokhrelgopal.com.np/projects?name=java&author=gopal");
        System.out.println("Scheme: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("File: " + url.getFile());
        System.out.println("Ref: " + url.getRef());
    }
}
