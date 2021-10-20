package NestedConditionalStatementsMore;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        String group = scan.nextLine();
        int numberPeople = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());

        String sport = "";
        double price = 0;
        if (season.equals("Winter") && group.equals("girls")) {
            sport = "Gymnastics";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 9.6 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 9.6 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 9.6 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 9.6;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
        if (season.equals("Winter") && group.equals("boys")) {
            sport = "Judo";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 9.6 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 9.6 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 9.6 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 9.6;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
        if (season.equals("Winter") && group.equals("mixed")) {
            sport = "Ski";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 10 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 10 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 10 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 10;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
        if (season.equals("Spring") && group.equals("girls")) {
            sport = "Athletics";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 7.2 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 7.2 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 7.2 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 7.2;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
        if (season.equals("Spring") && group.equals("boys")) {
            sport = "Tennis";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 7.2 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 7.2 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 7.2 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 7.2;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
        if (season.equals("Spring") && group.equals("mixed")) {
            sport = "Cycling";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 9.5 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 9.5 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 9.5 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 9.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
        if (season.equals("Summer") && group.equals("girls")) {
            sport = "Volleyball";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 15 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 15 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 15 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 15;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
        if (season.equals("Summer") && group.equals("boys")) {
            sport = "Football";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 15 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 15 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 15 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 15;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
        if (season.equals("Summer") && group.equals("mixed")) {
            sport = "Swimming";
            if (numberPeople >= 50) {
                price = numberPeople * nights * 20 * 0.5;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 20 && numberPeople < 50) {
                price = numberPeople * nights * 20 * 0.85;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople >= 10 && numberPeople < 20) {
                price = numberPeople * nights * 20 * 0.95;
                System.out.printf("%s %.2f lv.", sport, price);
            }
            if (numberPeople < 10) {
                price = numberPeople * nights * 20;
                System.out.printf("%s %.2f lv.", sport, price);
            }
        }
    }
}
