package FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int animals = Integer.parseInt(scan.nextLine());
        double dogcost = dogs * 2.5;
        int animalscost = animals * 4;
        double sum = dogcost + animalscost;

        System.out.println(sum + " lv.");


    }

}
