package ExamsWTF.Test06And07July2019.Test1;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double nightPrice = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        if (nights > 7) {
            nightPrice *= 0.95;
        }
        double sum = budget * percent / 100 + nights * nightPrice;
        if (sum <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - sum);
        } else {
            System.out.printf("%.2f leva needed.", sum - budget);
        }
    }
}
