package ExamsWTF.Test28And29March2020.Test1;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String smallBig = scan.nextLine();
        int countSets = Integer.parseInt(scan.nextLine());

        double price = 0;
        if (fruit.equals("Watermelon")) {
            if (smallBig.equals("small")) {
                price = 2 * 56 * countSets;
            }
            if (smallBig.equals("big")) {
                price = 5 * 28.7 * countSets;
            }
        }
        if (fruit.equals("Mango")) {
            if (smallBig.equals("small")) {
                price = 2 * 36.66 * countSets;
            }
            if (smallBig.equals("big")) {
                price = 5 * 19.6 * countSets;
            }
        }
        if (fruit.equals("Pineapple")) {
            if (smallBig.equals("small")) {
                price = 2 * 42.1 * countSets;
            }
            if (smallBig.equals("big")) {
                price = 5 * 24.8 * countSets;
            }
        }
        if (fruit.equals("Raspberry")) {
            if (smallBig.equals("small")) {
                price = 2 * 20 * countSets;
            }
            if (smallBig.equals("big")) {
                price = 5 * 15.2 * countSets;
            }
        }
        if (price >= 400 && price <= 1000) {
            price *= 0.85;
        }
        if (price > 1000) {
            price *= 0.5;
        }
        System.out.printf("%.2f lv.", price);
    }
}
