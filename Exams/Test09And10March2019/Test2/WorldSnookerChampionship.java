package ExamsWTF.Test09And10March2019.Test2;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stageChampionship = scan.nextLine();
        String typeTicket = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        String photo = scan.nextLine();

        double price = 0;
        if (stageChampionship.equals("Quarter final")) {
            if (typeTicket.equals("Standard")) {
                price = 55.5;
            }
            if (typeTicket.equals("Premium")) {
                price = 105.2;
            }
            if (typeTicket.equals("VIP")) {
                price = 118.9;
            }
        }
        if (stageChampionship.equals("Semi final")) {
            if (typeTicket.equals("Standard")) {
                price = 75.88;
            }
            if (typeTicket.equals("Premium")) {
                price = 125.22;
            }
            if (typeTicket.equals("VIP")) {
                price = 300.4;
            }
        }
        if (stageChampionship.equals("Final")) {
            if (typeTicket.equals("Standard")) {
                price = 110.10;
            }
            if (typeTicket.equals("Premium")) {
                price = 160.66;
            }
            if (typeTicket.equals("VIP")) {
                price = 400;
            }
        }
        double sum = price * tickets;
        if (sum > 4000) {
            sum *= 0.75;
        } else if (sum > 2500) {
            sum *= 0.9;
            if (photo.equals("Y")) {
                sum += tickets * 40;
            }
        } else {
            if (photo.equals("Y")) {
                sum += tickets * 40;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
