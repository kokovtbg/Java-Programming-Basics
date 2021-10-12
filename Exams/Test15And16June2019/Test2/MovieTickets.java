package ExamsWTF.Test15And16June2019.Test2;

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = Integer.parseInt(scan.nextLine());
        int a2 = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = a1; i <= a2 - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                for (int k = 1; k <= n / 2 - 1; k++) {
                    for (int l = a1; l <= a2 - 1; l++) {
                        if (i % 2 != 0 && (j + k + l) % 2 != 0 && l == i) {
                            System.out.printf("%c-%d%d%d%n", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
