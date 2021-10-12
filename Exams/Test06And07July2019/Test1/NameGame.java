package ExamsWTF.Test06And07July2019.Test1;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int maxPoints = Integer.MIN_VALUE;
        String nameMaxPoints = "";
        while (!command.equals("Stop")) {
            int points = 0;
            for (int i = 0; i < command.length(); i++) {
                int number = Integer.parseInt(scan.nextLine());
                int a = command.charAt(i);
                if (number == a) {
                    points += 10;
                } else {
                    points += 2;
                }
            }
            if (points >= maxPoints) {
                maxPoints = points;
                nameMaxPoints = command;
            }

            command = scan.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", nameMaxPoints, maxPoints);
    }
}
