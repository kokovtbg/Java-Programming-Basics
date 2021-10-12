package ExamsWTF.Test06And07July2019.Test2;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        double maxSum = Double.MIN_VALUE;
        String mostPowerfulWord = "";
        while (!command.equals("End of words")) {
            double sum = 0;
            for (int i = 0; i < command.length(); i++) {
                sum += command.charAt(i);
            }
            if (command.charAt(0) == 'a' || command.charAt(0) == 'e' || command.charAt(0) == 'i' || command.charAt(0) == 'o' || command.charAt(0) == 'u' || command.charAt(0) == 'y' || command.charAt(0) == 'A' || command.charAt(0) == 'E' || command.charAt(0) == 'I' || command.charAt(0) == 'O' || command.charAt(0) == 'U' || command.charAt(0) == 'Y') {
                sum *= command.length();
            } else {
                sum = Math.floor(sum / command.length());
            }
            if (sum > maxSum) {
                maxSum = sum;
                mostPowerfulWord = command;
            }

            command = scan.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, maxSum);
    }
}
