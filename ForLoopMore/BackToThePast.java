package ForLoopMore;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int yearMustLive = Integer.parseInt(scan.nextLine());

        // yearMustLive >= 1801 <= 1900
        for (int i = 1800; i <= yearMustLive; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= 12000 + 50 * (18 + (i - 1800));
            }
        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
