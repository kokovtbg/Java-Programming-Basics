package ForLoopMore;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double sumElectricity = 0;
        double sumOther = 0;
        double sumWater = n * 20;
        double sumInternet = n * 15;
        for (int i = 1; i <= n; i++) {
            double electricity = Double.parseDouble(scan.nextLine());
            sumElectricity += electricity;
            sumOther += (electricity + 20 + 15) * 1.2;
        }
        System.out.printf("Electricity: %.2f lv", sumElectricity);
        System.out.println();
        System.out.printf("Water: %.2f lv", sumWater);
        System.out.println();
        System.out.printf("Internet: %.2f lv", sumInternet);
        System.out.println();
        System.out.printf("Other: %.2f lv", sumOther);
        System.out.println();
        System.out.printf("Average: %.2f lv", (sumElectricity + sumWater + sumInternet + sumOther) / n);
        System.out.println();
    }
}
