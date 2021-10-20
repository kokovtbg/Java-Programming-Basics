package NestedConditionalStatementsMore;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double multiply = 1;
        while (true) {
            double number = Double.parseDouble(scan.nextLine());
            if (number < 0) {
                System.out.println("Negative number!");
                break;
            } else {
                multiply = number * 2;
                System.out.printf("Result: %.2f", multiply);
                System.out.println();
            }
        }
    }
}

