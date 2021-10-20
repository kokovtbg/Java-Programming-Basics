package NestedLoopsMore;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int maxPasswords = Integer.parseInt(scan.nextLine());

        int count = 0;
        int aA = 34;
        int bB = 63;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (count == maxPasswords) {
                    break;
                }
                count++;
                aA += count;
                bB += count;
                if (aA > 55) {
                    aA = 34;
                }
                if (bB > 96) {
                    bB = 63;
                }
                System.out.printf("%s%s%d%d%s%s|", String.valueOf((char) aA), String.valueOf((char) bB), i, j, String.valueOf((char) bB), String.valueOf((char) aA));
                aA = 34;
                bB = 63;
            }
        }
    }
}
