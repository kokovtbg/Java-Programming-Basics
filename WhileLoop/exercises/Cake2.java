package WhileLoop.exercises;

import java.util.Scanner;

public class Cake2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());

        int totalPieces = width * length;

        // Може да е число или String "STOP"
        String input = scan.nextLine();

        while (!input.equals("STOP")) {
            int cakePieces = Integer.parseInt(input);
            totalPieces -= cakePieces;

            if (totalPieces <= 0) {
                break;
            }

            // String се ъпдейтва
            input = scan.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", totalPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }
    }
}
