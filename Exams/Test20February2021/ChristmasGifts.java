package ExamsWTF.Test20February2021;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int adults = 0;
        int kids = 0;
        while (!command.equals("Christmas")) {
            int age = Integer.parseInt(command);
            if (age <= 16) {
                kids++;
            } else {
                adults++;
            }

            command = scan.nextLine();
        }
        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %d%n", kids * 5);
        System.out.printf("Money for sweaters: %d%n", adults * 15);
    }
}
