package ExamsWTF.Test28And29March2020.Test2;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double metres = Double.parseDouble(scan.nextLine());
        double secondsMeter = Double.parseDouble(scan.nextLine());

        double secondsToRecord = metres * secondsMeter + Math.floor(metres / 50) * 30;
        if (secondsToRecord < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", secondsToRecord);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", secondsToRecord - record);
        }
    }
}
