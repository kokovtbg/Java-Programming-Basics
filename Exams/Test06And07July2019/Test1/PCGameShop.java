package ExamsWTF.Test06And07July2019.Test1;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = Integer.parseInt(scan.nextLine());

        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int other = 0;
        for (int i = 1; i <= games; i++) {
            String nameGame = scan.nextLine();
            if (nameGame.equals("Hearthstone")) {
                hearthstone++;
            } else if (nameGame.equals("Fornite")) {
                fornite++;
            } else if (nameGame.equals("Overwatch")) {
                overwatch++;
            } else {
                other++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", hearthstone * 1.0 / games * 100);
        System.out.printf("Fornite - %.2f%%%n", fornite * 1.0 / games * 100);
        System.out.printf("Overwatch - %.2f%%%n", overwatch * 1.0 / games * 100);
        System.out.printf("Others - %.2f%%", other * 1.0 / games * 100);
    }
}
