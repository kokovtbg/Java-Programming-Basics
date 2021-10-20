package NestedConditionalStatements.lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                System.out.printf("%.2f", amount * 2.5);
                System.out.println();
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", amount * 1.2);
                System.out.println();
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", amount * 0.85);
                System.out.println();
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", amount * 1.45);
                System.out.println();
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", amount * 2.7);
                System.out.println();
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", amount * 5.5);
                System.out.println();
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", amount * 3.85);
                System.out.println();
            } else {
                System.out.println("error");
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                System.out.printf("%.2f", amount * 2.7);
                System.out.println();
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", amount * 1.25);
                System.out.println();
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", amount * 0.9);
                System.out.println();
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", amount * 1.6);
                System.out.println();
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", amount * 3);
                System.out.println();
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", amount * 5.6);
                System.out.println();
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", amount * 4.2);
                System.out.println();
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}