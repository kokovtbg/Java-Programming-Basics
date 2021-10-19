package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Прочитане на входни данни
        double sqmeters = Double.parseDouble(scan.nextLine());

        //Изчисления
        double price = sqmeters * 7.61;
        double discount = price * 0.18;
        double fprice = price - discount;

        //Принтиране на конзолата
        System.out.println("The final price is " + fprice + " lv.");
        System.out.println("The discount is " + discount + " lv.");
    }
}
