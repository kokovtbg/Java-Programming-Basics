package ExamsWTF.Test06And07April2019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valueVoucher = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();
        int tickets = 0;
        int other = 0;
        while (!command.equals("End")) {
            int sum = 0;

            if (command.length() > 8) {
                sum = command.charAt(0) + command.charAt(1);
                if (sum <= valueVoucher) {
                    valueVoucher -= sum;
                } else {
                    break;
                }
                tickets++;
            } else {
                sum = command.charAt(0);
                if (sum <= valueVoucher) {
                    valueVoucher -= sum;
                } else {
                    break;
                }
                other++;
            }

            command = scan.nextLine();
        }
        System.out.println(tickets);
        System.out.println(other);
    }
}
