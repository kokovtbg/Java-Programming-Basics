package WhileLoop.lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int volume = width * length * height;
        boolean hasVolume = true;
        String done = scan.nextLine();
        while (!done.equals("Done")) {
            int numberBox = Integer.parseInt(done);
            volume -= numberBox;
            if (volume < 0) {
                hasVolume = false;
                break;
            }
            done = scan.nextLine();
        }
        if (hasVolume) {
            System.out.printf("%d Cubic meters left.", volume);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }
    }
}
