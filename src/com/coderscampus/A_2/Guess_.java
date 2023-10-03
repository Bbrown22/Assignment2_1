package com.coderscampus.A_2;

import java.util.Random;
import java.util.Scanner;

public class Guess_ {

	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        System.out.println("Let's play a game, guess a number between 1 and 300.");

	        int maxAttempts = 5;
	        int attempts = 0;
	        int randomNum = new Random().nextInt(300) + 1;

	        while (attempts < maxAttempts - 1) {

	            int inputNum = scan.nextInt();

	            if (inputNum < 1 || inputNum > 300) {
	                System.out.println("Your guess is not between 1 and 300, please try again.");
	                continue; // skip the rest of the loop and start over
	            }

	            if (inputNum < randomNum) {
	                System.out.println("Please pick a higher number");
	            } else if (inputNum > randomNum) {
	                System.out.println("Please pick a lower number");
	            } else if (inputNum == randomNum) {
	                System.out.println("YOU WIN!");
	                return;
	            }

	            attempts++;
	            System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
	        }

	        int inputNum = scan.nextInt();

	        if (inputNum == randomNum) {
	            System.out.println("YOU WIN!");
	        } else {
	            System.out.println("You Lose!");
	        }

	        scan.close();
	    }
}