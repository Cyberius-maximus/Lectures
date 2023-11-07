package Lecture2;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char character = scanner.next().charAt(0);

        switch (Character.toLowerCase(character)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(character + " is a vowel.");
                break;
            default:
                if (Character.isLetter(character)) {
                    System.out.println(character + " is a consonant.");
                } else {
                    System.out.println("Invalid input. Please enter a single character.");
                }
        }

        scanner.close();
    }
}

