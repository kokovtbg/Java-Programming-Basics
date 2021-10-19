package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int candyman = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double cakesprice = cakes * 45;
        double wafflesprice = waffles * 5.8;
        double pancakesprice = pancakes * 3.2;
        double sumall = (cakesprice + wafflesprice + pancakesprice) * candyman;
        double sumcompany = sumall * days;
        double sumcosts = sumcompany - sumcompany / 8;

        System.out.printf("%.2f", sumcosts);
    }
}
