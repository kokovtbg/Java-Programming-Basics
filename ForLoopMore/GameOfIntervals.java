package ForLoopMore;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //number < 0 && number > 50 - invalid
        //0 - 9 -> 20% * number + number
        //10 - 19 -> 30% * number + number
        //20 - 29 -> 40% * number + number
        //30 - 39 -> 50 + number
        //40 - 50 -> 100 + number
        //invalid -> number / 2

        double number09 = 0;
        double number1019 = 0;
        double number2029 = 0;
        double number3039 = 0;
        double number4050 = 0;
        double invalidNumber = 0;
        double result = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < 0 || number > 50) {
                invalidNumber += 1;
                result *= 0.5;
            }
            if (number >= 0 && number <= 9) {
                number09 += 1;
                result += 0.2 * number;
            }
            if (number >= 10 && number <= 19) {
                number1019 += 1;
                result += 0.3 * number;
            }
            if (number >= 20 && number <= 29) {
                number2029 += 1;
                result += 0.4 * number;
            }
            if (number >= 30 && number <= 39) {
                number3039 += 1;
                result += 50;
            }
            if (number >= 40 && number <= 50) {
                number4050 += 1;
                result += 100;
            }
        }
        System.out.printf("%.2f", result);
        System.out.println();
        System.out.printf("From 0 to 9: %.2f", number09 * 100 / n);
        System.out.println("%");
        System.out.printf("From 10 to 19: %.2f", number1019 * 100 / n);
        System.out.println("%");
        System.out.printf("From 20 to 29: %.2f", number2029 * 100 / n);
        System.out.println("%");
        System.out.printf("From 30 to 39: %.2f", number3039 * 100 / n);
        System.out.println("%");
        System.out.printf("From 40 to 50: %.2f", number4050 * 100 / n);
        System.out.println("%");
        System.out.printf("Invalid numbers: %.2f", invalidNumber * 100 / n);
        System.out.println("%");
    }
}
