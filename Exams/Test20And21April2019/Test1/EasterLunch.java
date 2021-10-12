package ExamsWTF.Test20And21April2019.Test1;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int easterBread = Integer.parseInt(scan.nextLine());
        int eggshell = Integer.parseInt(scan.nextLine());
        int cookies = Integer.parseInt(scan.nextLine());

        double sum = easterBread * 3.2 + eggshell * 4.35 + cookies * 5.4 + eggshell * 12 * 0.15;
        System.out.printf("%.2f", sum);
    }
}
