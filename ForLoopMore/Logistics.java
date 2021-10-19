package ForLoopMore;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //<= 3 tones - 200 lv/tone
        //4 - 11 tones - 175 lv/tone
        //>= 12 tones - 120 lv/tone

        int sumTones = 0;
        double price = 0;
        double tones1 = 0;
        double tones2 = 0;
        double tones3 = 0;
        for (int i = 1; i <= n; i++) {
            double tones = Double.parseDouble(scan.nextLine());
            sumTones += tones;
            if (tones <= 3) {
                price += tones * 200;
                tones1 += tones;
            }
            if (tones >= 4 && tones <= 11) {
                price += tones * 175;
                tones2 += tones;
            }
            if (tones >= 12) {
                price += tones * 120;
                tones3 += tones;
            }
        }
        System.out.printf("%.2f", price / sumTones);
        System.out.println();
        System.out.printf("%.2f", tones1 * 100 / sumTones);
        System.out.println("%");
        System.out.printf("%.2f", tones2 * 100 / sumTones);
        System.out.println("%");
        System.out.printf("%.2f", tones3 * 100 / sumTones);
        System.out.println("%");
    }
}
