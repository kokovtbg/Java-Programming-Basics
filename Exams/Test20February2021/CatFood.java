package ExamsWTF.Test20February2021;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cats = Integer.parseInt(scan.nextLine());

        double sumFood = 0;
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        for (int i = 1; i <= cats; i++) {
            double foodCat = Double.parseDouble(scan.nextLine());
            sumFood += foodCat;
            if (foodCat >= 100 && foodCat < 200) {
                group1++;
            }
            if (foodCat >= 200 && foodCat < 300) {
                group2++;
            }
            if (foodCat >= 300 && foodCat <= 400) {
                group3++;
            }
        }
        System.out.printf("Group 1: %d cats.%n", group1);
        System.out.printf("Group 2: %d cats.%n", group2);
        System.out.printf("Group 3: %d cats.%n", group3);
        System.out.printf("Price for food per day: %.2f lv.", sumFood / 1000 * 12.45);
    }
}
