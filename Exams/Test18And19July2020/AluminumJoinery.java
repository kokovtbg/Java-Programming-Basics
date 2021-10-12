package ExamsWTF.Test18And19July2020;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countJoinery = Integer.parseInt(scan.nextLine());
        String kindJoinery = scan.nextLine();
        String kindDelivery = scan.nextLine();

        double price = 0;
        double sum = 0;
        if (kindJoinery.equals("90X130") && countJoinery >= 10) {
            price += 110;
            if (countJoinery >= 30 && countJoinery < 60) {
                price *= 0.95;
            }
            if (countJoinery >= 60) {
                price *= 0.92;
            }
        }
        if (kindJoinery.equals("100X150") && countJoinery >= 10) {
            price += 140;
            if (countJoinery >= 40 && countJoinery < 80) {
                price *= 0.94;
            }
            if (countJoinery >= 80) {
                price *= 0.9;
            }
        }
        if (kindJoinery.equals("130X180") && countJoinery >= 10) {
            price += 190;
            if (countJoinery >= 20 && countJoinery < 50) {
                price *= 0.93;
            }
            if (countJoinery >= 50) {
                price *= 0.88;
            }
        }
        if (kindJoinery.equals("200X300") && countJoinery >= 10) {
            price += 250;
            if (countJoinery >= 25 && countJoinery < 50) {
                price *= 0.91;
            }
            if (countJoinery >= 50) {
                price *= 0.86;
            }
        }
        sum += price * countJoinery;
        if (kindDelivery.equals("With delivery")) {
            sum += 60;
        }
        if (countJoinery >= 99) {
            sum *= 0.96;
        }
        if (countJoinery < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", sum);
        }
    }
}
