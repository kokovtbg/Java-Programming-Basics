package ExamsWTF.Test09And10March2019.Test1;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String device = scan.nextLine();

        double points = 0;
        if (country.equals("Russia")) {
            if (device.equals("ribbon")) {
                points = 18.500;
            }
            if (device.equals("hoop")) {
                points = 19.100;
            }
            if (device.equals("rope")) {
                points = 18.600;
            }
        }
        if (country.equals("Bulgaria")) {
            if (device.equals("ribbon")) {
                points = 19.000;
            }
            if (device.equals("hoop")) {
                points = 19.300;
            }
            if (device.equals("rope")) {
                points = 18.900;
            }
        }
        if (country.equals("Italy")) {
            if (device.equals("ribbon")) {
                points = 18.700;
            }
            if (device.equals("hoop")) {
                points = 18.800;
            }
            if (device.equals("rope")) {
                points = 18.850;
            }
        }
        System.out.printf("The team of %s get %.3f on %s.%n", country, points, device);
        System.out.printf("%.2f%%", (20 - points) / 20 * 100);
    }
}
