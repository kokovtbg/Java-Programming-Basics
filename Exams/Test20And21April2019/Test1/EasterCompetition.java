package ExamsWTF.Test20And21April2019.Test1;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int easterBread = Integer.parseInt(scan.nextLine());

        int maxPoints = Integer.MIN_VALUE;
        String nameBakerNumber1 = "";
        for (int i = 1; i <= easterBread; i++) {
            String nameBaker = scan.nextLine();
            String command = scan.nextLine();
            int pointsBread = 0;
            while (!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                pointsBread += points;

                command = scan.nextLine();
            }
            System.out.printf("%s has %d points.%n", nameBaker, pointsBread);
            if (pointsBread > maxPoints) {
                maxPoints = pointsBread;
                nameBakerNumber1 = nameBaker;
                System.out.printf("%s is the new number 1!%n", nameBaker);
            }
        }
        System.out.printf("%s won competition with %d points!", nameBakerNumber1, maxPoints);
    }
}
