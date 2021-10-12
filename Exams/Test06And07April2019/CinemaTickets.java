package ExamsWTF.Test06And07April2019;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int totalTickets = 0;
        int studentAll = 0;
        int standardAll = 0;
        int kidAll = 0;
        while (!command.equals("Finish")) {
            int freeSeats = Integer.parseInt(scan.nextLine());
            String command2 = scan.nextLine();
            int student = 0;
            int standard = 0;
            int kid = 0;
            while (!command2.equals("End")) {
                if (command2.equals("student")) {
                    student++;
                    totalTickets++;
                    studentAll++;
                }
                if (command2.equals("standard")) {
                    standard++;
                    totalTickets++;
                    standardAll++;
                }
                if (command2.equals("kid")) {
                    kid++;
                    totalTickets++;
                    kidAll++;
                }
                if (student + standard + kid == freeSeats) {
                    break;
                }

                command2 = scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", command, (student + standard + kid) * 1.0 / freeSeats * 100);

            command = scan.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentAll * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardAll * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidAll * 1.0 / totalTickets * 100);
    }
}
