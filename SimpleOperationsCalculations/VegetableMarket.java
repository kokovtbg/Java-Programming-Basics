package SimpleOperationsCalculations;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceVegetable = Double.parseDouble(scan.nextLine());
        double priceFruit = Double.parseDouble(scan.nextLine());
        int vegetable = Integer.parseInt(scan.nextLine());
        int fruit = Integer.parseInt(scan.nextLine());

        double profit = (priceVegetable * vegetable + priceFruit * fruit) / 1.94;
        System.out.printf("%.2f", profit);
    }
}
