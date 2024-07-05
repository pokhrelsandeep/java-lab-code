import java.io.*;
import java.net.*;

public class URLEncodeDecodeExample {
    public static void main(String[] args) {
        try {
            String original = "https://www.google.com/search?q=java tutorial";
            String encoded = URLEncoder.encode(original, "UTF-8");
            System.out.println("Encoded: " + encoded);
            String decoded = URLDecoder.decode(encoded, "UTF-8");
            System.out.println("Decoded: " + decoded);
        } catch (UnsupportedEncodingException e) {
            System.out.println("UnsupportedEncodingException occurred.");
            e.printStackTrace();
        }
    }
}
