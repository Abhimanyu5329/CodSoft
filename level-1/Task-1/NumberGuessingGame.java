import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int rounds = 0;
		int wins = 0;
		int totalAttempts = 0;
		
		 boolean playAgain = true;
		 while(playAgain) {
			 int numberToGuess = random.nextInt(100)+1;
			 int attempts = 0;
			 int maxAttempts = 10;
			 
			 System.out.println("Round " + (rounds + 1));
			  System.out.println("Guess a number between 1 and 100.");
			  
			  boolean correctGuess = false;
			  while(!correctGuess && attempts < maxAttempts) {
				  System.out.print("Enter your guess: ");
				  int guess = scanner.nextInt();
				  attempts++;
				  
				  if(guess < numberToGuess) {
					  System.out.println("Too low! Try again.");
				  }else if (guess >numberToGuess) {
					  System.out.println("Too high! Try again.");
				  }else {
					  System.out.println("Correct! You won this round.");
					  correctGuess = true;
					  wins++;
				  }
			  }
	 
			  if(!correctGuess){
      System.out.println("Sorry, you didn't guess the number. It was " + numberToGuess);
				   }
				   
				    totalAttempts += attempts;
					rounds++;
					
					 System.out.println("Do you want to play again? (yes/no): ");
					 String input = scanner.next();
					 playAgain = input.equalsIgnoreCase("yes");
		 }
		 
		 					 System.out.println("Game over.");
							 System.out.println("Rounds played: "+ rounds);
							  System.out.println("Rounds won: "+ wins);
							  	 System.out.println("Total attempts: " + totalAttempts);
							  					 System.out.println("Total attempts per round:"+(double)totalAttempts / rounds);
												 
												 scanner.close();
	}
}