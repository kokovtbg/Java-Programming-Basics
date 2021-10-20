package NestedLoops.exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String namePresentation = scan.nextLine();
        double sumAssessment = 0;
        int countPresentation = 0;
        double sumAssessmentAverage = 0;

        while (!namePresentation.equals("Finish")) {
            countPresentation++;
            for (int i = 1; i <= n; i++) {
                double assessment = Double.parseDouble(scan.nextLine());
                sumAssessment += assessment;
            }
            System.out.printf("%s - %.2f.%n", namePresentation, sumAssessment / n);
            sumAssessmentAverage += sumAssessment / n;
            sumAssessment = 0;
            namePresentation = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumAssessmentAverage / countPresentation);
    }
}
