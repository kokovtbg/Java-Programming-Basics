package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flower = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double price = 0;
        if (flower.equals("Roses") && number <= 80) {
            price = number * 5;
        }
        if (flower.equals("Roses") && number > 80) {
            price = number * 5 * 0.9;
        }
        if (flower.equals("Dahlias") && number <= 90) {
            price = number * 3.8;
        }
        if (flower.equals("Dahlias") && number > 90) {
            price = number * 3.8 * 0.85;
        }
        if (flower.equals("Tulips") && number <= 80) {
            price = number * 2.8;
        }
        if (flower.equals("Tulips") && number > 80) {
            price = number * 2.8 * 0.85;
        }
        if (flower.equals("Narcissus") && number >= 120) {
            price = number * 3;
        }
        if (flower.equals("Narcissus") && number < 120) {
            price = number * 3 * 1.15;
        }
        if (flower.equals("Gladiolus") && number >= 80) {
            price = number * 2.5;
        }
         if (flower.equals("Gladiolus") && number < 80) {
            price = number * 2.5 * 1.2;
        }
         if (price <= budget) {
             System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, budget - price);
         } else {
             System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
         }
        System.out.println();
    }
}
