package ExamsWTF.Test06And07July2019.Test2;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        String typePackage = scan.nextLine();
        String vIP = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double price = 0;
        boolean vseOK = true;
        if (city.equals("Bansko") || city.equals("Borovets")) {
            if (typePackage.equals("withEquipment")) {
                price = 100;
                if (vIP.equals("yes")) {
                    price *= 0.9;
                }
            }
            if (typePackage.equals("noEquipment")) {
                price = 80;
                if (vIP.equals("yes")) {
                    price *= 0.95;
                }
            }
        }
        if (city.equals("Varna") || city.equals("Burgas")) {
            if (typePackage.equals("withBreakfast")) {
                price = 130;
                if (vIP.equals("yes")) {
                    price *= 0.88;
                }
            }
            if (typePackage.equals("noBreakfast")) {
                price = 100;
                if (vIP.equals("yes")) {
                    price *= 0.93;
                }
            }
        }
        if (days > 7) {
            days -= 1;
        }
        if (days < 1) {
            vseOK = false;
            System.out.printf("Days must be positive number!%n");
        }
        if (!city.equals("Bansko") && !city.equals("Borovets") && !city.equals("Varna") && !city.equals("Burgas")) {
            vseOK = false;
            System.out.printf("Invalid input!%n");
        }
        if (!typePackage.equals("withEquipment") && !typePackage.equals("noEquipment") && !typePackage.equals("withBreakfast") && !typePackage.equals("noBreakfast")) {
            vseOK = false;
            System.out.printf("Invalid input!%n");
        }
        double sum = price * days;
        if (vseOK) {
            System.out.printf("The price is %.2flv! Have a nice time!", sum);
        }
    }
}
