package ExamsWTF.Test09And10March2019.Test1;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int heightWanted = Integer.parseInt(scan.nextLine());

        int currentJump = Integer.parseInt(scan.nextLine());
        int countJumps = 1;
        int currentHeight = heightWanted - 30;
        boolean threeJumps = false;
        while (currentJump < heightWanted) {
            int fault = 0;

            if (currentJump > currentHeight) {
                currentHeight += 5;
            } else if (currentJump <= currentHeight) {

                for (int i = 1; i <= 2; i++) {
                    fault++;
                    int jump = Integer.parseInt(scan.nextLine());
                    if (jump > currentHeight) {
                        currentHeight += 5;
                        break;
                    }
                    if (fault == 2) {
                        threeJumps = true;
                        fault++;
                        break;
                    }
                }
            }
            if (fault > 0) {
                countJumps += fault;
            } else {
                countJumps++;
            }
            if (threeJumps) {
                break;
            }
            currentJump = Integer.parseInt(scan.nextLine());
        }
        if (currentJump <= currentHeight) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, countJumps);
        }
        if (currentJump > heightWanted) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", heightWanted, countJumps);
        }
    }
}
