package com.coderscampus.A_2;

import java.util.Random;
import java.util.Scanner;

public class Guess_ {

	public static void main(String[] args) {

		Random random = new Random();

		int randomNum = random.nextInt(300);
		// System.out.println("this is randomNum: " + randomNum); 

		Scanner scan = new Scanner(System.in);

		System.out.println("Lets play a game, guess a number between 1 and 100.");

		int inputNum = scan.nextInt();
		
		int maxAttempts = 4;
		
		for (int attempts = 1; attempts < maxAttempts; attempts++) {

			if (inputNum < 1 || inputNum > 300) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
				inputNum = scan.nextInt();
			} else if (inputNum < randomNum) {
				System.out.println("Please pick a higher number");
				inputNum = scan.nextInt();
			} else if (inputNum > randomNum) {
				System.out.println("Please pick a lower number");
				inputNum = scan.nextInt();
			} else if (inputNum == randomNum) {
				System.out.println("YOU WIN!");
				break;
			}
			if (attempts == maxAttempts) {
				System.out.println("You Lose!");               
			}
		}
		
		scan.close();
	}
}
