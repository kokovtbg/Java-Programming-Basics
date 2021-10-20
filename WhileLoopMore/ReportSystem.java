package WhileLoopMore;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = Integer.parseInt(scan.nextLine());

        double sumCS = 0;
        double sumCC = 0;
        double countCS = 0;
        double countCC = 0;

        while (sum > sumCS + sumCC) {
            String end = scan.nextLine();
            if (end.equals("End")) {
                break;
            } else {
                int sum1 = Integer.parseInt(end);
                if (sum1 <= 100) {
                    sumCS += sum1;
                    countCS += 1;
                    System.out.println("Product sold!");
                }
                if (sum1 > 100) {
                    System.out.println("Error in transaction!");
                }
                int sum2 = Integer.parseInt(scan.nextLine());
                if (sum2 >= 10) {
                    sumCC += sum2;
                    countCC += 1;
                    System.out.println("Product sold!");
                }
                if (sum2 < 10) {
                    System.out.println("Error in transaction!");
                }
                if (sumCS + sumCC >= sum) {
                    break;
                }
            }
        }
        if (sumCS + sumCC >= sum) {
            System.out.printf("Average CS: %.2f", sumCS / countCS);
            System.out.println();
            System.out.printf("Average CC: %.2f", sumCC / countCC);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
