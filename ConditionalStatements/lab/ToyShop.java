package ConditionalStatements.lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int miniTrucks = Integer.parseInt(scan.nextLine());

        int toys = puzzles + dolls + teddyBears + minions + miniTrucks;
        if (toys >= 50) {
            double profitPuzzles = puzzles * 2.6;
            double profitDolls = dolls * 3;
            double profitBears = teddyBears * 4.1;
            double profitMinions = minions * 8.2;
            double profitTrucks = miniTrucks * 2;
            double profit = profitPuzzles + profitDolls + profitBears + profitMinions + profitTrucks;
            double discountProfit = profit * 0.75;
            double clearProfit = discountProfit * 0.9;
            if (clearProfit >= price) {
                double needed = clearProfit - price;
                System.out.print("Yes! ");
                System.out.printf("%.2f", needed);
                System.out.println(" lv left.");
            } else {
                double needed = price - clearProfit;
                System.out.print("Not enough money! ");
                System.out.printf("%.2f", needed);
                System.out.println(" lv needed.");
            }
        }
        if (toys < 50) {
            double profitPuzzles = puzzles * 2.6;
            double profitDolls = dolls * 3;
            double profitBears = teddyBears * 4.1;
            double profitMinions = minions * 8.2;
            double profitTrucks = miniTrucks * 2;
            double profit = profitPuzzles + profitDolls + profitBears + profitMinions + profitTrucks;
            double clearProfit = profit * 0.9;
            if (clearProfit >= price) {
                double needed = clearProfit - price;
                System.out.print("Yes! ");
                System.out.printf("%.2f", needed);
                System.out.println(" lv left.");
            } else {
                double needed = price - clearProfit;
                System.out.print("Not enough money! ");
                System.out.printf("%.2f", needed);
                System.out.println(" lv needed.");
            }
        }


    }
}
