package ExamsWTF.Test06And07July2019.Test2;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();
        double volume = Math.ceil(height * width * 4 * (100 - percent) * 1.0 / 100);

        while (!command.equals("Tired!")) {
            int litresDay = Integer.parseInt(command);

            volume -= litresDay;
            if (volume <= 0) {
                break;
            }

            command = scan.nextLine();
        }
        if (command.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", volume);
        }
        if (volume < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(volume));
        }
        if (volume == 0) {
            System.out.printf("All walls are painted! Great job, Pesho!%n");
        }
    }
}
