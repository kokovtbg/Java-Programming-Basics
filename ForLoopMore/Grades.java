package ForLoopMore;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //Top students: (grade >= 5) %
        //Between 4 and 4.99: (grade >= 4 <= 4.99) %
        //Between 3 and 3.99: (grade >= 3 <= 3.99) %
        //Fail: (grade < 3) %
        //Average: %

        double student5 = 0;
        double student4 = 0;
        double student3 = 0;
        double student2 = 0;
        double sumGrade = 0;
        for (int i = 1; i <= n; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            sumGrade += grade;
            if (grade >= 5) {
                student5 += 1;
            }
            if (grade >= 4 && grade <= 4.99) {
                student4 += 1;
            }
            if (grade >= 3 && grade <= 3.99) {
                student3 += 1;
            }
            if (grade < 3) {
                student2 += 1;
            }
        }
        System.out.printf("Top students: %.2f", student5 * 100 / n);
        System.out.println("%");
        System.out.printf("Between 4.00 and 4.99: %.2f", student4 * 100 / n);
        System.out.println("%");
        System.out.printf("Between 3.00 and 3.99: %.2f", student3 * 100 / n);
        System.out.println("%");
        System.out.printf("Fail: %.2f", student2 * 100 / n);
        System.out.println("%");
        System.out.printf("Average: %.2f", sumGrade / n);
    }
}
