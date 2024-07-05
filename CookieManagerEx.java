import java.net.*;
import java.util.*;

public class CookieManagerEx {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();

        HttpCookie cookie1 = new HttpCookie("name", "gopal");
        HttpCookie cookie2 = new HttpCookie("address", "kathmandu");

        URI uri = URI.create("https://www.nepal.com:4000/nation?state=bagmati");

        cookieStore.add(uri, cookie1);
        cookieStore.add(uri, cookie2);

        // Get all cookies
        List<HttpCookie> cookies = cookieStore.getCookies();
        for (HttpCookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName());
            System.out.println("Value: " + cookie.getValue());
            System.out.println("Domain: " + cookie.getDomain());
            System.out.println("Path: " + cookie.getPath());
            System.out.println("Max Age: " + cookie.getMaxAge());
            System.out.println("Secure: " + cookie.getSecure());
            System.out.println("HttpOnly: " + cookie.isHttpOnly());
            System.out.println("Discard: " + cookie.getDiscard());
            System.out.println("Comment: " + cookie.getComment());
            System.out.println("Port list: " + cookie.getPortlist());
            System.out.println("Version: " + cookie.getVersion());
            System.out.println("Expired: " + cookie.hasExpired());
            System.out.println();
        }
    }
}
