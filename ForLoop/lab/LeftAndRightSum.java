package ForLoop.lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // left Sum
        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            leftSum += Integer.parseInt(scan.nextLine());
        }

        // right Sum
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            rightSum += Integer.parseInt(scan.nextLine());
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }
    }
}
