package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeProjection = scan.nextLine();
        double r = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());

        if (typeProjection.equals("Premiere")) {
            System.out.printf("%.2f", r * c * 12);
        }
        if (typeProjection.equals("Normal")) {
            System.out.printf("%.2f", r * c * 7.5);
        }
        if (typeProjection.equals("Discount")) {
            System.out.printf("%.2f", r * c * 5);
        }
        System.out.println(" leva");
    }
}
