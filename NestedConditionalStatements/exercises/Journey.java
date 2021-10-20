package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String destination = "";
        String campHotel = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                campHotel = "Camp";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", campHotel, budget * 0.3);
            }
            if (season.equals("winter")) {
                campHotel = "Hotel";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", campHotel, budget * 0.7);
            }
        }
        if (budget <= 1000 && budget > 100) {
            destination = "Balkans";
            if (season.equals("summer")) {
                campHotel = "Camp";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", campHotel, budget * 0.4);
            }
            if (season.equals("winter")) {
                campHotel = "Hotel";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", campHotel, budget * 0.8);
            }
        }
        if (budget > 1000) {
            destination = "Europe";
            if (season.equals("summer")) {
                campHotel = "Hotel";
                System.out.printf("Somewhere in %s", destination);
                System.out.println();
                System.out.printf("%s - %.2f", campHotel, budget * 0.9);
            }
            if (season.equals("winter")) {
                campHotel = "Hotel";
                System.out.printf("Somewhere in %s",  destination);
                System.out.println();
                System.out.printf("%s - %.2f", campHotel, budget * 0.9);
            }
        }
        System.out.println();
    }
}
