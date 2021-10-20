package NestedLoops.lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int floor = Integer.parseInt(scan.nextLine());
        int room = Integer.parseInt(scan.nextLine());

        // floor % 2 == 0 -> office O20 O21 O22
        // floor % 2 != 0 -> apartment A10 A11 A12

        String apartment = "A";
        String office = "O";
        String longApartment = "L";
        for (int i = floor; i >= 1; i--) {
            for (int j = 0; j < room; j++) {
                if (i % 2 == 0 && i != floor) {
                    System.out.printf("%s%d%d ", office, i, j);
                    //O20 O21 O22
                }
                if (i % 2 != 0 && i != floor) {
                    System.out.printf("%s%d%d ", apartment, i, j);
                    //A10 A11 A12
                }
                if (i == floor) {
                    System.out.printf("%s%d%d ", longApartment, i, j);
                    //L60 L61 || L90 L91
                }
            }
            System.out.println();
        }
    }
}
