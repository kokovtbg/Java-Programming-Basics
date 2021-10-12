package ExamsWTF.Test09And10March2019.Test2;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tennisRacketPrice = Double.parseDouble(scan.nextLine());
        int tennisRackets = Integer.parseInt(scan.nextLine());
        int sneakers = Integer.parseInt(scan.nextLine());

        double price = tennisRackets * tennisRacketPrice + sneakers * tennisRacketPrice / 6 + (tennisRackets * tennisRacketPrice + sneakers * tennisRacketPrice / 6) * 0.2;
        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(price / 8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(price * 7 / 8));
    }
}
