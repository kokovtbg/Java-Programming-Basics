package ExamsWTF.Test02And03May2019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double fuel = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();

        double sum = 100 + fuel * 2.1;
        if (day.equals("Saturday")) {
            sum *= 0.9;
        }
        if (day.equals("Sunday")) {
            sum *= 0.8;
        }
        if (sum <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - sum);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", sum - budget);
        }
    }
}
