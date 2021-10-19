package ForLoopMore;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int treatedPatient = 0;
        int untreatedPatient = 0;

        for (int i = 1; i <= n; i++) {
            int numberPatient = Integer.parseInt(scan.nextLine());
            if (i % 3 != 0 && i < 3 && numberPatient >= 7) {
               // 7 treated max people
                treatedPatient += 7;
                untreatedPatient += (numberPatient - 7);
            }
            if (i % 3 != 0 && i < 3 && numberPatient < 7) {
               // 1 to 6 treated people
                treatedPatient += numberPatient;
            }
            if (i % 3 != 0 && i > 3 && untreatedPatient > treatedPatient && numberPatient >= 8) {
                // 8 max treated people
                treatedPatient += 8;
                untreatedPatient += (numberPatient - 8);
            }
            if (i % 3 != 0 && i > 3 && untreatedPatient > treatedPatient && numberPatient < 8) {
                // 1 to 7 treated people
                treatedPatient += numberPatient;
            }
            if (i % 3 != 0 && i > 3 && untreatedPatient <= treatedPatient && numberPatient >= 7) {
                // 7 max treated people
                treatedPatient += 7;
                untreatedPatient += (numberPatient - 7);
            }
            if (i % 3 != 0 && i > 3 && untreatedPatient <= treatedPatient && numberPatient < 7) {
                // 1 to 6 max treated people
                treatedPatient += numberPatient;
            }



            if (i % 3 == 0 && i != 3 && untreatedPatient > treatedPatient && numberPatient >= 8) {
                // 8 max treated people
                treatedPatient += 8;
                untreatedPatient += (numberPatient - 8);
            }
            if (i % 3 == 0 && i != 3 && untreatedPatient > treatedPatient && numberPatient < 8) {
                // 1 to 7 treated people
                treatedPatient += numberPatient;
            }
            if (i % 3 == 0 && i != 3 && untreatedPatient <= treatedPatient && numberPatient >= 7) {
                // 7 max treated people
                treatedPatient += 7;
                untreatedPatient += (numberPatient - 7);
            }
            if (i % 3 == 0 && i != 3 && untreatedPatient <= treatedPatient && numberPatient < 7) {
                // 1 to 6 treated people
                treatedPatient += numberPatient;
            }
            if (i == 3 && untreatedPatient <= treatedPatient && numberPatient >= 7) {
                // 7 max treated people
                treatedPatient += 7;
                untreatedPatient += (numberPatient - 7);
            }
            if (i == 3 && untreatedPatient <= treatedPatient && numberPatient < 7) {
                // 1 to 7 treated people
                treatedPatient += numberPatient;
            }
            if (i == 3 && untreatedPatient > treatedPatient && numberPatient >= 8) {
                // 8 max treated people
                treatedPatient += 8;
                untreatedPatient += (numberPatient - 8);
            }
            if (i == 3 && untreatedPatient > treatedPatient && numberPatient < 8) {
                // 1 to 7 treated people
                treatedPatient += 7;
            }
        }
        System.out.printf("Treated patients: %d.", treatedPatient);
        System.out.println();
        System.out.printf("Untreated patients: %d.", untreatedPatient);
    }
}
