
// Program to list out all interfaces.
import java.net.*;
import java.util.*;

public class NetworkInterfaceExampleTwo {
    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> ni = NetworkInterface.getNetworkInterfaces();
        while (ni.hasMoreElements()) {
            NetworkInterface inf = ni.nextElement();
            System.out.println("Interface : " + inf);
        }
    }
}
