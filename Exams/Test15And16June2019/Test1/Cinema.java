package ExamsWTF.Test15And16June2019.Test1;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seats = Integer.parseInt(scan.nextLine());

        int income = 0;
        String command = scan.nextLine();
        while (!command.equals("Movie time!")) {
            int people = Integer.parseInt(command);
            if (seats >= people) {
                seats -= people;
            } else {
                System.out.printf("The cinema is full.%n");
                break;
            }
            income += people * 5;
            if (people % 3 == 0) {
                income -= 5;
            }

            command = scan.nextLine();
        }
        if (command.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", seats);
        }
        System.out.printf("Cinema income - %d lv.", income);
    }
}
