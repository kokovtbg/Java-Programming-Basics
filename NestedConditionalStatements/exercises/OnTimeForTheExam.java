package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hourExam = Integer.parseInt(scan.nextLine());
        int minuteExam = Integer.parseInt(scan.nextLine());
        int hourArrive = Integer.parseInt(scan.nextLine());
        int minuteArrive = Integer.parseInt(scan.nextLine());

        double minutesExam = hourExam * 60 + minuteExam;
        double minutesArrive = hourArrive * 60 + minuteArrive;
            if (minutesArrive > minutesExam && (minutesArrive - minutesExam) < 60) {
                System.out.println("Late");
                System.out.printf("%.0f minutes after the start", minutesArrive - minutesExam);
                System.out.println();
            }
            if (minutesArrive > minutesExam && (minutesArrive - minutesExam) >= 60 && (minutesArrive - minutesExam) % 60 != 0) {
                System.out.println("Late");
                System.out.printf("%.0f:%.0f hours after the start", Math.floor((minutesArrive - minutesExam) / 60), Math.floor((minutesArrive - minutesExam) % 60));
                System.out.println();
            }
            if (minutesArrive > minutesExam && (minutesArrive - minutesExam) >= 60 && (minutesArrive - minutesExam) % 60 == 0) {
                System.out.println("Late");
                System.out.printf("%.0f:0%.0f hours after the start", Math.floor((minutesArrive - minutesExam) / 60), Math.floor((minutesArrive - minutesExam) % 60));
            }
            if (minutesArrive < minutesExam && (minutesExam - minutesArrive) <= 30) {
                System.out.println("On time");
                System.out.printf("%.0f minutes before the start", minutesExam - minutesArrive);
                System.out.println();
            }
            if (minutesArrive == minutesExam) {
                System.out.println("On time");
            }
            if (minutesArrive < minutesExam && (minutesExam - minutesArrive) > 30 && (minutesExam - minutesArrive) < 60) {
                System.out.println("Early");
                System.out.printf("%.0f minutes before the start", minutesExam - minutesArrive);
                System.out.println();
            }
            if (minutesArrive < minutesExam && (minutesExam - minutesArrive) > 30 && (minutesExam - minutesArrive) >= 60 && (minutesExam - minutesArrive) % 60 != 0) {
                System.out.println("Early");
                System.out.printf("%.0f:%.0f hours before the start", Math.floor((minutesExam - minutesArrive) / 60), Math.floor((minutesExam - minutesArrive) % 60));
                System.out.println();
            }
            if (minutesArrive < minutesExam && (minutesExam - minutesArrive) > 30 && (minutesExam - minutesArrive) >= 60 && (minutesExam - minutesArrive) % 60 == 0) {
                System.out.println("Early");
                System.out.printf("%.0f:0%.0f hours before the start", Math.floor((minutesExam - minutesArrive) / 60), Math.floor((minutesExam - minutesArrive) % 60));
                System.out.println();
            }
    }
}
