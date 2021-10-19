package ConditionalStatementsMore;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int magnolia = Integer.parseInt(scan.nextLine());
        int hyacinth = Integer.parseInt(scan.nextLine());
        int rose = Integer.parseInt(scan.nextLine());
        int cactus = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());

        double profit = (magnolia * 3.25 + hyacinth * 4 + rose * 3.5 + cactus * 8) * 0.95;
        if (profit >= price) {
            System.out.print("She is left with ");
            System.out.printf("%.0f", Math.floor(profit - price));
        } else {
            System.out.print("She will have to borrow ");
            System.out.printf("%.0f", Math.ceil(price - profit));
        }
        System.out.println(" leva.");
    }
}
