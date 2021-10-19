package ForLoopMore;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double seat = Integer.parseInt(scan.nextLine());
        double fans = Integer.parseInt(scan.nextLine());

        double sectorA = 0;
        double sectorB = 0;
        double sectorV = 0;
        double sectorG = 0;
        for (int i = 1; i <= fans; i++) {
            String sector = scan.nextLine();
            if (sector.equals("A")) {
                sectorA += 1;
            }
            if (sector.equals("B")) {
                sectorB += 1;
            }
            if (sector.equals("V")) {
                sectorV += 1;
            }
            if (sector.equals("G")) {
                sectorG += 1;
            }
        }
        System.out.printf("%.2f", sectorA * 100 / fans);
        System.out.println("%");
        System.out.printf("%.2f", sectorB * 100 / fans);
        System.out.println("%");
        System.out.printf("%.2f", sectorV * 100 / fans);
        System.out.println("%");
        System.out.printf("%.2f", sectorG * 100 / fans);
        System.out.println("%");
        System.out.printf("%.2f", fans * 100 / seat);
        System.out.println("%");
    }
}
