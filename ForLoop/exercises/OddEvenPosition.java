package ForLoop.exercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Double.parseDouble(scan.nextLine());

        double oddSum = 0;
        double evenSum = 0;
        double oddMin = 1000000000;
        double oddMax = -1000000000;
        double evenMin = 1000000000;
        double evenMax = -1000000000;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if ((i % 2 != 0)) {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
            if ((i % 2 == 0)) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            }
        }
        if (n == 1) {
            System.out.printf("OddSum=%.2f,", oddSum);
            System.out.println();
            System.out.printf("OddMin=%.2f,", oddMin);
            System.out.println();
            System.out.printf("OddMax=%.2f,", oddMax);
            System.out.println();
            System.out.printf("EvenSum=%.2f,", evenSum);
            System.out.println();
            System.out.print("EvenMin=No,");
            System.out.println();
            System.out.print("EvenMax=No");
            System.out.println();
        }
        if (n == 0) {
            System.out.printf("OddSum=%.2f,", oddSum);
            System.out.println();
            System.out.print("OddMin=No,");
            System.out.println();
            System.out.print("OddMax=No,");
            System.out.println();
            System.out.printf("EvenSum=%.2f,", evenSum);
            System.out.println();
            System.out.print("EvenMin=No,");
            System.out.println();
            System.out.print("EvenMax=No");
            System.out.println();
        }
        if (n != 1 && n != 0) {
            System.out.printf("OddSum=%.2f,", oddSum);
            System.out.println();
            System.out.printf("OddMin=%.2f,", oddMin);
            System.out.println();
            System.out.printf("OddMax=%.2f,", oddMax);
            System.out.println();
            System.out.printf("EvenSum=%.2f,", evenSum);
            System.out.println();
            System.out.printf("EvenMin=%.2f,", evenMin);
            System.out.println();
            System.out.printf("EvenMax=%.2f", evenMax);
            System.out.println();
        }
    }
}
