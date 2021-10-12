package ExamsWTF.Test06And07July2019.Test1;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double profitNeeded = Double.parseDouble(scan.nextLine());

        String command = scan.nextLine();
        double sumAll = 0;
        while (!command.equals("Party!")) {
            double sum = 0;
            int drinks = Integer.parseInt(scan.nextLine());
            sum += drinks * command.length();
            if (sum % 2 != 0) {
                sum *= 0.75;
            }
            sumAll += sum;
            if (sumAll >= profitNeeded) {
                break;
            }

            command = scan.nextLine();
        }
        if (command.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", profitNeeded - sumAll);
        }
        if (sumAll >= profitNeeded) {
            System.out.printf("Target acquired.%n");
        }
        System.out.printf("Club income - %.2f leva.", sumAll);
    }
}
