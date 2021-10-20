package NestedLoopsMore;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coins1lv = Integer.parseInt(scan.nextLine());
        int coins2lv = Integer.parseInt(scan.nextLine());
        int banknotes5lv = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= coins1lv; i++) {
            for (int j = 0; j <= coins2lv; j++) {
                for (int k = 0; k <= banknotes5lv; k++) {
                    if (i + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
