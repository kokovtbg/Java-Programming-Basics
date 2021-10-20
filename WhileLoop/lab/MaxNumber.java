package WhileLoop.lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String stop = scan.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        while (!stop.equals("Stop")) {
            int numberCurrent = Integer.parseInt(stop);

            if (numberCurrent > maxNumber) {
                maxNumber = numberCurrent;
            }
            stop = scan.nextLine();
        }
        System.out.println(maxNumber);
    }
}
