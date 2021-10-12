package ExamsWTF.Test06And07April2019;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rent = Integer.parseInt(scan.nextLine());

        double sum = rent + rent * 0.7 + rent * 0.7 * 0.85 + rent * 0.7 * 0.85 / 2;
        System.out.printf("%.2f", sum);
    }
}
