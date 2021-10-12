package ExamsWTF.Test20And21April2019.Test1;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        String dates = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        int costNight = 0;
        if (destination.equals("France")) {
            if (dates.equals("21-23")) {
                costNight = 30;
            }
            if (dates.equals("24-27")) {
                costNight = 35;
            }
            if (dates.equals("28-31")) {
                costNight = 40;
            }
        }
        if (destination.equals("Italy")) {
            if (dates.equals("21-23")) {
                costNight = 28;
            }
            if (dates.equals("24-27")) {
                costNight = 32;
            }
            if (dates.equals("28-31")) {
                costNight = 39;
            }
        }
        if (destination.equals("Germany")) {
            if (dates.equals("21-23")) {
                costNight = 32;
            }
            if (dates.equals("24-27")) {
                costNight = 37;
            }
            if (dates.equals("28-31")) {
                costNight = 43;
            }
        }
        double cost = costNight * nights;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, cost);
    }
}
