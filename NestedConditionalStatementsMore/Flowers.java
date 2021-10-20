package NestedConditionalStatementsMore;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int tulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holiday = scan.nextLine();

        if (holiday.equals("Y") && season.equals("Spring") && tulips >= 7 && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 1.15 * 0.95 + 2);
        }
        if (holiday.equals("Y") && season.equals("Spring") && tulips < 7 && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 1.15 + 2);
        }
        if (holiday.equals("Y") && season.equals("Spring") && tulips >= 7 && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 1.15 * 0.95 * 0.8 + 2);
        }
        if (holiday.equals("Y") && season.equals("Spring") && tulips < 7 && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 1.15 * 0.8 + 2);
        }
        if (holiday.equals("Y") && season.equals("Summer") && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 1.15 + 2);
        }
        if (holiday.equals("Y") && season.equals("Summer") && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 1.15 * 0.8 + 2);
        }
        if (holiday.equals("Y") && season.equals("Autumn") && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 1.15 + 2);
        }
        if (holiday.equals("Y") && season.equals("Autumn") && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 1.15 * 0.8 + 2);
        }
        if (holiday.equals("Y") && season.equals("Winter") && roses >= 10 && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 1.15 * 0.9 + 2);
        }
        if (holiday.equals("Y") && season.equals("Winter") && roses < 10 && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 1.15 + 2);
        }
        if (holiday.equals("Y") && season.equals("Winter") && roses >= 10 && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 1.15 * 0.9 * 0.8 + 2);
        }
        if (holiday.equals("Y") && season.equals("Winter") && roses < 10 && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 1.15 * 0.8 + 2);
        }


        if (holiday.equals("N") && season.equals("Spring") && tulips >= 7 && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 0.95 + 2);
        }
        if (holiday.equals("N") && season.equals("Spring") && tulips < 7 && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) + 2);
        }
        if (holiday.equals("N") && season.equals("Spring") && tulips >= 7 && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 0.95 * 0.8 + 2);
        }
        if (holiday.equals("N") && season.equals("Spring") && tulips < 7 && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 0.8 + 2);
        }
        if (holiday.equals("N") && season.equals("Summer") && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) + 2);
        }
        if (holiday.equals("N") && season.equals("Summer") && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 2 + roses * 4.1 + tulips * 2.5) * 0.8 + 2);
        }
        if (holiday.equals("N") && season.equals("Autumn") && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) + 2);
        }
        if (holiday.equals("N") && season.equals("Autumn") && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 0.8 + 2);
        }
        if (holiday.equals("N") && season.equals("Winter") && roses >= 10 && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 0.9 + 2);
        }
        if (holiday.equals("N") && season.equals("Winter") && roses < 10 && (chrysanthemums + roses + tulips) < 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) + 2);
        }
        if (holiday.equals("N") && season.equals("Winter") && roses >= 10 && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 0.9 * 0.8 + 2);
        }
        if (holiday.equals("N") && season.equals("Winter") && roses < 10 && (chrysanthemums + roses + tulips) >= 20) {
            System.out.printf("%.2f", (chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15) * 0.8 + 2);
        }
    }
}
