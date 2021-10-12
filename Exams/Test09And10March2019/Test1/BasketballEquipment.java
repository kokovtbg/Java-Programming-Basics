package ExamsWTF.Test09And10March2019.Test1;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taxAnnual = Integer.parseInt(scan.nextLine());

        double sum = taxAnnual + taxAnnual * 0.6 + taxAnnual * 0.6 * 0.8 + taxAnnual * 0.6 * 0.8 / 4 + taxAnnual * 0.6 * 0.8 / 20;
        System.out.printf("%.2f", sum);
    }
}
