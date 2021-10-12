package ExamsWTF.Test18And19July2020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String namePlayer = scan.nextLine();

        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";
        while (!namePlayer.equals("END")) {
            int goals = Integer.parseInt(scan.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = namePlayer;
            }
            if (goals >= 10) {
                break;
            }
            namePlayer = scan.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
