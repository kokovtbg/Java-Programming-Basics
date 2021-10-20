package NestedLoops.exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (double i = 1111; i <= 9999; i++) {
            if (n % Math.floor(i / 1000) == 0) {
                if (n % (Math.floor(i / 100) % 10) == 0) {
                    if (n % (Math.floor(i / 10) % 10) == 0) {
                        if (n % (i % 10) == 0) {
                            System.out.printf("%.0f ", i);
                        }
                    }
                }
            }
        }
    }
}
