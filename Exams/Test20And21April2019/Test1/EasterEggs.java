package ExamsWTF.Test20And21April2019.Test1;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggs = Integer.parseInt(scan.nextLine());

        int eggsRed = 0;
        int eggsOrange = 0;
        int eggsBlue = 0;
        int eggsGreen = 0;
        int eggsMax = Integer.MIN_VALUE;
        String colorMax = "";
        for (int i = 1; i <= eggs; i++) {
            String eggColor = scan.nextLine();
            if (eggColor.equals("red")) {
                eggsRed++;
            }
            if (eggColor.equals("orange")) {
                eggsOrange++;
            }
            if (eggColor.equals("blue")) {
                eggsBlue++;
            }
            if (eggColor.equals("green")) {
                eggsGreen++;
            }
            if (eggsRed > eggsMax) {
                eggsMax = eggsRed;
                colorMax = "red";
            }
            if (eggsOrange > eggsMax) {
                eggsMax = eggsOrange;
                colorMax = "orange";
            }
            if (eggsBlue > eggsMax) {
                eggsMax = eggsBlue;
                colorMax = "blue";
            }
            if (eggsGreen > eggsMax) {
                eggsMax = eggsGreen;
                colorMax = "green";
            }
        }
        System.out.printf("Red eggs: %d%n", eggsRed);
        System.out.printf("Orange eggs: %d%n", eggsOrange);
        System.out.printf("Blue eggs: %d%n", eggsBlue);
        System.out.printf("Green eggs: %d%n", eggsGreen);
        System.out.printf("Max eggs: %d -> %s", eggsMax, colorMax);
    }
}
