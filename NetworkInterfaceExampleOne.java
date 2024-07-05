import java.net.*;

public class NetworkInterfaceExampleOne {
    public static void main(String[] args) throws SocketException {
        try {
            InetAddress ads = InetAddress.getLocalHost();
            NetworkInterface ni = NetworkInterface.getByInetAddress(ads);
            if (ni != null) {
                System.out.println("Interface Exists.");
            } else {
                System.out.println("Interface Does Not Exists.");
            }
        } catch (Exception e) {
            System.out.println("Exception happened.");
        }
    }
}
