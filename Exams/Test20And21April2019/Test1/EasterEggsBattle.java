package ExamsWTF.Test20And21April2019.Test1;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggsFirstPlayer = Integer.parseInt(scan.nextLine());
        int eggsSecondPlayer = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();
        while (!command.equals("End of battle")) {

            if (command.equals("one")) {
                eggsSecondPlayer--;
            }
            if (command.equals("two")) {
                eggsFirstPlayer--;
            }
            if (eggsFirstPlayer == 0) {
                break;
            }
            if (eggsSecondPlayer == 0) {
                break;
            }
            command = scan.nextLine();
        }
        if (eggsFirstPlayer == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecondPlayer);
        }
        if (eggsSecondPlayer == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirstPlayer);
        }
        if (command.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.%n", eggsFirstPlayer);
            System.out.printf("Player two has %s eggs left.", eggsSecondPlayer);
        }
    }
}
