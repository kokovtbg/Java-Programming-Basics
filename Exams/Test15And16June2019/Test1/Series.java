package ExamsWTF.Test15And16June2019.Test1;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int serials = Integer.parseInt(scan.nextLine());

        double sum = 0;
        for (int i = 1; i <= serials; i++) {
            String name = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());
            if (name.equals("Thrones")) {
                price *= 0.5;
            }
            if (name.equals("Lucifer")) {
                price *= 0.6;
            }
            if (name.equals("Protector")) {
                price *= 0.7;
            }
            if (name.equals("TotalDrama")) {
                price *= 0.8;
            }
            if (name.equals("Area")) {
                price *= 0.9;
            }
            sum += price;
        }
        if (budget >= sum) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - sum);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", sum - budget);
        }
    }
}
