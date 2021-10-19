package ConditionalStatementsMore;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameFuel = scan.nextLine();
        double fuel = Double.parseDouble(scan.nextLine());

        if (nameFuel.equals("Diesel") || nameFuel.equals("Gasoline") || nameFuel.equals("Gas")) {
            if (fuel >= 25) {
                System.out.printf("You have enough %s.", nameFuel.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", nameFuel.toLowerCase());
            }
        } else {
            System.out.print("Invalid fuel!");
        }
        System.out.println();
    }
}
