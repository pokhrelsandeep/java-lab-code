import java.net.*;

public class InetExampleTwo {
    public static void main(String[] args) {
        try {
            InetAddress ad1 = InetAddress.getByName("www.google.com");
            InetAddress ad2 = InetAddress.getByName("www.facebook.com");

            if (ad1.equals(ad2)) {
                System.out.println("Both addresses are Equal.");
            } else {
                System.out.println("Both addresses are not Equal.");
            }

        } catch (Exception e) {
            System.out.println("Exception Occurred.");
        }
    }
}
