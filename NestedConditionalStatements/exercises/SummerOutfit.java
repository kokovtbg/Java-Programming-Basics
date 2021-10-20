package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degree = Integer.parseInt(scan.nextLine());
        String timeDay = scan.nextLine();

        String outfit = "";
        String shoes = "";
        if (timeDay.equals("Morning") && degree >= 10 && degree <= 18) {
            outfit = "Sweatshirt";
            shoes = "Sneakers";
        }
        if (timeDay.equals("Morning") && degree > 18 && degree <= 24) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        if (timeDay.equals("Morning") && degree >= 25) {
            outfit = "T-Shirt";
            shoes = "Sandals";
        }
        if (timeDay.equals("Afternoon") && degree >= 10 && degree <= 18) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        if (timeDay.equals("Afternoon") && degree > 18 && degree <= 24) {
            outfit = "T-Shirt";
            shoes = "Sandals";
        }
        if (timeDay.equals("Afternoon") && degree >= 25) {
            outfit = "Swim Suit";
            shoes = "Barefoot";
        }
        if (timeDay.equals("Evening") && degree >= 10 && degree <= 18) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        if (timeDay.equals("Evening") && degree > 18 && degree <= 24) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        if (timeDay.equals("Evening") && degree >= 25) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
        System.out.println();
    }
}
