package ExamsWTF.Test09And10March2019.Test2;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        int startingPoints = 301;
        int count = 0;
        int countFault = 0;
        String command = scan.nextLine();
        while (!command.equals("Retire")) {
            int points = Integer.parseInt(scan.nextLine());
            if (command.equals("Single")) {
                if (points <= startingPoints) {
                    startingPoints -= points;
                    count++;
                } else {
                    countFault++;
                }
            }
            if (command.equals("Double")) {
                if (points * 2 <= startingPoints) {
                    startingPoints -= points * 2;
                    count++;
                } else {
                    countFault++;
                }
            }
            if (command.equals("Triple")) {
                if (points * 3 <= startingPoints) {
                    startingPoints -= points * 3;
                    count++;
                } else {
                    countFault++;
                }
            }
            if (startingPoints == 0) {
                break;
            }

            command = scan.nextLine();
        }
        if (startingPoints == 0) {
            System.out.printf("%s won the leg with %d shots.", name, count);
        }
        if (command.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", name, countFault);
        }
    }
}
