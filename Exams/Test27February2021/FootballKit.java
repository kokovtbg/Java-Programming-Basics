package ExamsWTF.Test27February2021;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceShirt = Double.parseDouble(scan.nextLine());
        double sumNeeded = Double.parseDouble(scan.nextLine());

        double sum = (priceShirt + priceShirt * 0.75 + priceShirt * 0.75 * 0.2 + (priceShirt + priceShirt * 0.75) * 2) * 0.85;
        if (sum >= sumNeeded) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sum);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", sumNeeded - sum);
        }
    }
}
