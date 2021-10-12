package ExamsWTF.Test28And29March2020.Test1;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double totalFood = Double.parseDouble(scan.nextLine());

        double sumFood = 0;
        double sumFoodDog = 0;
        double sumFoodCat = 0;
        double biscuits = 0;
        for (int i = 1; i <= days; i++) {
            int foodDog = Integer.parseInt(scan.nextLine());
            int foodCat = Integer.parseInt(scan.nextLine());
            sumFood += foodDog + foodCat;
            sumFoodDog += foodDog;
            sumFoodCat += foodCat;
            if (i % 3 == 0) {
                biscuits += 0.1 * (foodDog + foodCat);
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", sumFood * 100 / totalFood);
        System.out.printf("%.2f%% eaten from the dog.%n", sumFoodDog * 100 / sumFood);
        System.out.printf("%.2f%% eaten from the cat.", sumFoodCat * 100 / sumFood);
    }
}
