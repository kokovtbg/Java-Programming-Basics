package ConditionalStatements.lab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());

        boolean result = number1 > number2;
        if (result) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }

    }

}
