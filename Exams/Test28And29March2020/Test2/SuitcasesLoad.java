package ExamsWTF.Test28And29March2020.Test2;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double capacity = Double.parseDouble(scan.nextLine());

        String command = scan.nextLine();
        int count = 0;
        while (!command.equals("End")) {
            double volumeSuitcase = Double.parseDouble(command);
            if ((count + 1) % 3 == 0) {
                volumeSuitcase *= 1.1;
            }
            capacity -= volumeSuitcase;
            if (capacity < 0) {
                break;
            }
            count++;
            command = scan.nextLine();
        }
        if (capacity >= 0) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}
