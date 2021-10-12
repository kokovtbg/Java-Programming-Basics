package ExamsWTF.Test18And19July2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameCompany = scan.nextLine();
        int ticketAdult = Integer.parseInt(scan.nextLine());
        int ticketKid = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        double tax = Double.parseDouble(scan.nextLine());

        double profit = ((price + tax) * ticketAdult + (price * 0.3 + tax) * ticketKid) * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameCompany, profit);
    }
}
