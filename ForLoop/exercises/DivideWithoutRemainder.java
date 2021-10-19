package ForLoop.exercises;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //n >= 1 n <= 1000
        //p1 % 2 == 0
        //p2 % 3 == 0
        //p3 % 4 == 0
        double sumP1 = 0;
        double sumP2 = 0;
        double sumP3 = 0;
        for (int i = 1; i<= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num % 2 == 0) {
                sumP1 += 1;
            }
            if (num % 3 == 0) {
                sumP2 += 1;
            }
            if (num % 4 == 0) {
                sumP3 += 1;
            }
        }
        System.out.printf("%.2f", sumP1 * 100 / n);
        System.out.println("%");
        System.out.printf("%.2f", sumP2 * 100 / n);
        System.out.println("%");
        System.out.printf("%.2f", sumP3 * 100 / n);
        System.out.println("%");
    }
}
