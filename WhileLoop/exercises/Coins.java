package WhileLoop.exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = Double.parseDouble(scan.nextLine());

        int coins = 0;
        int coins200 = 0;
        int coins100 = 0;
        int coins50 = 0;
        int coins20 = 0;
        int coins10 = 0;
        int coins5 = 0;
        int coins2 = 0;
        int coins1 = 0;
        //< 100 -> 50 st, 20 st, 10 st, 5 st, 2 st, 1 st
        double sumStotinki = sum * 100;
        if (sumStotinki < 1000) {
            coins200 += Math.floor(sumStotinki / 200);
            sumStotinki = sumStotinki - coins200 * 200;
            coins100 += Math.floor(sumStotinki / 100);
            sumStotinki = sumStotinki - coins100 * 100;
            coins50 += Math.floor(sumStotinki / 50);
            sumStotinki = sumStotinki - coins50 * 50;
            coins20 += Math.floor(sumStotinki / 20);
            sumStotinki = sumStotinki - coins20 * 20;
            coins10 += Math.floor(sumStotinki / 10);
            sumStotinki = sumStotinki - coins10 * 10;
            coins5 += Math.floor(sumStotinki / 5);
            sumStotinki = sumStotinki - coins5 * 5;
            coins2 += Math.floor(sumStotinki / 2);
            sumStotinki = sumStotinki - coins2 * 2;
            coins1 += sumStotinki;
        }
        coins = coins200 + coins100 + coins50 + coins20 + coins10 + coins5 + coins2 + coins1;
        System.out.println(coins);
    }
}
