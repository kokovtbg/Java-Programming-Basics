package ExamsWTF.Test02And03May2019;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int vegetarian = Integer.parseInt(scan.nextLine());

        double sum = (chicken * 10.35 + fish * 12.4 + vegetarian * 8.15) * 1.2 + 2.5;
        System.out.printf("Total: %.2f", sum);
    }
}
