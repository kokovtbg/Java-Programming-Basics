package NestedConditionalStatementsMore;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int people = Integer.parseInt(scan.nextLine());

        if (category.equals("VIP") && people >= 1 && people <= 4) {
            double price = 499.99 * people;
            double budgetMinus = budget * 0.25;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("VIP") && people >= 5 && people <= 9) {
            double price = 499.99 * people;
            double budgetMinus = budget * 0.4;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("VIP") && people >= 10 && people <= 24) {
            double price = 499.99 * people;
            double budgetMinus = budget * 0.5;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("VIP") && people >= 25 && people <= 49) {
            double price = 499.99 * people;
            double budgetMinus = budget * 0.6;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("VIP") && people >= 50) {
            double price = 499.99 * people;
            double budgetMinus = budget * 0.75;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("Normal") && people >= 1 && people <= 4) {
            double price = 249.99 * people;
            double budgetMinus = budget * 0.25;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("Normal") && people >= 5 && people <= 9) {
            double price = 249.99 * people;
            double budgetMinus = budget * 0.4;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("Normal") && people >= 10 && people <= 24) {
            double price = 249.99 * people;
            double budgetMinus = budget * 0.5;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("Normal") && people >= 25 && people <= 49) {
            double price = 249.99 * people;
            double budgetMinus = budget * 0.6;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        if (category.equals("Normal") && people >= 50) {
            double price = 249.99 * people;
            double budgetMinus = budget * 0.75;
            if (price <= budgetMinus) {
                System.out.printf("Yes! You have %.2f leva left.", budgetMinus - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budgetMinus);
            }
        }
        System.out.println();
    }
}
