package ExamsWTF.Test06And07July2019.Test2;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double sum = (nylon + 2) * 1.5 + paint * 14.5 * 1.1 + thinner * 5 + 0.4 + ((nylon + 2) * 1.5 + paint * 14.5 * 1.1 + thinner * 5 + 0.4) * 0.3 * hours;
        System.out.printf("Total expenses: %.2f lv.", sum);
    }
}
