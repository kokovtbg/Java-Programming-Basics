package ExamsWTF.Test28And29March2020.Test1;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scan.nextLine());
        double yuan = Double.parseDouble(scan.nextLine());
        double commission = Double.parseDouble(scan.nextLine());

        double sum = (bitcoin * 1168 + yuan * 0.15 * 1.76) / 1.95 * (1 - commission / 100);
        System.out.printf("%.2f", sum);
    }
}
