package ConditionalStatementsMore;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int neededHours = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int menWork = Integer.parseInt(scan.nextLine());

        double workingHours = 0.9 * days * 8 + menWork * 2 * days;
        if (workingHours >= neededHours) {
            System.out.print("Yes!");
            System.out.printf("%.0f", Math.floor(workingHours - neededHours));
            System.out.println(" hours left.");
        } else {
            System.out.print("Not enough time!");
            System.out.printf("%.0f", Math.ceil(neededHours - workingHours));
            System.out.println(" hours needed.");
        }
    }
}
