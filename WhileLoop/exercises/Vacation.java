package WhileLoop.exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scan.nextLine());
        double ownedMoney = Double.parseDouble(scan.nextLine());

        int daysCounter = 0;
        int spendingCounter = 0;

        // Докато Джеси не събере парите прочитай команда spend / save
        while (ownedMoney < neededMoney && spendingCounter < 5) {
            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            daysCounter++;
            //Команда spend / save
            if (command.equals("save")) {
                ownedMoney += money;
                spendingCounter = 0;
            } else if (command.equals("spend")) {
                ownedMoney -= money;
                spendingCounter += 1;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
        }
        // Ако 5 последователни дни само харчи
        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
