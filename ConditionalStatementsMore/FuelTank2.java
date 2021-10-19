package ConditionalStatementsMore;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fuelName = scan.nextLine();
        double fuel = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();

        if (card.equals("Yes") && fuel >= 20 && fuel <= 25) {
            if (fuelName.equals("Gas")) {
                System.out.printf("%.2f lv.", fuel * (0.93 - 0.08) * 0.92);
            }
            if (fuelName.equals("Gasoline")) {
                System.out.printf("%.2f lv.", fuel * (2.22 - 0.18) * 0.92);
            }
            if (fuelName.equals("Diesel")) {
                System.out.printf("%.2f lv.", fuel * (2.33 - 0.12) * 0.92);
            }
        }
        if (card.equals("Yes") && fuel > 25) {
            if (fuelName.equals("Gas")) {
                System.out.printf("%.2f lv.", fuel * (0.93 - 0.08) * 0.9);
            }
            if (fuelName.equals("Gasoline")) {
                System.out.printf("%.2f lv.", fuel * (2.22 - 0.18) * 0.9);
            }
            if (fuelName.equals("Diesel")) {
                System.out.printf("%.2f lv.", fuel * (2.33 - 0.12) * 0.9);
            }
        }
        if (card.equals("No") && fuel >= 20 && fuel <= 25) {
            if (fuelName.equals("Gas")) {
                System.out.printf("%.2f lv.", fuel * 0.93 * 0.92);
            }
            if (fuelName.equals("Gasoline")) {
                System.out.printf("%.2f lv.", fuel * 2.22 * 0.92);
            }
            if (fuelName.equals("Diesel")) {
                System.out.printf("%.2f lv.", fuel * 2.33 * 0.92);
            }
        }
        if (card.equals("No") && fuel > 25) {
            if (fuelName.equals("Gas")) {
                System.out.printf("%.2f lv.", fuel * 0.93 * 0.9);
            }
            if (fuelName.equals("Gasoline")) {
                System.out.printf("%.2f lv.", fuel * 2.22 * 0.9);
            }
            if (fuelName.equals("Diesel")) {
                System.out.printf("%.2f lv.", fuel * 2.33 * 0.9);
            }
        }
        if (card.equals("Yes") && fuel < 20) {
            if (fuelName.equals("Gas")) {
                System.out.printf("%.2f lv.", fuel * (0.93 - 0.08));
            }
            if (fuelName.equals("Gasoline")) {
                System.out.printf("%.2f lv.", fuel * (2.22 - 0.18));
            }
            if (fuelName.equals("Diesel")) {
                System.out.printf("%.2f lv.", fuel * (2.33 - 0.12));
            }
        }
        if (card.equals("No") && fuel < 20) {
            if (fuelName.equals("Gas")) {
                System.out.printf("%.2f lv.", fuel * 0.93);
            }
            if (fuelName.equals("Gasoline")) {
                System.out.printf("%.2f lv.", fuel * 2.22);
            }
            if (fuelName.equals("Diesel")) {
                System.out.printf("%.2f lv.", fuel * 2.33);
            }
        }
        System.out.println();
    }
}
