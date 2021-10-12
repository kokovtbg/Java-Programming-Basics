package ExamsWTF.Test28And29March2020.Test1;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesDay = Integer.parseInt(scan.nextLine());
        int countWalking = Integer.parseInt(scan.nextLine());
        int caloriesDay = Integer.parseInt(scan.nextLine());

        int caloriesBurned = countWalking * minutesDay * 5;
        if (caloriesBurned >= caloriesDay / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurned);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurned);
        }
    }
}
