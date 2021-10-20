package NestedLoops.lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();


        double sum = 0;

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scan.nextLine());

            while (sum < budget) {
                double saving = Double.parseDouble(scan.nextLine());
                sum += saving;

                if (sum >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    sum = 0;
                    break;
                }
            }

            destination = scan.nextLine();
        }
    }
}
