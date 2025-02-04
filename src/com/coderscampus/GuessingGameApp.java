package com.coderscampus;

import java.util.Scanner;

public class GuessingGameApp {
    public static void main(String[] args) {

        int numbersOfAttempts = 0;
        final int MAX_ATTEMPTS = 5;
        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 100");

        while(numbersOfAttempts < MAX_ATTEMPTS) {
            int guessedNumber = Integer.parseInt(scanner.nextLine());

            if (guessedNumber < 1 || guessedNumber > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");
                continue;
            }
                numbersOfAttempts++;

                if (guessedNumber == randomNumber) {
                    System.out.println("You win");
                    scanner.close();
                    return;
                } else if (guessedNumber < randomNumber) {
                    System.out.println("Please pick a higher number");
                } else {
                    System.out.println("Please pick a lower number");
                }

        }

        System.out.println("You lose");
        System.out.println("The number to guess was: " + randomNumber);
        scanner.close();

    }
}