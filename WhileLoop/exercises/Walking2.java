package WhileLoop.exercises;

import java.util.Scanner;

public class Walking2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal = 10000;
        int totalSteps = 0;

        // Докато Габи не достигне 10 000 стъпки чети по един ред от конзолата
        while (totalSteps < goal) {
            String line = scan.nextLine();

            if (line.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scan.nextLine());
                totalSteps += stepsToHome;
                break;
            }
            int currentSteps = Integer.parseInt(line);
            totalSteps += currentSteps;
        }
        if (totalSteps >= goal) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", totalSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - totalSteps);

        }
    }
}
