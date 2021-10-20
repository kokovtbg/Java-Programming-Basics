package SimpleOperationsCalculations;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double wcm = w * 100;
        double hcm = h * 100;
        double hcm100 = hcm - 100;
        double seatsW = Math.floor(wcm / 120);
        double seatsH = Math.floor(hcm100 / 70);
        double seats = seatsW * seatsH - 3;
        System.out.printf("%.0f", seats);

    }
}
