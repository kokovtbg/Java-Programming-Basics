package NestedLoops.exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;
        while (!command.equals("stop")) {
            double number = Double.parseDouble(command);

            if (number == 0 || number == 1) {
                sumNonPrime += number;
            }
            if (number / 2 == 1 || number / 3 == 1 || number / 5 == 1 || number / 7 == 1 || number / 11 == 1 || number / 13 == 1 || number / 17 == 1 || number / 19 == 1 || number / 23 == 1 || number / 29 == 1 || number / 31 == 1 || number / 37 == 1 || number / 41 == 1 || number / 43 == 1 || number / 47 == 1 || number / 53 == 1 || number / 59 == 1 || number / 61 == 1 || number / 67 == 1 || number / 71 == 1 || number / 73 == 1 || number / 79 == 1 || number / 83 == 1 || number / 89 == 1 || number / 97 == 1 || number / 101 == 1 || number / 103 == 1 || number / 107 == 1 || number / 109 == 1 || number / 113 == 1) {
                sumPrime += number;
            } else {
                sumNonPrime += number;
                if (number < 0) {
                    System.out.println("Number is negative.");
                    sumNonPrime -= number;
                }
            }

            command = scan.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}
