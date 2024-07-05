import java.net.*;

public class InetExampleOne {
    public static void main(String[] args) {
        try {
            InetAddress ads = InetAddress.getLocalHost();
            byte[] adByte = ads.getAddress();
            String ipType;

            if (adByte.length == 4) {
                ipType = "IPv4";
            } else if (adByte.length == 16) {
                ipType = "IPv6";
            } else {
                ipType = "Unknown IP format";
            }

            System.out.println("IP Type: " + ipType);
        } catch (Exception e) {
            System.out.println("Exception Occurred.");
        }
    }
}
