
// Reading contents of web page using URL class
import java.net.*;
import java.io.*;

public class URLExampleTwo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://pokhrelgopal.com.np/");
        InputStream is = url.openStream();
        int i;
        while ((i = is.read()) != -1) {
            System.out.print((char) i);
        }
        is.close();
    }
}
