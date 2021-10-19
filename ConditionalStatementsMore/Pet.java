package ConditionalStatementsMore;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int food = Integer.parseInt(scan.nextLine());
        double foodDog = Double.parseDouble(scan.nextLine());
        double foodCat = Double.parseDouble(scan.nextLine());
        double foodTurtle = Double.parseDouble(scan.nextLine());

        double foodConsume = days * (foodDog + foodCat + foodTurtle / 1000);
        if (food >= foodConsume) {
            System.out.printf("%.0f", Math.floor(food - foodConsume));
            System.out.println(" kilos of food left.");
        } else {
            System.out.printf("%.0f", Math.ceil(foodConsume - food));
            System.out.println(" more kilos of food are needed.");
        }
    }
}
