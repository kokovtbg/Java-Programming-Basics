package ExamsWTF.Test09And10March2019.Test2;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        for (int i = 1; i <= people; i++) {
            String activity = scan.nextLine();
            if (activity.equals("Back")) {
                back++;
            }
            if (activity.equals("Chest")) {
                chest++;
            }
            if (activity.equals("Legs")) {
                legs++;
            }
            if (activity.equals("Abs")) {
                abs++;
            }
            if (activity.equals("Protein shake")) {
                proteinShake++;
            }
            if (activity.equals("Protein bar")) {
                proteinBar++;
            }
        }
        double workout = back + chest + legs + abs;
        double protein = proteinShake + proteinBar;
        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", workout / people * 100);
        System.out.printf("%.2f%% - protein", protein / people * 100);
    }
}
