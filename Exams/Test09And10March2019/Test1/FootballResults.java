package ExamsWTF.Test09And10March2019.Test1;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstMatch = scan.nextLine();
        String secondMatch = scan.nextLine();
        String thirdMatch = scan.nextLine();

        int wins = 0;
        int drawn = 0;
        int lost = 0;
        if (firstMatch.charAt(0) > firstMatch.charAt(2)) {
            wins++;
        }
        if (firstMatch.charAt(0) == firstMatch.charAt(2)) {
            drawn++;
        }
        if (firstMatch.charAt(0) < firstMatch.charAt(2)) {
            lost++;
        }
        if (secondMatch.charAt(0) > secondMatch.charAt(2)) {
            wins++;
        }
        if (secondMatch.charAt(0) == secondMatch.charAt(2)) {
            drawn++;
        }
        if (secondMatch.charAt(0) < secondMatch.charAt(2)) {
            lost++;
        }
        if (thirdMatch.charAt(0) > thirdMatch.charAt(2)) {
            wins++;
        }
        if (thirdMatch.charAt(0) == thirdMatch.charAt(2)) {
            drawn++;
        }
        if (thirdMatch.charAt(0) < thirdMatch.charAt(2)) {
            lost++;
        }
        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d", drawn);
    }
}
