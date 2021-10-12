package ExamsWTF.Test20And21April2019.Test2;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double easterBread = Math.ceil(guests * 1.0 / 3);
        int eggs = guests * 2;
        double sum = easterBread * 4 + eggs * 0.45;
        if (sum <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", easterBread, eggs);
            System.out.printf("He has %.2f lv. left.", budget - sum);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", sum - budget);
        }
    }
}
