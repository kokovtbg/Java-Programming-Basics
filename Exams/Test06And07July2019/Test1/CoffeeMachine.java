package ExamsWTF.Test06And07July2019.Test1;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeDrink = scan.nextLine();
        String sugar = scan.nextLine();
        int drinks = Integer.parseInt(scan.nextLine());

        double price = 0;
        if (typeDrink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                price = 0.9 * 0.65;
            }
            if (sugar.equals("Normal")) {
                price = 1;
            }
            if (sugar.equals("Extra")) {
                price = 1.2;
            }
            if (drinks >= 5) {
                price *= 0.75;
            }
        }
        if (typeDrink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                price = 1 * 0.65;
            }
            if (sugar.equals("Normal")) {
                price = 1.2;
            }
            if (sugar.equals("Extra")) {
                price = 1.6;
            }
        }
        if (typeDrink.equals("Tea")) {
            if (sugar.equals("Without")) {
                price = 0.5 * 0.65;
            }
            if (sugar.equals("Normal")) {
                price = 0.6;
            }
            if (sugar.equals("Extra")) {
                price = 0.7;
            }
        }
        double sum = price * drinks;
        if (sum > 15) {
            sum *= 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, typeDrink, sum);
    }
}
