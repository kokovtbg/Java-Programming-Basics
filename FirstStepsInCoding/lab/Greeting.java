package FirstStepsInCoding.lab;

import java.util.Scanner;

public class Greeting {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");

    }
}
