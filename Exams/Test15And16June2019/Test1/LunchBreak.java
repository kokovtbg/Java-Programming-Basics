package ExamsWTF.Test15And16June2019.Test1;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String serialName = scan.nextLine();
        int durationEpisode = Integer.parseInt(scan.nextLine());
        int durationLunch = Integer.parseInt(scan.nextLine());

        double neededTime = durationLunch * 1.0 / 8 + durationLunch * 1.0 / 4 + durationEpisode;
        if (neededTime <= durationLunch) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(durationLunch - neededTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, Math.ceil(neededTime - durationLunch));
        }
    }
}
