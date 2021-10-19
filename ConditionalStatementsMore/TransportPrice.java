package ConditionalStatementsMore;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        String dayNight = scan.nextLine();

        if (n < 20) {
            if (dayNight.equals("day")) {
                System.out.printf("%.2f", (0.7 + n * 0.79));
            } else if (dayNight.equals("night")) {
                System.out.printf("%.2f", (0.7 + n * 0.9));
            }
        } else if (n < 100) {
            System.out.printf("%.2f", n * 0.09);
        } else {
            System.out.printf("%.2f", n * 0.06);
        }
    }
}
