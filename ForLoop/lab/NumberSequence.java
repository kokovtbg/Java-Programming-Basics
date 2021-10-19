package ForLoop.lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < smallest) {
                smallest = num;
            }
            if (num > biggest) {
                biggest = num;
            }
        }
        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d", smallest);
    }
}
