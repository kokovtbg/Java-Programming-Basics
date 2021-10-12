package ExamsWTF.Test20February2021;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pricePage = Double.parseDouble(scan.nextLine());
        double priceCover = Double.parseDouble(scan.nextLine());
        int percentPages = Integer.parseInt(scan.nextLine());
        double design = Double.parseDouble(scan.nextLine());
        int percentTeam = Integer.parseInt(scan.nextLine());

        double sum = ((pricePage * 899 + priceCover * 2) * (100 - percentPages) / 100 + design) * (100 - percentTeam) / 100;
        System.out.printf("Avtonom should pay %.2f BGN.", sum);
    }
}
