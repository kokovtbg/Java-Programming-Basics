package WhileLoopMore;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int detergentBottles = Integer.parseInt(scan.nextLine());

        int detergentNeeded = 0;
        int dishes1 = 0;
        int dishes2 = 0;
        int pots = 0;
        int sumPots = 0;
        int sumDishes = 0;
        int count = 0;

        String end = scan.nextLine();

        while (!end.equals("End")) {
            count++;

            dishes1 = Integer.parseInt(end);
            if (count % 3 != 0) {
                sumDishes += dishes1;
            } else {
                sumPots += dishes1;
            }
//            dishes2 = Integer.parseInt(scan.nextLine());
//            pots = Integer.parseInt(scan.nextLine());
//            sumDishes += dishes1 + dishes2;
//            sumPots += pots;

            detergentNeeded = detergentBottles * 750 - sumDishes * 5 - sumPots * 15;

            if (detergentNeeded < 0) {
                break;
            }
            end = scan.nextLine();
            }
        if (detergentNeeded >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", sumDishes, sumPots);
            System.out.printf("Leftover detergent %d ml.", detergentNeeded);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!%n", Math.abs(detergentNeeded));
        }
        }
    }

