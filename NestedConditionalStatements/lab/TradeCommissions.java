package NestedConditionalStatements.lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double s = Double.parseDouble(scan.nextLine());

        if (city.equals("Sofia") && s >= 0 && s <= 500) {
            System.out.printf("%.2f", s * 0.05);
            System.out.println();
        }
        if (city.equals("Sofia") && s > 500 && s <= 1000) {
            System.out.printf("%.2f", s * 0.07);
            System.out.println();
        }
        if (city.equals("Sofia") && s > 1000 && s <= 10000) {
            System.out.printf("%.2f", s * 0.08);
            System.out.println();
        }
        if (city.equals("Sofia") && s > 10000) {
            System.out.printf("%.2f", s * 0.12);
            System.out.println();
        }
        if (city.equals("Sofia") && s < 0) {
            System.out.println("error");
        }
        if (city.equals("Varna") && s >= 0 && s <= 500) {
            System.out.printf("%.2f", s * 0.045);
            System.out.println();
        }
        if (city.equals("Varna") && s > 500 && s <= 1000) {
            System.out.printf("%.2f", s * 0.075);
            System.out.println();
        }
        if (city.equals("Varna") && s > 1000 && s <= 10000) {
            System.out.printf("%.2f", s * 0.1);
            System.out.println();
        }
        if (city.equals("Varna") && s > 10000) {
            System.out.printf("%.2f", s * 0.13);
            System.out.println();
        }
        if (city.equals("Varna") && s < 0) {
            System.out.println("error");
        }
        if (city.equals("Plovdiv") && s >= 0 && s <= 500) {
            System.out.printf("%.2f", s * 0.055);
            System.out.println();
        }
        if (city.equals("Plovdiv") && s > 500 && s <= 1000) {
            System.out.printf("%.2f", s * 0.08);
            System.out.println();
        }
        if (city.equals("Plovdiv") && s > 1000 && s <= 10000) {
            System.out.printf("%.2f", s * 0.12);
            System.out.println();
        }
        if (city.equals("Plovdiv") && s > 10000) {
            System.out.printf("%.2f", s * 0.145);
            System.out.println();
        }
        if (city.equals("Plovdiv") && s < 0) {
            System.out.println("error");
        }
        if (!city.equals("Sofia") && !city.equals("Plovdiv") && !city.equals("Varna")) {
            System.out.println("error");
        }
    }
}