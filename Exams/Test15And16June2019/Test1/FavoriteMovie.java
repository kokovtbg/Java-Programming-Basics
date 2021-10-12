package ExamsWTF.Test15And16June2019.Test1;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxASCII = Integer.MIN_VALUE;
        String movieMax = "";
        int count = 0;
        String command = scan.nextLine();
        while (!command.equals("STOP")) {
            int sumASCII = 0;
            count++;
            if (count == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            for (int i = 0; i < command.length(); i++) {
                int asciiNumber = command.charAt(i);
                if (asciiNumber >= 65 && asciiNumber <= 90) {
                    asciiNumber -= command.length();
                }
                if (asciiNumber >= 97 && asciiNumber <= 122) {
                    asciiNumber -= command.length() * 2;
                }
                sumASCII += asciiNumber;
            }
            if (sumASCII > maxASCII) {
                maxASCII = sumASCII;
                movieMax = command;
            }

            command = scan.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", movieMax, maxASCII);
    }
}
