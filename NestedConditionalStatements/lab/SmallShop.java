package NestedConditionalStatements.lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.printf("%f", amount * 0.5);
            }
            if (product.equals("water")) {
                System.out.printf("%f", amount * 0.8);
            }
            if (product.equals("beer")) {
                System.out.printf("%f", amount * 1.2);
            }
            if (product.equals("sweets")) {
                System.out.printf("%f", amount * 1.45);
            }
            if (product.equals("peanuts")) {
                System.out.printf("%f", amount * 1.6);
            }
        }
        if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.printf("%f", amount * 0.4);
            }
            if (product.equals("water")) {
                System.out.printf("%f", amount * 0.7);
            }
            if (product.equals("beer")) {
                System.out.printf("%f", amount * 1.15);
            }
            if (product.equals("sweets")) {
                System.out.printf("%f", amount * 1.3);
            }
            if (product.equals("peanuts")) {
                System.out.printf("%f", amount * 1.5);
            }
        }
        if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.printf("%f", amount * 0.45);
            }
            if (product.equals("water")) {
                System.out.printf("%f", amount * 0.7);
            }
            if (product.equals("beer")) {
                System.out.printf("%f", amount * 1.1);
            }
            if (product.equals("sweets")) {
                System.out.printf("%f", amount * 1.35);
            }
            if (product.equals("peanuts")) {
                System.out.printf("%f", amount * 1.55);
            }
        }
        System.out.println();
    }
}
