package ExamsWTF.Test15And16June2019.Test2;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());

        String command = scan.nextLine();
        while (!command.equals("ACTION")) {
            if (command.length() <= 15) {
                double reward = Double.parseDouble(scan.nextLine());
                budget -= reward;
            }
            if (command.length() > 15) {
                budget *= 0.8;
            }
            if (budget < 0) {
                break;
            }

            command = scan.nextLine();
        }
        if (command.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", budget);
        }
        if (budget < 0) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}
