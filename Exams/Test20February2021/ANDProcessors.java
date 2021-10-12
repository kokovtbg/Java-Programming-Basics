package ExamsWTF.Test20February2021;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int planCPU = Integer.parseInt(scan.nextLine());
        int labours = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        double manufacturedCPU = Math.floor(labours * days * 8 * 1.0 / 3);
        double realProfit = manufacturedCPU * 110.1;
        double planProfit = planCPU * 110.1;
        if (realProfit >= planProfit) {
            System.out.printf("Profit: -> %.2f BGN", realProfit - planProfit);
        } else {
            System.out.printf("Losses: -> %.2f BGN", planProfit - realProfit);
        }
    }
}
