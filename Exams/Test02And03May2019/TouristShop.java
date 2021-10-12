package ExamsWTF.Test02And03May2019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());

        String command = scan.nextLine();
        double sum = 0;
        int count = 0;
        while (!command.equals("Stop")) {
            double price = Double.parseDouble(scan.nextLine());
            count++;
            if (count % 3 == 0) {
                price *= 0.5;
            }
            sum += price;
            if (sum > budget) {
                break;
            }
            command = scan.nextLine();
        }
        if (command.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", count, sum);
        }
        if (sum > budget) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", sum - budget);
        }
    }
}
