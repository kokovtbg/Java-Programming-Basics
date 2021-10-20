package NestedLoops.lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();

        double totalTickets = 0;
        double totalTicketsAllMovies = 0;
        double studentTicket = 0;
        double standardTicket = 0;
        double kidTicket = 0;
        double studentTicketAllMovies = 0;
        double standardTicketAllMovies = 0;
        double kidTicketAllMovies = 0;

        while (!movieName.equals("Finish")) {
            double freeSeats = Double.parseDouble(scan.nextLine());

            String typeTicket = scan.nextLine();

            while (!typeTicket.equals("End") && totalTickets <= freeSeats) {
                if (typeTicket.equals("student")) {
                    totalTickets += 1;
                    studentTicket += 1;
                }
                if (typeTicket.equals("standard")) {
                    totalTickets += 1;
                    standardTicket += 1;
                }
                if (typeTicket.equals("kid")) {
                    totalTickets += 1;
                    kidTicket += 1;
                }
                if (totalTickets == freeSeats) {
                    break;
                }
                typeTicket = scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, totalTickets * 100 / freeSeats);
            totalTicketsAllMovies += totalTickets;
            studentTicketAllMovies += studentTicket;
            standardTicketAllMovies += standardTicket;
            kidTicketAllMovies += kidTicket;

            totalTickets = 0;
            studentTicket = 0;
            kidTicket = 0;
            standardTicket = 0;

            movieName = scan.nextLine();
        }

        System.out.printf("Total tickets: %.0f", totalTicketsAllMovies);
        System.out.println();
        System.out.printf("%.2f%% student tickets.%n", studentTicketAllMovies * 100 / totalTicketsAllMovies);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketAllMovies * 100 / totalTicketsAllMovies);
        System.out.printf("%.2f%% kids tickets.%n", kidTicketAllMovies * 100 / totalTicketsAllMovies);
    }
}
