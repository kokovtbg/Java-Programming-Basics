package ForLoop.exercises;

import java.util.Scanner;

public class OddEvenPosition2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double evenSum = 0;
        double oddSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());

            if (num % 2 != 0) {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            } else {
                evenSum += num;
                if (num > evenMax) {
                    oddMax = num;
                }
                if (num < evenMin) {
                    oddMin = num;
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
