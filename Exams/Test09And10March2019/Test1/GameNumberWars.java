package ExamsWTF.Test09And10March2019.Test1;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameGamer1 = scan.nextLine();
        String nameGamer2 = scan.nextLine();

        String command = scan.nextLine();
        int pointsGamer1 = 0;
        int pointsGamer2 = 0;
        boolean numberWars = false;
        while (!command.equals("End of game")) {
            int cardGamer1 = Integer.parseInt(command);
            int cardGamer2 = Integer.parseInt(scan.nextLine());
            if (numberWars) {
                if (cardGamer1 > cardGamer2) {
                    System.out.printf("%s is winner with %d points", nameGamer1, pointsGamer1);
                    break;
                }
                if (cardGamer2 > cardGamer1) {
                    System.out.printf("%s is winner with %d points", nameGamer2, pointsGamer2);
                    break;
                }
            }
            if (cardGamer1 > cardGamer2) {
                pointsGamer1 += cardGamer1 - cardGamer2;
            }
            if (cardGamer2 > cardGamer1) {
                pointsGamer2 += cardGamer2 - cardGamer1;
            }
            if (cardGamer1 == cardGamer2) {
                numberWars = true;
                System.out.printf("Number wars!%n");
            }
            command = scan.nextLine();
        }
        if (command.equals("End of game")) {
            System.out.printf("%s has %d points%n", nameGamer1, pointsGamer1);
            System.out.printf("%s has %s points", nameGamer2, pointsGamer2);
        }
    }
}
