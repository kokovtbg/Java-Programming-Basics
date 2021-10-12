package ExamsWTF.Test28And29March2020.Test2;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pen = Integer.parseInt(scan.nextLine());
        int marker = Integer.parseInt(scan.nextLine());
        double litresPreparation = Double.parseDouble(scan.nextLine());
        int percentDiscount = Integer.parseInt(scan.nextLine());

        double sum = (pen * 5.8 + marker * 7.2 + litresPreparation * 1.2) * (1 - percentDiscount * 1.0 / 100);
        System.out.printf("%.3f", sum);
    }
}
