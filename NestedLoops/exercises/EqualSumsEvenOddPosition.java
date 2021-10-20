package NestedLoops.exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());


        for (int i = number1; i <= number2; i++) {
            String currentNum = "" + i;
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
