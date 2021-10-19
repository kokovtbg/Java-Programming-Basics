package ConditionalStatementsMore;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int freeDays = Integer.parseInt(scan.nextLine());

        int workDays = 365 - freeDays;
        double play = freeDays * 127 + workDays * 63;
        if (play > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%.0f", Math.floor((play - 30000) / 60));
            System.out.print(" hours and ");
            System.out.printf("%.0f", Math.floor((play - 30000) % 60));
            System.out.println(" minutes more for play");
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f", Math.floor((30000 - play) / 60));
            System.out.print(" hours and ");
            System.out.printf("%.0f", Math.floor((30000 - play) % 60));
            System.out.println(" minutes less for play");
        }
    }
}
