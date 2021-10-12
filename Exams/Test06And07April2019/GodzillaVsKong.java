package ExamsWTF.Test06And07April2019;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int walkingGentlemen = Integer.parseInt(scan.nextLine());
        double priceWear = Double.parseDouble(scan.nextLine());

        if (walkingGentlemen > 150) {
            priceWear *= 0.9;
        }
        double sum = budget * 0.1 + walkingGentlemen * priceWear;
        if (sum > budget) {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", sum - budget);
        } else {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - sum);
        }
    }
}
