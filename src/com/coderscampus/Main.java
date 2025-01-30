package com.coderscampus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int numbersOfAttempts = 0;
        int maxAttempts = 5;
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Pick a number between 1 and 100");
        Scanner scanner = new Scanner(System.in);
        String guessedString = scanner.nextLine();
        int guessedNumber = Integer.parseInt(guessedString);

        while(numbersOfAttempts < maxAttempts) {

            if (guessedNumber < 1 || guessedNumber > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");
            } else {

                if (guessedNumber == randomNumber) {
                    System.out.println("You win");
                    break;
                } else if (guessedNumber < randomNumber) {
                    System.out.println("Please pick a higher number");
                    numbersOfAttempts++;
                } else {
                    System.out.println("Please pick a lower number");
                    numbersOfAttempts++;
                }

            }

            if(numbersOfAttempts == maxAttempts){
                System.out.println("You lose");
                System.out.println("The number to guess was: " + randomNumber);
                break;
            }

            guessedString = scanner.nextLine();
            guessedNumber = Integer.parseInt(guessedString);

        }

    }
}