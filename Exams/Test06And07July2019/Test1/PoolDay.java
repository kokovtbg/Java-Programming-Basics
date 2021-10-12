package ExamsWTF.Test06And07July2019.Test1;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        double tax = Double.parseDouble(scan.nextLine());
        double sunbedPrice = Double.parseDouble(scan.nextLine());
        double umbrellaPrice = Double.parseDouble(scan.nextLine());

        double sunbed = Math.ceil(people * 0.75);
        double umbrella = Math.ceil(people * 1.0 / 2);
        double sum = people * tax + sunbed * sunbedPrice + umbrella * umbrellaPrice;
        System.out.printf("%.2f lv.", sum);
    }
}
