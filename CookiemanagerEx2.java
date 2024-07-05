import java.net.*;
import java.util.*;

public class CookiemanagerEx2 {
    public static void main(String[] args) {
        try {
            String uri = "https://httpbin.org/cookies/set?name=value";
            CookieManager cm = new CookieManager();
            CookieHandler.setDefault(cm);
            CookiePolicy cp = CookiePolicy.ACCEPT_ALL;
            cm.setCookiePolicy(cp);

            URL url = new URL(uri);
            URLConnection conn = url.openConnection();
            conn.connect();

            CookieStore cs = cm.getCookieStore();
            List<HttpCookie> cookies = cs.getCookies();
            for (HttpCookie cookie : cookies) {
                System.out.println("Name: " + cookie.getName());
                System.out.println("Value: " + cookie.getValue());
                System.out.println("Domain: " + cookie.getDomain());
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred.");
            e.printStackTrace();
        }
    }
}
