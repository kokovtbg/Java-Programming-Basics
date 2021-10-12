package ExamsWTF.Test15And16June2019.Test1;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        String packageMovie = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());

        double price = 0;
        if (projection.equals("John Wick")) {
            if (packageMovie.equals("Drink")) {
                price = 12;
            }
            if (packageMovie.equals("Popcorn")) {
                price = 15;
            }
            if (packageMovie.equals("Menu")) {
                price = 19;
            }
        }
        if (projection.equals("Star Wars")) {
            if (packageMovie.equals("Drink")) {
                price = 18;
            }
            if (packageMovie.equals("Popcorn")) {
                price = 25;
            }
            if (packageMovie.equals("Menu")) {
                price = 30;
            }
            if (tickets >= 4) {
                price *= 0.7;
            }
        }
        if (projection.equals("Jumanji")) {
            if (packageMovie.equals("Drink")) {
                price = 9;
            }
            if (packageMovie.equals("Popcorn")) {
                price = 11;
            }
            if (packageMovie.equals("Menu")) {
                price = 14;
            }
            if (tickets == 2) {
                price *= 0.85;
            }
        }
        System.out.printf("Your bill is %.2f leva.", price * tickets);
    }
}
