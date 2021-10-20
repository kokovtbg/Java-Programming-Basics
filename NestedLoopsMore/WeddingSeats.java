package NestedLoopsMore;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lastSector = scan.nextLine();
        int rowsSectorA = Integer.parseInt(scan.nextLine());
        int seatsOddRow = Integer.parseInt(scan.nextLine());

        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int ASCIILastSector = lastSector.charAt(0);
        for (int i = 65; i <= ASCIILastSector; i++) {
            String sector = String.valueOf((char) i);
            for (int j = 1; j <= rowsSectorA + i - 65; j++) {
                if (j % 2 != 0) {
                    for (int k = 97; k <= seatsOddRow + 96; k++) {
                        String seats = String.valueOf((char) k);
                        counter1++;
                        System.out.println(sector + j + seats);
                    }
                } else {
                    for (int k = 97; k <= seatsOddRow + 96 + 2; k++) {
                        String seats = String.valueOf((char) k);
                        counter2++;
                        System.out.println(sector + j + seats);
                    }
                }
                }
            }
        counter = counter1 + counter2;
        System.out.println(counter);
        }
    }
