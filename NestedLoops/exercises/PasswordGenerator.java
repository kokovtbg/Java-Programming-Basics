package NestedLoops.exercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());


        String firstLetter = "";
        String secondLetter = "";

        //Пример charToString StringToChar intToString StringToInt charToInt intToChar
//        firstNum = "a";
//        int a = firstNum.charAt(0);
//        int k = 97;
//        char a = (char) k;
        // String primer = String.valueOf((char) 97);
        // a = 97 b = 98 c = 99 d = 100 e = 101 f = 102 g = 103 h = 104 i = 105
        for (int i = 1; i < n; i++) {

            for (int j = 1; j < n; j++) {

                for (int k = 97; k <= l + 96; k++) {
                    firstLetter = String.valueOf((char) k);
                    for (int m = 97; m <= l + 96; m++) {
                        secondLetter = String.valueOf((char) m);
                        for (int o = 2; o <= n; o++) {
                           if (o > i && o > j) {
                               System.out.printf("%d%d%s%s%d ", i, j, firstLetter, secondLetter, o);
                           }
                        }
                    }
                }
            }
        }
    }
}
