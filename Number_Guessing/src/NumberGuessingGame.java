import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {

		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;
		int playerGuess = 0;

		System.out.println("Enter your number btw 0 to 100:");
		while (true) {
			Scanner sc = new Scanner(System.in);
				playerGuess = sc.nextInt();
			
			if (playerGuess == randomNumber) {
				System.out.println("Correct!!!!, You win");
				System.out.println("Your number is " + randomNumber);
				break;

			} else if (playerGuess < randomNumber) {
				System.out.println("Your number is lower, Guess again");
			} else {

				System.out.println("Your number is Higher, Guess again");
			}
		}
		
	}

}
