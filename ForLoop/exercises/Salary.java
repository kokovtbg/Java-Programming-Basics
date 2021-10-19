package ForLoop.exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());

        //n <= 1 >= 10
        //salary <= 500 >= 1500
        //Facebook - 150
        //Instagram - 100
        //Reddit - 50
        for (int i = 1; i <= n; i++) {
            String nameTab = scan.nextLine();
            if (nameTab.equals("Facebook")) {
                salary -= 150;
            }
            if (nameTab.equals("Instagram")) {
                salary -= 100;
            }
            if (nameTab.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%.0f", salary);
        }
    }
}
