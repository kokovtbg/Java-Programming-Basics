package ForLoop.lab;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int oneToy = Integer.parseInt(scan.nextLine());

        int numberToys = 0;
        int savedMoney = 0;
        int moneyForBirthday = 10;

        for (int currentYear = 1; currentYear <= age; currentYear++) {
            if (currentYear % 2 == 0) {
                savedMoney += (moneyForBirthday - 1);
                moneyForBirthday += 10;
            } else {
                numberToys ++;
            }
        }
        savedMoney += numberToys * oneToy;
        if (savedMoney >= price) {
            System.out.printf("Yes! %.2f", savedMoney - price);
        } else {
            System.out.printf("No! %.2f", price - savedMoney);
        }
    }
}
