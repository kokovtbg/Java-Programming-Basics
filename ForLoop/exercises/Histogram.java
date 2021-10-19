package ForLoop.exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //>=1   <=199 p1 %  //n1 / n * 100
        //>=200 <=399 p2 %  //n2 / n * 100
        //>=400 <=599 p3 %  //n3 / n * 100
        //>=600 <=799 p4 %  //n4 / n * 100
        //>=800 <=1000 p5 % //n5 / n * 100
        //n >=1 <=1000
        double sumP1 = 0;
        double sumP2 = 0;
        double sumP3 = 0;
        double sumP4 = 0;
        double sumP5 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num >= 1 && num <= 199) {
                sumP1 += 1;
            }
            if (num >= 200 && num <= 399) {
                sumP2 += 1;
            }
            if (num >= 400 && num <= 599) {
                sumP3 += 1;
            }
            if (num >= 600 && num <= 799) {
                sumP4 += 1;
            }
            if (num >= 800 && num <= 1000) {
                sumP5 += 1;
            }
        }
        System.out.printf("%.2f", sumP1 * 100 / n);
        System.out.println("%");
        System.out.printf("%.2f", sumP2 * 100 / n);
        System.out.println("%");
        System.out.printf("%.2f", sumP3 * 100 / n);
        System.out.println("%");
        System.out.printf("%.2f", sumP4 * 100 / n);
        System.out.println("%");
        System.out.printf("%.2f", sumP5 * 100 / n);
        System.out.println("%");
    }
}
