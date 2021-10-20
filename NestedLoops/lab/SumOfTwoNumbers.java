package NestedLoops.lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int combination = 0;
        int sum = 0;
        boolean flag = false;

        //1 10 5 1-1, 1-2, 1-3, 1-4, 1-5, 1-6, ...
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                combination++;
                sum = i + j;

                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combination, i, j, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (sum != magicNumber) {
            System.out.printf("%d combinations - neither equals %d%n", combination, magicNumber);
        }
    }
}
