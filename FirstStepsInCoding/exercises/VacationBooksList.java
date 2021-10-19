package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pages = Integer.parseInt(scan.nextLine());
        int pageshour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int alltime = pages / pageshour;
        int hoursday = alltime / days;

        System.out.println(hoursday);
    }
}
