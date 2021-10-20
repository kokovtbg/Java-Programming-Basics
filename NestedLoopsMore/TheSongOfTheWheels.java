package NestedLoopsMore;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());

        int count = 0;
        String magicNumber = "";

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a * b + c * d == m && a < b && c > d) {
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                            count++;
                            if (count == 4) {
                                String aA = String.valueOf((char) (a + 48));
                                String bB = String.valueOf((char) (b + 48));
                                String cC = String.valueOf((char) (c + 48));
                                String dD = String.valueOf((char) (d + 48));
                                magicNumber = aA + bB + cC + dD;
                            }
                        }
                    }
                }
            }
        }
        if (count >= 4) {
            System.out.printf("%nPassword: %s%n", magicNumber);
        } else {
            System.out.println();
            System.out.println("No!");
        }
    }
}
