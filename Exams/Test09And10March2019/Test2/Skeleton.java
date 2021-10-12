package ExamsWTF.Test09And10March2019.Test2;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesControl = Integer.parseInt(scan.nextLine());
        int secondsControl = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        int seconds100Meters = Integer.parseInt(scan.nextLine());

        int controlSeconds = minutesControl * 60 + secondsControl;
        double secondsAll = length / 100 * seconds100Meters - length / 120 * 2.5;
        if (secondsAll <= controlSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", secondsAll);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", secondsAll - controlSeconds);
        }
    }
}
