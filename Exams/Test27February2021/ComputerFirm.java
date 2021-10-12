package ExamsWTF.Test27February2021;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double ratingAll = 0;
        double salesAll = 0;
        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scan.nextLine());
            double rating = number % 10;
            double sales = Math.floor(number / 10);
            if (rating == 2) {
                sales *= 0;
                ratingAll += 2;
            }
            if (rating == 3) {
                sales *= 0.5;
                ratingAll += 3;
            }
            if (rating == 4) {
                sales *= 0.7;
                ratingAll += 4;
            }
            if (rating == 5) {
                sales *= 0.85;
                ratingAll += 5;
            }
            if (rating == 6) {
                ratingAll += 6;
            }
            salesAll += sales;
        }
        System.out.printf("%.2f%n", salesAll);
        System.out.printf("%.2f", ratingAll / n);
    }
}
