package ExamsWTF.Test15And16June2019.Test2;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double priceDay = 0;
        if (destination.equals("Dubai")) {
            if (season.equals("Winter")) {
                priceDay = 45000 * 0.7;
            }
            if (season.equals("Summer")) {
                priceDay = 40000 * 0.7;
            }
        }
        if (destination.equals("Sofia")) {
            if (season.equals("Winter")) {
                priceDay = 17000 * 1.25;
            }
            if (season.equals("Summer")) {
                priceDay = 12500 * 1.25;
            }
        }
        if (destination.equals("London")) {
            if (season.equals("Winter")) {
                priceDay = 24000;
            }
            if (season.equals("Summer")) {
                priceDay = 20250;
            }
        }
        double sum = priceDay * days;
        if (sum <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("The director needs %.2f leva more!", sum - budget);
        }
    }
}
