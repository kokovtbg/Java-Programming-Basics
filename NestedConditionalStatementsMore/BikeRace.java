package NestedConditionalStatementsMore;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juniors = Integer.parseInt(scan.nextLine());
        int seniors = Integer.parseInt(scan.nextLine());
        String route = scan.nextLine();

        if (route.equals("trail")) {
            System.out.printf("%.2f", (juniors * 5.5 + seniors * 7) * 0.95);
        }
        if (route.equals("cross-country") && (juniors + seniors) < 50) {
            System.out.printf("%.2f", (juniors * 8 + seniors * 9.5) * 0.95);
        }
        if (route.equals("cross-country") && (juniors + seniors) >= 50) {
            System.out.printf("%.2f", (juniors * 8 + seniors * 9.5) * 0.75 * 0.95);
        }
        if (route.equals("downhill")) {
            System.out.printf("%.2f", (juniors * 12.25 + seniors * 13.75) * 0.95);
        }
        if (route.equals("road")) {
            System.out.printf("%.2f", (juniors * 20 + seniors * 21.5) * 0.95);
        }
        System.out.println();
    }
}
