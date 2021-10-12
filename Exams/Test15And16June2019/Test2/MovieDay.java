package ExamsWTF.Test15And16June2019.Test2;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int timeShoot = Integer.parseInt(scan.nextLine());
        int scenes = Integer.parseInt(scan.nextLine());
        int timeScene = Integer.parseInt(scan.nextLine());

        double timeNeeded = timeShoot * 0.15 + scenes * timeScene;
        if (timeNeeded <= timeShoot) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeShoot - timeNeeded);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", timeNeeded - timeShoot);
        }
    }
}
