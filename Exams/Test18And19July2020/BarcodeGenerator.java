package ExamsWTF.Test18And19July2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberBegin = Integer.parseInt(scan.nextLine());
        int numberEnd = Integer.parseInt(scan.nextLine());

        //2345
        double firstBegin = Math.floor(numberBegin * 1.0 / 1000);
        double secondBegin = Math.floor((numberBegin % 1000) * 1.0 / 100);
        double thirdBegin = Math.floor((numberBegin % 100) * 1.0 / 10);
        double fourBegin = numberBegin % 10;

        double firstEnd = Math.floor(numberEnd * 1.0 / 1000);
        double secondEnd = Math.floor((numberEnd % 1000) * 1.0 / 100);
        double thirdEnd = Math.floor((numberEnd % 100) * 1.0 / 10);
        double fourEnd = numberEnd % 10;

        for (double i = firstBegin; i <= firstEnd; i++) {
            for (double j = secondBegin; j <= secondEnd; j++) {
                for (double k = thirdBegin; k <= thirdEnd; k++) {
                    for (double l = fourBegin; l <= fourEnd; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%.0f%.0f%.0f%.0f ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
