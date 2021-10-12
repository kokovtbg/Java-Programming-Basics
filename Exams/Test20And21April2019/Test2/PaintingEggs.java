package ExamsWTF.Test20And21April2019.Test2;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sizeEggs = scan.nextLine();
        String colorEggs = scan.nextLine();
        int batch = Integer.parseInt(scan.nextLine());

        int price = 0;
        if (sizeEggs.equals("Large")) {
            if (colorEggs.equals("Red")) {
                price = 16;
            }
            if (colorEggs.equals("Green")) {
                price = 12;
            }
            if (colorEggs.equals("Yellow")) {
                price = 9;
            }
        }
        if (sizeEggs.equals("Medium")) {
            if (colorEggs.equals("Red")) {
                price = 13;
            }
            if (colorEggs.equals("Green")) {
                price = 9;
            }
            if (colorEggs.equals("Yellow")) {
                price = 7;
            }
        }
        if (sizeEggs.equals("Small")) {
            if (colorEggs.equals("Red")) {
                price = 9;
            }
            if (colorEggs.equals("Green")) {
                price = 8;
            }
            if (colorEggs.equals("Yellow")) {
                price = 5;
            }
        }
        double profit = price * batch * 0.65;
        System.out.printf("%.2f leva.", profit);
    }
}
