package ExamsWTF.Test02And03May2019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String duration = scan.nextLine();
        String type = scan.nextLine();
        String internet = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());

        double monthTax = 0;
        if (duration.equals("one")) {
            if (type.equals("Small")) {
                monthTax = 9.98;
            }
            if (type.equals("Middle")) {
                monthTax = 18.99;
            }
            if (type.equals("Large")) {
                monthTax = 25.98;
            }
            if (type.equals("ExtraLarge")) {
                monthTax = 35.99;
            }
        }
        if (duration.equals("two")) {
            if (type.equals("Small")) {
                monthTax = 8.58;
            }
            if (type.equals("Middle")) {
                monthTax = 17.09;
            }
            if (type.equals("Large")) {
                monthTax = 23.59;
            }
            if (type.equals("ExtraLarge")) {
                monthTax = 31.79;
            }
        }
        if (internet.equals("yes")) {
            if (monthTax <= 10) {
                monthTax += 5.5;
            } else if (monthTax <= 30) {
                monthTax += 4.35;
            }
            else {
                monthTax += 3.85;
            }
        }
        if (duration.equals("two")) {
            monthTax *= (100 - 3.75) / 100;
        }
        double sum = monthTax * months;
        System.out.printf("%.2f lv.", sum);
    }
}
