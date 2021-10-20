package WhileLoop.exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumSteps = 0;

        while (true) {
            String goHome = scan.nextLine();

            if (goHome.equals("Going home")) {
                int stepsHome = Integer.parseInt(scan.nextLine());
                sumSteps += stepsHome;
                break;
            } else {
                int currentSteps = Integer.parseInt(goHome);
                sumSteps += currentSteps;
                if (sumSteps >= 10000) {
                    break;
                }
            }
        }
        if (sumSteps >= 10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", sumSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        }
    }
}
