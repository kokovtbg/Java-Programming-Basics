package ExamsWTF.Test27February2021;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dancers = Integer.parseInt(scan.nextLine());
        double points = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();

        double sum = dancers * points;
        if (place.equals("Bulgaria")) {
            if (season.equals("summer")) {
                sum *= 0.95;
            }
            if (season.equals("winter")) {
                sum *= 0.92;
            }
        }
        if (place.equals("Abroad")) {
            sum *= 1.5;
            if (season.equals("summer")) {
                sum *= 0.9;
            }
            if (season.equals("winter")) {
                sum *= 0.85;
            }
        }
        double charity = sum * 0.75;
        double sumPerDancers = sum - charity;
        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", sumPerDancers / dancers);
    }
}
