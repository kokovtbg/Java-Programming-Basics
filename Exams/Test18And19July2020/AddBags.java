package ExamsWTF.Test18And19July2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bagsPrice = Double.parseDouble(scan.nextLine());
        double kiloBags = Double.parseDouble(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int bags = Integer.parseInt(scan.nextLine());

        if (kiloBags < 10) {
            bagsPrice = bagsPrice * 0.2;
        }
        if (kiloBags >= 10 && kiloBags <= 20) {
            bagsPrice = bagsPrice * 0.5;
        }
        if (days > 30) {
            bagsPrice = bagsPrice * 1.1;
        }
        if (days >= 7 && days <= 30) {
            bagsPrice = bagsPrice * 1.15;
        }
        if (days < 7) {
            bagsPrice = bagsPrice * 1.4;
        }
        System.out.printf("The total price of bags is: %.2f lv.", bagsPrice * bags);
    }
}
