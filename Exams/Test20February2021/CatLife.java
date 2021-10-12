package ExamsWTF.Test20February2021;

import java.util.Scanner;

public class CatLife {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String breed = scan.nextLine();
        String gender = scan.nextLine();

        int age = 0;
        boolean trueBreed = true;
        if (breed.equals("British Shorthair")) {
            if (gender.equals("m")) {
                age = 13;
            }
            if (gender.equals("f")) {
                age = 14;
            }
        }
        if (breed.equals("Siamese")) {
            if (gender.equals("m")) {
                age = 15;
            }
            if (gender.equals("f")) {
                age = 16;
            }
        }
        if (breed.equals("Persian")) {
            if (gender.equals("m")) {
                age = 14;
            }
            if (gender.equals("f")) {
                age = 15;
            }
        }
        if (breed.equals("Ragdoll")) {
            if (gender.equals("m")) {
                age = 16;
            }
            if (gender.equals("f")) {
                age = 17;
            }
        }
        if (breed.equals("American Shorthair")) {
            if (gender.equals("m")) {
                age = 12;
            }
            if (gender.equals("f")) {
                age = 13;
            }
        }
        if (breed.equals("Siberian")) {
            if (gender.equals("m")) {
                age = 11;
            }
            if (gender.equals("f")) {
                age = 12;
            }
        }
        if (!breed.equals("British Shorthair") && !breed.equals("Siamese") && !breed.equals("Persian") && !breed.equals("Ragdoll") && !breed.equals("American Shorthair") && !breed.equals("Siberian")) {
            trueBreed = false;
            System.out.printf("%s is invalid cat!", breed);
        }
        if (trueBreed) {
            System.out.printf("%.0f cat months", Math.floor(age * 1.0 * 12 / 6));
        }
    }
}
