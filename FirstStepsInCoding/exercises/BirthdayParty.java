package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());

        double cake = rent * 0.2;
        double drinks = cake - (cake * 45 / 100);
        double animator = rent / 3.0;
        double sum = rent + cake + drinks + animator;

        System.out.println(sum);
    }
}
