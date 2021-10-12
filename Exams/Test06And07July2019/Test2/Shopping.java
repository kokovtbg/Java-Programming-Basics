package ExamsWTF.Test06And07July2019.Test2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int nVideoCard = Integer.parseInt(scan.nextLine());
        int mProcessor = Integer.parseInt(scan.nextLine());
        int pRAM = Integer.parseInt(scan.nextLine());

        double sum = nVideoCard * 250 + mProcessor * nVideoCard * 250 * 0.35 + pRAM * nVideoCard * 250 * 0.1;
        if (nVideoCard > mProcessor) {
            sum *= 0.85;
        }
        if (sum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sum - budget);
        }
    }
}
