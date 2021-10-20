package NestedLoopsMore;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = m; i <= n; i++) {
            for (int j = m; j <= n; j++) {
                for (int k = m; k <= n; k++) {
                    for (int l = m; l <= n; l++) {
                        if (((i % 2 == 0) && (l % 2 != 0)) || ((i % 2 != 0) && (l % 2 == 0))) {
                            if ((i > l) && ((j + k) % 2 == 0)) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }
    }
}
