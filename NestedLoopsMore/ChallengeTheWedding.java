package NestedLoopsMore;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        int f = Integer.parseInt(scan.nextLine());
        int all = Integer.parseInt(scan.nextLine());

        int counter = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= f; j++) {
                if (counter == all) {
                    break;
                }
                counter++;
                System.out.printf("(%d <-> %d) ", i, j);
            }
        }
    }
}
