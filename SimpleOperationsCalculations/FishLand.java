package SimpleOperationsCalculations;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceMackerel = Double.parseDouble(scan.nextLine());
        double priceSprat = Double.parseDouble(scan.nextLine());
        double bonito = Double.parseDouble(scan.nextLine());
        double scad = Double.parseDouble(scan.nextLine());
        int mussels = Integer.parseInt(scan.nextLine());

        double costBonito = bonito * priceMackerel * 1.6;
        double costScad = scad * priceSprat * 1.8;
        double costMussels = mussels * 7.5;
        System.out.printf("%.2f", costBonito + costScad + costMussels);

    }
}
