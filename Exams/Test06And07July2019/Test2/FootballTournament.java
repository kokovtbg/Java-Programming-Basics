package ExamsWTF.Test06And07July2019.Test2;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int matches = Integer.parseInt(scan.nextLine());

        int points = 0;
        int win = 0;
        int draw = 0;
        int lost = 0;
        for (int i = 1; i <= matches; i++) {
            String result = scan.nextLine();
            if (result.equals("W")) {
                points += 3;
                win++;
            }
            if (result.equals("D")) {
                points++;
                draw++;
            }
            if (result.equals("L")) {
                lost++;
            }
        }
        if (matches == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {
            System.out.printf("%s has won %d points during this season.%n", name, points);
            System.out.printf("Total stats:%n");
            System.out.printf("## W: %d%n", win);
            System.out.printf("## D: %d%n", draw);
            System.out.printf("## L: %d%n", lost);
            System.out.printf("Win rate: %.2f%%", win * 1.0 / matches * 100);
        }
    }
}
