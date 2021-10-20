package NestedConditionalStatements.lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double days = Double.parseDouble(scan.nextLine());
        String typeRoom = scan.nextLine();
        String mark = scan.nextLine();

        if (typeRoom.equals("room for one person") && days < 10 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 18 * 1.25);
            System.out.println();
        }
        if (typeRoom.equals("room for one person") && days < 10 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 18 * 0.9);
            System.out.println();
        }
        if (typeRoom.equals("room for one person") && days >= 10 && days < 15 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 18 * 1.25);
            System.out.println();
        }
        if (typeRoom.equals("room for one person") && days >= 10 && days < 15 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 18 * 0.9);
            System.out.println();
        }
        if (typeRoom.equals("room for one person") && days >= 15 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 18 * 1.25);
            System.out.println();
        }
        if (typeRoom.equals("room for one person") && days >= 15 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 18 * 0.9);
            System.out.println();
        }
        if (typeRoom.equals("apartment") && days < 10 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 25 * 1.25 * 0.7);
            System.out.println();
        }
        if (typeRoom.equals("apartment") && days < 10 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 25 * 0.9 * 0.7);
            System.out.println();
        }
        if (typeRoom.equals("apartment") && days >= 10 && days < 15 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 25 * 1.25 * 0.65);
            System.out.println();
        }
        if (typeRoom.equals("apartment") && days >= 10 && days < 15 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 25 * 0.9 * 0.65);
            System.out.println();
        }
        if (typeRoom.equals("apartment") && days >= 15 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 25 * 1.25 * 0.5);
            System.out.println();
        }
        if (typeRoom.equals("apartment") && days >= 15 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 25 * 0.9 * 0.5);
            System.out.println();
        }
        if (typeRoom.equals("president apartment") && days < 10 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 35 * 1.25 * 0.9);
            System.out.println();
        }
        if (typeRoom.equals("president apartment") && days < 10 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 35 * 0.9 * 0.9);
            System.out.println();
        }if (typeRoom.equals("president apartment") && days >= 10 && days < 15 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 35 * 1.25 * 0.85);
            System.out.println();
        }
        if (typeRoom.equals("president apartment") && days >= 10 && days < 15 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 35 * 0.9 * 0.85);
            System.out.println();
        }
        if (typeRoom.equals("president apartment") && days >= 15 && mark.equals("positive")) {
            System.out.printf("%.2f", (days - 1) * 35 * 1.25 * 0.8);
            System.out.println();
        }
        if (typeRoom.equals("president apartment") && days >= 15 && mark.equals("negative")) {
            System.out.printf("%.2f", (days - 1) * 35 * 0.9 * 0.8);
            System.out.println();
        }
    }
}
