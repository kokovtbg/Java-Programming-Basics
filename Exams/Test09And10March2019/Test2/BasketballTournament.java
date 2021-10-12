package ExamsWTF.Test09And10March2019.Test2;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameTournament = scan.nextLine();

        double wins = 0;
        double lost = 0;
        double allMatches = 0;
        while (!nameTournament.equals("End of tournaments")) {
            int matches = Integer.parseInt(scan.nextLine());
            for (int i = 1; i <= matches; i++) {
                int pointsOurs = Integer.parseInt(scan.nextLine());
                int pointsOthers = Integer.parseInt(scan.nextLine());
                if (pointsOurs > pointsOthers) {
                    wins++;
                    allMatches++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, nameTournament, pointsOurs - pointsOthers);
                }
                if (pointsOurs < pointsOthers) {
                    lost++;
                    allMatches++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, nameTournament, pointsOthers - pointsOurs);
                }
            }

            nameTournament = scan.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", wins / allMatches * 100);
        System.out.printf("%.2f%% matches lost", lost / allMatches * 100);
    }
}
