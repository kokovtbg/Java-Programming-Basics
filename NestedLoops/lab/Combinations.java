package NestedLoops.lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //x1 + x2 + x3 = n
        int sum = 0;
        int count = 0;
        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++) {
                    sum = x1 + x2 + x3;
                    if (sum == n) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
