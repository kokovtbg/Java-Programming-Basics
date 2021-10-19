package ConditionalStatements.exercises;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = Double.parseDouble(scan.nextLine());
        double avgScore = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());

        double socialScholarship = 0;
        double excellentScholarsip = 0;

        String output = "";

        //Проверка за социална стипендия
        if (avgScore > 4.5) {
            if (income < minSalary) {
                socialScholarship = Math.floor(minSalary * 0.35);
            }
        }
        //Проверка за отлична стипендия
        if (avgScore >= 5.5) {
            excellentScholarsip = Math.floor(avgScore * 25);
        }
        //Проверка дали може да получи стипендия(социална или отлична)
        if (socialScholarship == 0 && excellentScholarsip == 0) {
            output = "You cannot get a scholarship!";

            //Проверка коя стипендия е по-висока и ще дадем нея
            } else if (socialScholarship > excellentScholarsip) {
            output = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
        } else {
            output = String.format("You get a scholarship for excellent results %.0f BGN", excellentScholarsip);
        }

        //Принтиране на резултата
        System.out.println(output);
    }

}

