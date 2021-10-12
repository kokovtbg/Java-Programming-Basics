package ExamsWTF.Test28And29March2020.Test1;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountFood = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();
        int eatenFoodSum = 0;
        while (!command.equals("Adopted")) {
            int eatenFood = Integer.parseInt(command);
            eatenFoodSum += eatenFood;
            command = scan.nextLine();
        }
        if (eatenFoodSum <= amountFood * 1000) {
            System.out.printf("Food is enough! Leftovers: %d grams.", amountFood * 1000 - eatenFoodSum);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", eatenFoodSum - amountFood * 1000);
        }
    }
}
