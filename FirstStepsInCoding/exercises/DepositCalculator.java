package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double deposit = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double annual = deposit * percent / 100;
        double month = annual / 12;
        double monthinterest = month * months;
        double total = deposit + monthinterest;

        System.out.println(total);
    }
}
