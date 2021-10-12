package ExamsWTF.Test20And21April2019.Test2;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double flourPrice = Double.parseDouble(scan.nextLine());
        double flour = Double.parseDouble(scan.nextLine());
        double sugar = Double.parseDouble(scan.nextLine());
        int eggsShell = Integer.parseInt(scan.nextLine());
        int yeast = Integer.parseInt(scan.nextLine());

        double sum = flour * flourPrice + sugar * flourPrice * 0.75 + eggsShell * flourPrice * 1.1 + yeast * flourPrice * 0.75 * 0.2;
        System.out.printf("%.2f", sum);
    }
}
