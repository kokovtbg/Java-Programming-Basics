package SimpleOperationsCalculations;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double areaGreen = 2 * x * x + 2 * (x * y) - 2 * 1.2 - 2 * 1.5 * 1.5;
        double areaRed = x * h + 2 * x * y;
        double green = areaGreen / 3.4;
        double red = areaRed / 4.3;
        System.out.printf("%.2f", green);
        System.out.println();
        System.out.printf("%.2f", red);
    }
}
