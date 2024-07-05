import java.net.*;

public class InetExampleThree {
    public static void main(String[] args) {
        try {
            InetAddress ad = InetAddress.getLocalHost();
            System.out.println("Is Any Local Address : " + ad.isAnyLocalAddress());
            System.out.println("Is Loopback Address : " + ad.isLoopbackAddress());
            System.out.println("Is Site Local Address : " + ad.isSiteLocalAddress());
            System.out.println("Is Multicast Address : " + ad.isMulticastAddress());
            System.out.println("Is Multicast Global : " + ad.isMCGlobal());
            System.out.println("Is Multicast Node Local : " + ad.isMCNodeLocal());
            System.out.println("Is Multicast Link Local : " + ad.isMCLinkLocal());
        } catch (Exception e) {
            System.out.println("Exception Occurred.");
        }
    }
}
