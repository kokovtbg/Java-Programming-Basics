package NestedConditionalStatementsMore;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String location = "";
        String place = "";
        if (budget <= 1000) {
            place = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                System.out.printf("%s - %s - %.2f", location, place, budget * 0.65);
            }
            if (season.equals("Winter")) {
                location = "Morocco";
                System.out.printf("%s - %s - %.2f", location, place, budget * 0.45);
            }
        }
        if (budget > 1000 && budget <= 3000) {
            place = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                System.out.printf("%s - %s - %.2f", location, place, budget * 0.8);
            }
            if (season.equals("Winter")) {
                location = "Morocco";
                System.out.printf("%s - %s - %.2f", location, place, budget * 0.6);
            }
        }
        if (budget > 3000) {
            place = "Hotel";
            if (season.equals("Summer")) {
                location = "Alaska";
                System.out.printf("%s - %s - %.2f", location, place, budget * 0.9);
            }
            if (season.equals("Winter")) {
                location = "Morocco";
                System.out.printf("%s - %s - %.2f", location, place, budget * 0.9);
            }
        }
        System.out.println();
    }
}
