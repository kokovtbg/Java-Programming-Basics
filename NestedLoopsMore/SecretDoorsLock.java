package NestedLoopsMore;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxHundreds = Integer.parseInt(scan.nextLine());
        int maxDozens = Integer.parseInt(scan.nextLine());
        int maxUnits = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= maxHundreds; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= maxDozens; j++) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        for (int k = 1; k <= maxUnits; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, j, k);
                            }
                        }
                    }
                }
            }
        }
    }
}
