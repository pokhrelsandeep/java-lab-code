// Getter Methods

import java.net.*;
import java.util.*;

public class NetworkInterfaceExampleThree {
    public static void main(String[] args) throws SocketException {
        NetworkInterface ni = NetworkInterface.getByName("eth24");
        System.out.println(ni.getName());
        System.out.println(ni.getDisplayName());
        Enumeration<InetAddress> inetAddresses = ni.getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress ia = inetAddresses.nextElement();
            System.out.println(ia.getHostAddress());
        }
    }
}
