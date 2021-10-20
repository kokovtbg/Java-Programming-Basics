package SimpleOperationsCalculations;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.parseDouble(scan.nextLine());

        if (celsius < 5) {
            System.out.println("unknown");
        } else if (celsius < 35 && celsius >= 26) {
            System.out.println("Hot");
        } else if (celsius < 26 && celsius >= 20.1 ) {
            System.out.println("Warm");
        } else if (celsius < 20.1 && celsius >= 15) {
            System.out.println("Mild");
        } else if (celsius < 15 && celsius >= 12) {
            System.out.println("Cool");
        } else  if (celsius < 12 && celsius >= 5) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
