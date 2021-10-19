package ConditionalStatements.exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double timeMeter = Double.parseDouble(scan.nextLine());

        double time = meters * timeMeter;
        double bugTime = Math.floor(meters / 15) * 12.5;
        double neededTime = time + bugTime;
        if (neededTime < record) {
            System.out.print("Yes, he succeeded! The new world record is ");
            System.out.printf("%.02f", neededTime);
            System.out.println(" seconds.");
        } else {
            System.out.print("No, he failed! He was ");
            System.out.printf("%.02f", neededTime - record);
            System.out.println(" seconds slower.");
        }
    }
}
