package FirstStepsInCoding.lab;

import java.util.Scanner;

public class InchesCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double a = 2.54;
        double inch = Double.parseDouble(input);
        double result = a * inch;
        System.out.println(result);

    }
}
