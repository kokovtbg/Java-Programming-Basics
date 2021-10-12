package ExamsWTF.Test06And07April2019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int movies = Integer.parseInt(scan.nextLine());

        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double sumRating = 0;
        String nameMovieMax = "";
        String nameMovieMin = "";
        for (int i = 1; i <= movies; i++) {
            String nameMovie = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());
            sumRating += rating;
            if (rating > maxRating) {
                maxRating = rating;
                nameMovieMax = nameMovie;
            }
            if (rating < minRating) {
                minRating = rating;
                nameMovieMin = nameMovie;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", nameMovieMax, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", nameMovieMin, minRating);
        System.out.printf("Average rating: %.1f", sumRating / movies);
    }
}
