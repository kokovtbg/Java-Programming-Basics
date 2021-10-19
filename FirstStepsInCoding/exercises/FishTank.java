package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volume = length * width * height * 0.001;
        double percentpercent = percent / 100;
        double volumewater = volume - percentpercent * volume;

        System.out.printf("%.2f", volumewater);
    }
}
