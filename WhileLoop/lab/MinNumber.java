package WhileLoop.lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int min = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber < min) {
                min = currentNumber;
            }
            input = scan.nextLine();
        }
        System.out.println(min);
    }
}