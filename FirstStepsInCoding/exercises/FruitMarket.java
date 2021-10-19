package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawberryprice = Double.parseDouble(scan.nextLine());
        double banana = Double.parseDouble(scan.nextLine());
        double orange = Double.parseDouble(scan.nextLine());
        double raspberry = Double.parseDouble(scan.nextLine());
        double strawberry = Double.parseDouble(scan.nextLine());

        double raspberryprice = strawberryprice * 0.5;
        double orangeprice = raspberryprice * 0.6;
        double bananaprice = raspberryprice * 0.2;
        double bananasum = bananaprice * banana;
        double strawberrysum = strawberryprice * strawberry;
        double orangesum = orangeprice * orange;
        double raspberrysum = raspberryprice * raspberry;
        double sum = bananasum + strawberrysum + orangesum + raspberrysum;

        System.out.printf("%.2f", sum);
    }
}
