package ConditionalStatementsMore;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        int z = Integer.parseInt(scan.nextLine());
        int men = Integer.parseInt(scan.nextLine());

        double wine = 0.4 * x * y / 2.5;
        if (wine < z) {
            System.out.print("It will be a tough winter! More ");
            System.out.printf("%.0f", Math.floor(z - wine));
            System.out.println(" liters wine needed.");
        } else {
            System.out.print("Good harvest this year! Total wine: ");
            System.out.printf("%.0f", Math.floor(x * y * 0.4 / 2.5));
            System.out.println(" liters.");
            System.out.printf("%.0f", Math.ceil(wine - z));
            System.out.print(" liters left -> ");
            System.out.printf("%.0f", Math.ceil((wine - z) / men));
            System.out.println(" liters per person.");
        }
    }
}
