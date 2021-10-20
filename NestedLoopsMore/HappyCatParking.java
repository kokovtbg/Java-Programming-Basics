package NestedLoopsMore;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        int counter = 0;
        double sum = 0;
        double totalSum = 0;
        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    sum += 2.5;
                }
                if (i % 2 != 0 && j % 2 == 0) {
                    sum += 1.25;
                }
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    sum += 1;
                }
            }
            counter++;
            System.out.printf("Day: %d - %.2f leva%n", counter,  sum);
            totalSum += sum;
            sum = 0;
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
