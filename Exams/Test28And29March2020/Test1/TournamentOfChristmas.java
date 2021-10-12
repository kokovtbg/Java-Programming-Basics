package ExamsWTF.Test28And29March2020.Test1;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());

        double sumMoney = 0;
        int winDays = 0;
        int lostDays = 0;
        for (int i = 1; i <= days; i++) {
            String sport = scan.nextLine();
                int wins = 0;
                int lost = 0;
                double sumMoneyDay = 0;
            while (!sport.equals("Finish")) {
                String winLose = scan.nextLine();
                if (winLose.equals("win")) {
                    sumMoneyDay += 20;
                    wins++;
                }
                if (winLose.equals("lose")) {
                    lost++;
                }
                sport = scan.nextLine();
            }
            if (wins > lost) {
                sumMoneyDay *= 1.1;
                winDays++;
            }
            if (wins < lost) {
                lostDays++;
            }
            sumMoney += sumMoneyDay;
        }
        if (winDays > lostDays) {
            System.out.printf("You won the tournament! Total raised money: %.2f", sumMoney * 1.2);
        }
        if (winDays < lostDays) {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumMoney);
        }
    }
}
