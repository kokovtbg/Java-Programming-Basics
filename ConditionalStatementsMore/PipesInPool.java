package ConditionalStatementsMore;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double litres = p1 * h + p2 * h;
        if (litres <= v) {
            System.out.print("Thee pool is ");
            System.out.printf("%.2f", litres * 100 / v);
            System.out.print("% full. Pipe 1: ");
            System.out.printf("%.2f", p1 * h * 100 / litres);
            System.out.print("%. Pipe 2: ");
            System.out.printf("%.2f", p2 * h * 100 / litres);
            System.out.println("%.");
        } else {
            System.out.print("For ");
            System.out.printf("%.2f", h);
            System.out.print(" hours the pool overflows with ");
            System.out.printf("%.2f", litres - v);
            System.out.println(" liters.");

        }
    }
}
