package ExamsWTF.Test20And21April2019.Test2;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int clients = Integer.parseInt(scan.nextLine());

        double totalSum = 0;
        for (int i = 1; i <= clients; i++) {
            String command = scan.nextLine();
            double sum = 0;
            int count = 0;
            while (!command.equals("Finish")) {
                if (command.equals("basket")){
                    sum += 1.5;
                    count++;
                }
                if (command.equals("wreath")) {
                    sum += 3.8;
                    count++;
                }
                if (command.equals("chocolate bunny")) {
                    sum += 7;
                    count++;
                }
                command = scan.nextLine();
            }
            if (count % 2 == 0) {
                sum *= 0.8;
            }
            totalSum += sum;
            System.out.printf("You purchased %d items for %.2f leva.%n", count, sum);
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalSum / clients);
    }
}
