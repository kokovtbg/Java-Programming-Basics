package ConditionalStatements.lab;

import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        if (type.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());
            double area = side * side;
            System.out.printf("%.3f", area);
        }
        if (type.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        }
        if (type.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            double area = r * r * Math.PI;
            System.out.printf("%.3f", area);
        }
        if (type.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            double area = a * h / 2;
            System.out.printf("%.3f", area);
        }
    }
}
