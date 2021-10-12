package ExamsWTF.Test06And07April2019;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameMovie = scan.nextLine();
        String typeHall = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());

        double priceTicket = 0;
        if (nameMovie.equals("A Star Is Born")) {
            if (typeHall.equals("normal")) {
                priceTicket = 7.5;
            }
            if (typeHall.equals("luxury")) {
                priceTicket = 10.5;
            }
            if (typeHall.equals("ultra luxury")) {
                priceTicket = 13.5;
            }
        }
        if (nameMovie.equals("Bohemian Rhapsody")) {
            if (typeHall.equals("normal")) {
                priceTicket = 7.35;
            }
            if (typeHall.equals("luxury")) {
                priceTicket = 9.45;
            }
            if (typeHall.equals("ultra luxury")) {
                priceTicket = 12.75;
            }
        }
        if (nameMovie.equals("Green Book")) {
            if (typeHall.equals("normal")) {
                priceTicket = 8.15;
            }
            if (typeHall.equals("luxury")) {
                priceTicket = 10.25;
            }
            if (typeHall.equals("ultra luxury")) {
                priceTicket = 13.25;
            }
        }
        if (nameMovie.equals("The Favourite")) {
            if (typeHall.equals("normal")) {
                priceTicket = 8.75;
            }
            if (typeHall.equals("luxury")) {
                priceTicket = 11.55;
            }
            if (typeHall.equals("ultra luxury")) {
                priceTicket = 13.95;
            }
        }
        double profit = tickets * priceTicket;
        System.out.printf("%s -> %.2f lv.", nameMovie, profit);
    }
}
