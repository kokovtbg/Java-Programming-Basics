package ConditionalStatements.exercises;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        String inputUnit = scan.nextLine();
        String outputUnit = scan.nextLine();

        if (inputUnit.equals("mm")) {
            if (outputUnit.equals("cm")) {
                double result1 = number * 0.1;
                System.out.printf("%.3f", result1);
            } else if (outputUnit.equals("m")) {
                double result2 = number * 0.001;
                System.out.printf("%.3f", result2);
            }
        }
        if (inputUnit.equals("cm")) {
            if (outputUnit.equals("mm")) {
                double result1 = number * 10;
                System.out.printf("%.3f", result1);
            } else if (outputUnit.equals("m")) {
                double result2 = number * 0.01;
                System.out.printf("%.3f", result2);
            }
        }
        if (inputUnit.equals("m")) {
            if (outputUnit.equals("mm")) {
                double result1 = number * 1000;
                System.out.printf("%.3f", result1);
            } else if (outputUnit.equals("cm")) {
                double result2 = number * 100;
                System.out.printf("%.3f", result2);
            }
        }
    }
}
