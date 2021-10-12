package ExamsWTF.Test20And21April2019.Test2;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scan.nextLine());

        int sugarAllBreads = 0;
        int flourAllBreads = 0;
        int maxFlour = Integer.MIN_VALUE;
        int maxSugar = Integer.MIN_VALUE;
        for (int i = 1; i <= easterBreads; i++) {
            int sugar = Integer.parseInt(scan.nextLine());
            int flour = Integer.parseInt(scan.nextLine());
            sugarAllBreads += sugar;
            flourAllBreads += flour;
            if (flour > maxFlour) {
                maxFlour = flour;
            }
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
        }
        double sugarPackage = Math.ceil(sugarAllBreads * 1.0 / 950);
        double flourPackage = Math.ceil(flourAllBreads * 1.0 / 750);
        System.out.printf("Sugar: %.0f%n", sugarPackage);
        System.out.printf("Flour: %.0f%n", flourPackage);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
