package ExamsWTF.Test18And19July2020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int points = 0;
        int pointRed = 0;
        int pointOrange = 0;
        int pointYellow = 0;
        int pointWhite = 0;
        int otherBalls = 0;
        int divides = 0;
        for (int i = 1; i <= n; i++) {
            String ball = scan.nextLine();
            if (ball.equals("red")) {
                points += 5;
                pointRed += 1;
            }
            if (ball.equals("orange")) {
                points += 10;
                pointOrange += 1;
            }
            if (ball.equals("yellow")) {
                points += 15;
                pointYellow += 1;
            }
            if (ball.equals("white")) {
                points += 20;
                pointWhite += 1;
            }
            if (!ball.equals("red") && !ball.equals("orange") && !ball.equals("yellow") && !ball.equals("white") && !ball.equals("black")) {
                otherBalls += 1;
            }
            if (ball.equals("black")) {
                points = points / 2;
                divides += 1;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Points from red balls: %d%n", pointRed);
        System.out.printf("Points from orange balls: %d%n", pointOrange);
        System.out.printf("Points from yellow balls: %d%n", pointYellow);
        System.out.printf("Points from white balls: %d%n", pointWhite);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d%n", divides);
    }
}
