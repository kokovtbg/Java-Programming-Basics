package ExamsWTF.Test27February2021;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rollsPaper = Integer.parseInt(scan.nextLine());
        int rollsCloth = Integer.parseInt(scan.nextLine());
        double litresClue = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        double sum = (rollsPaper * 5.8 + rollsCloth * 7.2 + litresClue * 1.2) * ((100 - percent * 1.0) / 100);
        System.out.printf("%.3f", sum);
    }
}
