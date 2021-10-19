package ForLoopMore;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int value = 0;
        int lastValue = 0;
        int counter = 0;
        int maxDiff = 0;

        for (int i = 1; i <= n; i++) {

            int numberOne = Integer.parseInt(scan.nextLine());
            int numberTwo = Integer.parseInt(scan.nextLine());
            value = numberOne + numberTwo;

            if (value == lastValue) {
                counter++;
            }
            if (maxDiff < Math.abs(lastValue - value) && i >= 2) {
                maxDiff = Math.abs(lastValue - value);
            }
            if (value != lastValue) {
                lastValue = value;
            }
        }
        if (counter == n - 1) {
            System.out.println("Yes, value=" + value);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
