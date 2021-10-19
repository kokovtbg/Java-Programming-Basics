package ForLoop.lab;

import java.util.Scanner;

public class EvenPowersOf22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%.0f", Math.pow(2, i));
                System.out.println();
            }
        }
    }
}
