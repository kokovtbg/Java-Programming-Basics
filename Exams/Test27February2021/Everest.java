package ExamsWTF.Test27February2021;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int metersStart = 5364;
        int countDays = 1;
        boolean everest = false;
        String command = scan.nextLine();
        while (!command.equals("END")) {

            if (command.equals("Yes")) {
                countDays++;
            }
            int meters = Integer.parseInt(scan.nextLine());
            if (countDays == 5) {
                break;
            }
            metersStart += meters;
            if (metersStart >= 8848) {
                everest = true;
                break;
            }

            command = scan.nextLine();
        }
        if (everest) {
            System.out.printf("Goal reached for %d days!", countDays);
        } else {
            System.out.printf("Failed!%n");
            System.out.printf("%d", metersStart);
        }
    }
}
