package NestedConditionalStatements.exercises;

import java.util.Scanner;

public class OnTimeForTheExam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinutes = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMinutes = Integer.parseInt(scan.nextLine());

        //Превръщаме всичко в минути
        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;

        String output = "";
        String output2 = "";
        int difference = 0;
        //Early
        if (arriveTime < examTime - 30) {
        output = "Early";
        difference = examTime - arriveTime;
        if (difference < 60) {
            output2 = String.format("%d minutes before the start", difference);
        } else {
            int hour = difference / 60;
            int minutes = difference % 60;
            output2 = String.format("%d:%02d hours before the start", hour, minutes);
        }
        }

        //On time
        else if (arriveTime <= examTime){
        output = "On time";
        difference = examTime - arriveTime;
        output2 = String.format("%d minutes before the start", difference);
        }

        //Late
        else if (arriveTime > examTime) {
        output = "Late";
        difference = arriveTime - examTime;
        if (difference < 60) {
            output2 = String.format("%d, minutes after the start", difference);
        } else {
            int hour = difference / 60;
            int minutes = difference % 60;
            output2 = String.format("%d:%02d hours after the start", hour, minutes);
        }
        }
        System.out.println(output);
        System.out.println(output2);
    }
}
