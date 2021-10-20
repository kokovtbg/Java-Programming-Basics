package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        double p = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        if (year.equals("leap")) {
            double play = ((48 - h) * 3.0 / 4 + h + p * 2.0 / 3) * 1.15;
            System.out.printf("%.0f", Math.floor(play));
            System.out.println();
        }
        if (year.equals("normal")) {
            double play = (48 - h) * 3.0 / 4 + h + p * 2.0 / 3;
            System.out.printf("%.0f", Math.floor(play));
            System.out.println();
        }
    }
}
