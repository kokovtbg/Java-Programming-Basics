package ExamsWTF.Test20February2021;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int locations = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= locations; i++) {
            double expectedAverageGoldDay = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            double averageGoldDay = 0;
            for (int j = 1; j <= days; j++) {
                double goldDay = Double.parseDouble(scan.nextLine());
                averageGoldDay += goldDay;
            }
            averageGoldDay /= days;
            if (averageGoldDay >= expectedAverageGoldDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldDay);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedAverageGoldDay - averageGoldDay);
            }
        }
    }
}
