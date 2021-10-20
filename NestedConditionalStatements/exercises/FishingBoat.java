package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishMan = Integer.parseInt(scan.nextLine());

        if (season.equals("Spring") && fishMan <= 6 && fishMan % 2 == 0) {
            double price = 3000 * 0.9 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Spring") && fishMan <= 6 && fishMan % 2 != 0) {
            double price = 3000 * 0.9;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Spring") && fishMan >= 7 && fishMan <= 11 && fishMan % 2 == 0) {
            double price = 3000 * 0.85 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Spring") && fishMan >= 7 && fishMan <= 11 && fishMan % 2 != 0) {
            double price = 3000 * 0.85;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Spring") && fishMan >= 12 && fishMan % 2 == 0) {
            double price = 3000 * 0.75 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Spring") && fishMan >= 12 && fishMan % 2 != 0) {
            double price = 3000 * 0.75;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }

        if (season.equals("Summer") && fishMan <= 6 && fishMan % 2 == 0) {
            double price = 4200 * 0.9 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Summer") && fishMan <= 6 && fishMan % 2 != 0) {
            double price = 4200 * 0.9;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Summer") && fishMan >= 7 && fishMan <= 11 && fishMan % 2 == 0) {
            double price = 4200 * 0.85 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Summer") && fishMan >= 7 && fishMan <= 11 && fishMan % 2 != 0) {
            double price = 4200 * 0.85;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Summer") && fishMan >= 12 && fishMan % 2 == 0) {
            double price = 4200 * 0.75 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Summer") && fishMan >= 12 && fishMan % 2 != 0) {
            double price = 4200 * 0.75;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }

        if (season.equals("Autumn") && fishMan <= 6) {
            double price = 4200 * 0.9;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Autumn") && fishMan >= 7 && fishMan <= 11) {
            double price = 4200 * 0.85;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Autumn") && fishMan >= 12) {
            double price = 4200 * 0.75;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }

        if (season.equals("Winter") && fishMan <= 6 && fishMan % 2 == 0) {
            double price = 2600 * 0.9 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Winter") && fishMan <= 6 && fishMan % 2 != 0) {
            double price = 2600 * 0.9;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Winter") && fishMan >= 7 && fishMan <= 11 && fishMan % 2 == 0) {
            double price = 2600 * 0.85 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Winter") && fishMan >= 7 && fishMan <= 11 && fishMan % 2 != 0) {
            double price = 2600 * 0.85;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Winter") && fishMan >= 12 && fishMan % 2 == 0) {
            double price = 2600 * 0.75 * 0.95;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        if (season.equals("Winter") && fishMan >= 12 && fishMan % 2 != 0) {
            double price = 2600 * 0.75;
            if (price <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }
        System.out.println();
    }
}
