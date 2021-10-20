package NestedConditionalStatementsMore;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String classCar = "";
        String typeCar = "";
        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                typeCar = "Cabrio";
                System.out.printf("%s", classCar);
                System.out.println();
                System.out.printf("%s - %.2f", typeCar, budget * 0.35);
            }
            if (season.equals("Winter")) {
                typeCar = "Jeep";
                System.out.printf("%s", classCar);
                System.out.println();
                System.out.printf("%s - %.2f", typeCar, budget * 0.65);
            }
        }
        if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
            if (season.equals("Summer")) {
                typeCar = "Cabrio";
                System.out.printf("%s", classCar);
                System.out.println();
                System.out.printf("%s - %.2f", typeCar, budget * 0.45);
            }
            if (season.equals("Winter")) {
                typeCar = "Jeep";
                System.out.printf("%s", classCar);
                System.out.println();
                System.out.printf("%s - %.2f", typeCar, budget * 0.8);
            }
        }
        if (budget > 500) {
            classCar = "Luxury class";
            if (season.equals("Summer")) {
                typeCar = "Jeep";
                System.out.printf("%s", classCar);
                System.out.println();
                System.out.printf("%s - %.2f", typeCar, budget * 0.9);
            }
            if (season.equals("Winter")) {
                typeCar = "Jeep";
                System.out.printf("%s", classCar);
                System.out.println();
                System.out.printf("%s - %.2f", typeCar, budget * 0.9);
            }
        }
    }
}
