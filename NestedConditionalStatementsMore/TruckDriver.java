package NestedConditionalStatementsMore;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        double kmMonth = Double.parseDouble(scan.nextLine());

        if (season.equals("Spring") || season.equals("Autumn")) {
            if (kmMonth <= 5000) {
                System.out.printf("%.2f", kmMonth * 0.75 * 4 * 0.9);
            }
            if (kmMonth > 5000 && kmMonth <= 10000) {
                System.out.printf("%.2f", kmMonth * 0.95 * 4 * 0.9);
            }
            if (kmMonth > 10000 && kmMonth <= 20000) {
                System.out.printf("%.2f", kmMonth * 1.45 * 4 * 0.9);
            }
        }
        if (season.equals("Summer")) {
            if (kmMonth <= 5000) {
                System.out.printf("%.2f", kmMonth * 0.9 * 4 * 0.9);
            }
            if (kmMonth > 5000 && kmMonth <= 10000) {
                System.out.printf("%.2f", kmMonth * 1.1 * 4 * 0.9);
            }
            if (kmMonth > 10000 && kmMonth <= 20000) {
                System.out.printf("%.2f", kmMonth * 1.45 * 4 * 0.9);
            }
        }
        if (season.equals("Winter")) {
            if (kmMonth <= 5000) {
                System.out.printf("%.2f", kmMonth * 1.05 * 4 * 0.9);
            }
            if (kmMonth > 5000 && kmMonth <= 10000) {
                System.out.printf("%.2f", kmMonth * 1.25 * 4 * 0.9);
            }
            if (kmMonth > 10000 && kmMonth <= 20000) {
                System.out.printf("%.2f", kmMonth * 1.45 * 4 * 0.9);
            }
        }
    }
}
