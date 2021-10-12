package ExamsWTF.Test28And29March2020.Test2;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();

        double price = 0;
        if (gender.equals("m")) {
            if (sport.equals("Gym")) {
                price = 42;
            }
            if (sport.equals("Boxing")) {
                price = 41;
            }
            if (sport.equals("Yoga")) {
                price = 45;
            }
            if (sport.equals("Zumba")) {
                price = 34;
            }
            if (sport.equals("Dances")) {
                price = 51;
            }
            if (sport.equals("Pilates")) {
                price = 39;
            }
        }
        if (gender.equals("f")) {
            if (sport.equals("Gym")) {
                price = 35;
            }
            if (sport.equals("Boxing")) {
                price = 37;
            }
            if (sport.equals("Yoga")) {
                price = 42;
            }
            if (sport.equals("Zumba")) {
                price = 31;
            }
            if (sport.equals("Dances")) {
                price = 53;
            }
            if (sport.equals("Pilates")) {
                price = 37;
            }
        }
        if (age <= 19) {
            price *= 0.8;
        }
        if (price <= sum) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - sum);
        }
    }
}
