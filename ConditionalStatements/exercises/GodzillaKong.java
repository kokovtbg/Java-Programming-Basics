package ConditionalStatements.exercises;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int staticPeople = Integer.parseInt(scan.nextLine());
        double priceClothes = Double.parseDouble(scan.nextLine());

        double price = 0.0;
        double totalPrice = 0.0;
        double decor = budget * 0.1;
        if (staticPeople >= 150) {
            price = priceClothes * staticPeople * 0.9;

        } else {
            price = priceClothes * staticPeople;
        }
        totalPrice = decor + price;
        if (totalPrice > budget){
            System.out.println("Not enough money!");
            System.out.print("Wingard needs ");
            System.out.printf("%.2f", totalPrice - budget);
            System.out.println(" leva more.");

        } else {
            System.out.println("Action!");
            System.out.print("Wingard starts filming with ");
            System.out.printf("%.2f", budget - totalPrice);
            System.out.println(" leva left.");
        }

    }
}
