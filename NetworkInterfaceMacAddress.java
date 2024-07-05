// printing mac address

import java.net.*;

public class NetworkInterfaceMacAddress {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        InetAddress ia = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(ia);
        byte[] mac = ni.getHardwareAddress();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        }
        System.out.println(sb.toString());
    }
}
