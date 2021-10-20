package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        String symbol = scan.nextLine();

        if (symbol.equals("+")) {
            double sum = n1 + n2;
            boolean even = sum % 2 == 0;
            if (even) {
                System.out.printf("%.0f %s %.0f = %.0f - even", n1, symbol, n2, sum);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", n1, symbol, n2, sum);
            }
        }
        if (symbol.equals("-")) {
            double difference = n1 - n2;
            boolean even = difference % 2 == 0;
            if (even) {
                System.out.printf("%.0f %s %.0f = %.0f - even", n1, symbol, n2, difference);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", n1, symbol, n2, difference);
            }
        }
        if (symbol.equals("*")) {
            double multiplied = n1 * n2;
            boolean even = multiplied % 2 == 0;
            if (even) {
                System.out.printf("%.0f %s %.0f = %.0f - even", n1, symbol, n2, multiplied);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", n1, symbol, n2, multiplied);
            }
        }
        if (symbol.equals("/") && n2 != 0) {
            double divided = n1 / n2;
            System.out.printf("%.0f %s %.0f = %.2f", n1, symbol, n2, divided);
        } else if (symbol.equals("/") || symbol.equals("%") && n2 == 0) {
            System.out.printf("Cannot divide %.0f by zero", n1);
        }
        if (symbol.equals("%") && n2 != 0) {
            double module = n1 % n2;
            System.out.printf("%.0f %s %.0f = %.0f", n1, symbol, n2, module);
        }
        System.out.println();
    }
}
