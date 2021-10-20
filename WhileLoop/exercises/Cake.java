package WhileLoop.exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        int pieces = a * b;
        int piecesGiven = 0;

        while (piecesGiven <= pieces) {
            String stop = scan.nextLine();

            if (stop.equals("STOP")) {
                System.out.printf("%d pieces are left.", pieces - piecesGiven);
                break;
            } else {
                piecesGiven += Integer.parseInt(stop);
            }
            if (piecesGiven > pieces) {
                System.out.printf("No more cake left! You need %d pieces more.", piecesGiven - pieces);
                break;
            }
        }
    }
}
