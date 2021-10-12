package ExamsWTF.Test15And16June2019.Test2;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameMovie = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int tickets = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        double profit = days * tickets * ticketPrice - days * tickets * ticketPrice * percent / 100;
        System.out.printf("The profit from the movie %s is %.2f lv.", nameMovie, profit);
    }
}
