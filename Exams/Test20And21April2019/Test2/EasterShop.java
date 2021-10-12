package ExamsWTF.Test20And21April2019.Test2;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggs = Integer.parseInt(scan.nextLine());

        int count = 0;
        String command = scan.nextLine();
        while (!command.equals("Close")) {

            int eggsInOut = Integer.parseInt(scan.nextLine());
            if (command.equals("Buy")) {
                if (eggs < eggsInOut) {
                    System.out.printf("Not enough eggs in store!%n");
                    System.out.printf("You can buy only %d.", eggs);
                    break;
                }
                eggs -= eggsInOut;
                count += eggsInOut;
            }
            if (command.equals("Fill")) {
                eggs += eggsInOut;
            }
            command = scan.nextLine();
        }
        if (command.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", count);
        }
    }
}
