package NestedLoopsMore;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstLetter = scan.nextLine();
        String secondLetter = scan.nextLine();
        String thirdLetter = scan.nextLine();

        int counter = 0;
        int aSCIIFirstLetter = firstLetter.charAt(0);
        int aSCIISecondLetter = secondLetter.charAt(0);
        int aSCIIThirdLetter = thirdLetter.charAt(0);
        if (aSCIISecondLetter < aSCIIThirdLetter) {
            for (int i = firstLetter.charAt(0); i <= secondLetter.charAt(0); i++) {
                String combination = String.valueOf((char) i);
                for (int j = firstLetter.charAt(0); j <= secondLetter.charAt(0); j++) {
                    String combination1 = String.valueOf((char) j);
                    for (int k = firstLetter.charAt(0);k <= secondLetter.charAt(0); k++) {
                        counter++;
                        String combination2 = String.valueOf((char) k);
                        System.out.printf("%s%s%s ", combination, combination1, combination2);
                    }
                }
            }
        } else {
            for (int i = firstLetter.charAt(0); i <= secondLetter.charAt(0); i++) {
                String combination = String.valueOf((char) i);
                for (int j = firstLetter.charAt(0); j <= secondLetter.charAt(0); j++) {
                    String combination1 = String.valueOf((char) j);
                    for (int k = firstLetter.charAt(0);k <= secondLetter.charAt(0); k++) {
                            String combination2 = String.valueOf((char) k);
                        if (i != thirdLetter.charAt(0) && j != thirdLetter.charAt(0) && k != thirdLetter.charAt(0)) {
                            counter++;
                            System.out.printf("%s%s%s ", combination, combination1, combination2);
                        }
                    }
                }
            }
        }
        System.out.printf("%d", counter);
    }
}
