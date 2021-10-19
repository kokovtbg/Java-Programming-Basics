package ConditionalStatements.lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = Integer.parseInt(scan.nextLine());

        boolean excellentResult = result >= 5;
        if (excellentResult) {
            System.out.println("Excellent!");
        }
    }
}
