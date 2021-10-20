package NestedLoops.exercises;

import java.util.Scanner;

public class SumPrimeNonPrime3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!command.equals("stop")) {
            int n = Integer.parseInt(command);
            boolean isPrime = true;
            if (n < 0) {
                System.out.println("Number is negative.");
            }
            else if (n == 1) {
                sumNonPrime += n;
            } else {
                for (int count = 2; count < n; count++) {
                    if (n % count == 0) {
                        sumNonPrime += n;
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sumPrime += n;
                }
            }
            command = scan.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}
