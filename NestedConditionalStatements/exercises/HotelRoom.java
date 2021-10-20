package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        double nights = Double.parseDouble(scan.nextLine());

        if (month.equals("May") || month.equals("October")) {
            if (nights <= 7) {
                System.out.printf("Apartment: %.2f lv.", nights * 65);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", nights * 50);
            } else if (nights > 7 && nights <= 14) {
                System.out.printf("Apartment: %.2f lv.", nights * 65);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", nights * 50 * 0.95);
            } else if (nights > 14) {
                System.out.printf("Apartment: %.2f lv.", nights * 65 * 0.9);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", nights * 50 * 0.7);
            }
        }
        if (month.equals("June") || month.equals("September")) {
            if (nights <= 7) {
                System.out.printf("Apartment: %.2f lv.", nights * 68.7);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", nights * 75.2);
            } else if (nights > 7 && nights <= 14) {
                System.out.printf("Apartment: %.2f lv.", nights * 68.7);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", nights * 75.2);
            } else if (nights > 14) {
                System.out.printf("Apartment: %.2f lv.", nights * 68.7 * 0.9);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", nights * 75.2 * 0.8);
            }
        }
        if (month.equals("July") || month.equals("August")) {
            if (nights <= 14) {
                System.out.printf("Apartment: %.2f lv.", nights * 77);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", nights * 76);
            } else if (nights > 14) {
                System.out.printf("Apartment: %.2f lv.", nights * 77 * 0.9);
                System.out.println();
                System.out.printf("Studio: %.2f lv.", nights * 76);
            }
        }
        System.out.println();
    }
}
