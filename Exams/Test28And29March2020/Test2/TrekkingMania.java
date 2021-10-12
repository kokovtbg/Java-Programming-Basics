package ExamsWTF.Test28And29March2020.Test2;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groups = Integer.parseInt(scan.nextLine());

        double musala = 0;
        double montBlanc = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        double allTrek = 0;
        for (int i = 1; i <= groups; i++) {
            int peopleTrek = Integer.parseInt(scan.nextLine());
            allTrek += peopleTrek;
            if (peopleTrek <= 5) {
                musala += peopleTrek;
            }
            if (peopleTrek >= 6 && peopleTrek <= 12) {
                montBlanc += peopleTrek;
            }
            if (peopleTrek >= 13 && peopleTrek <= 25) {
                kilimanjaro += peopleTrek;
            }
            if (peopleTrek >= 26 && peopleTrek <= 40) {
                k2 += peopleTrek;
            }
            if (peopleTrek >= 41) {
                everest += peopleTrek;
            }
        }
        System.out.printf("%.2f%%%n", musala / allTrek * 100);
        System.out.printf("%.2f%%%n", montBlanc / allTrek * 100);
        System.out.printf("%.2f%%%n", kilimanjaro / allTrek * 100);
        System.out.printf("%.2f%%%n", k2 / allTrek * 100);
        System.out.printf("%.2f%%", everest / allTrek * 100);
    }
}
