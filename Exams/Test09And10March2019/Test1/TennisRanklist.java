package ExamsWTF.Test09And10March2019.Test1;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournaments = Integer.parseInt(scan.nextLine());
        int startingPoints = Integer.parseInt(scan.nextLine());

        int finalPoints = 0;
        int winTournament = 0;
        for (int i = 1; i <= tournaments; i++) {
            String levelTournament = scan.nextLine();
            if (levelTournament.equals("W")) {
                finalPoints += 2000;
                winTournament++;
            }
            if (levelTournament.equals("F")) {
                finalPoints += 1200;
            }
            if (levelTournament.equals("SF")) {
                finalPoints += 720;
            }
        }
        finalPoints += startingPoints;
        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((finalPoints - startingPoints) * 1.0 / tournaments));
        System.out.printf("%.2f%%", winTournament * 1.0 / tournaments * 100);
    }
}
