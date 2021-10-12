package ExamsWTF.Test20And21April2019.Test1;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        double envelope = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        if (guests >= 10 && guests <= 15) {
            envelope *= 0.85;
        } else if (guests > 15 && guests <= 20) {
            envelope *= 0.8;
        } else if (guests > 20) {
            envelope *= 0.75;
        }
        double moneyNeeded = guests * envelope + 0.1 * budget;
        if (budget >= moneyNeeded) {
            System.out.printf("It is party time! %.2f leva left.", budget - moneyNeeded);
        } else {
            System.out.printf("No party! %.2f leva needed.", moneyNeeded - budget);
        }
    }
}
