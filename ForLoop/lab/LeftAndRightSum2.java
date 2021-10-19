package ForLoop.lab;

import java.util.Scanner;

public class LeftAndRightSum2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int leftSum = 0;
        int rightSum = 0;
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 2*n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (i <= (2*n / 2)){
                rightSum += num;
            } else {
                leftSum += num;
            }
        }
        int difference = Math.abs(rightSum - leftSum);
        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            System.out.printf("No, diff = %d", difference);
        }
    }
}
