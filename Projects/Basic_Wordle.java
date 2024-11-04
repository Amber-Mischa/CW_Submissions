/**
 * This is a basic version of the known Wordle game.
 * By basic I mean there are parameters that the player must 
 * obey when playing or they have to guess again.
 * The creator chooses the word being used for the game. But it 
 * has to also fit in the parameters given to the player.
 * Player can guess as many times as they want to. There are 
 * slight bugs in the code that allows to guess more than once 
 * without running the code again.
 * @author amberkanthack
 */
import java.util.Scanner;
public class Basic_Wordle {
	//allows the use of the scanner throughout the class
	private static Scanner gameReader = new Scanner (System.in);

	public static void main(String[] args) {
		
		//determine what the answer should be, coder gets to decide this LOWERCASE ONLY
		String answer = new String ("facet");
		
		System.out.println("Welcome to Wordle! Guess the 5 letter unknown word. There is no repeat letters in the word.");
		System.out.println("After guessing if the letter is in the right place then it will print the letter.");
		System.out.print("If the letter is correct but in the wrong place then it will print \"?\".");
		System.out.println(" If the letter is wrog then it will print \"X\".");



		
		//run the game
		playGame(answer);	
	}
	
	/**
	 * this is where the bones code for the general game is located.
	 * It checks each individual character then makes sure the guess 
	 * is wrong before asking to try again.
	 */
	private static void playGame(String answer) 
	{
		
		//Prompts the player to input an answer. Also sets a string equal to the inputed answer.
		System.out.print("Player! Please type in a guess that meets the conditions previously stated(all lowercase)");
		String playerGuess = new String (gameReader.next());
		
		//makes sure the inputed word is 5 characters
		if (playerGuess.length() == 5) {
			
			//checks for doubles in the word using the first character
			int validCheck = doublesCheck(playerGuess);
			//if invalid print error message
			if(validCheck == -1)
			{
				System.out.println("Not a valid answer, please try again with no double letters.");
				playAgain(playerGuess, answer);

			}
			else if (validCheck == 1) 
			{
				//checks the characters in the word
				charOne(playerGuess, answer);
				charTwo(playerGuess, answer);
				charThree(playerGuess, answer);
				charFour(playerGuess, answer);
				charFive(playerGuess, answer);	
				//plays the game again
				if(!playerGuess.equals(answer))
				{
					playAgain(playerGuess, answer);
				}
				else
				{
					System.out.print("You guessed right! The answer is "+ answer);
				}
			}
		}
		else
		{
			System.out.print("The word needs to be five letters long. Please try again. ");
			playGame(answer);
		}
		
		
		gameReader.close();
	}
	
	/**
	 * This method contains all the code related to the first character 
	 * in correct answer and the player's guess. 
	 */
	public static void charOne(String playerGuess, String answer)
	{
		//checks if the first character in the player's guess is correct. If it is it prints the character
		if (playerGuess.charAt(0) == answer.charAt(0))
		{
			System.out.print(answer.charAt(0));
		}
		//checks if the char is located in the answer; if it is it prints ?, if not it prints X.
		else 
		{
			//checks if the letter is correct but in the wrong place
			if(playerGuess.charAt(0) == answer.charAt(1))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(0) == answer.charAt(2))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(0) == answer.charAt(3))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(0) == answer.charAt(4))
			{
				System.out.print("?");
			}
			else
			{
				//prints out "X" if the character doesn't match any if the word's characters
				System.out.print("X");
			}
		}
	}
	
	
	/**
	 * Methods charTwo, charThree, charFour, and charFive are 
	 * the same as charOne so all the note and the purpose are the same. 
	 * The only difference is that it checks the next character.
	 */
	
	public static void charTwo(String playerGuess, String answer)
	{
		if (playerGuess.charAt(1) == answer.charAt(1))
		{
			System.out.print(answer.charAt(1));
		}
		//checks if the char is located in the answer; if it is it prints ?, if not it prints X.
		else 
		{
			//checks if the letter is correct but in the wrong place
			if(playerGuess.charAt(1) == answer.charAt(0))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(1) == answer.charAt(2))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(1) == answer.charAt(3))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(1) == answer.charAt(4))
			{
				System.out.print("?");
			}
			else 
			{
				//prints out "X" if the character doesn't match any if the word's characters
				System.out.print("X");
			}
		}
	}

	
	public static void charThree(String playerGuess, String answer)
	{
		if (playerGuess.charAt(2) == answer.charAt(2))
		{
			System.out.print(answer.charAt(2));
		}
		else 
		{
			//checks if the letter is correct but in the wrong place
			if(playerGuess.charAt(2) == answer.charAt(0))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(2) == answer.charAt(1))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(2) == answer.charAt(3))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(2) == answer.charAt(4))
			{
				System.out.print("?");
			}
			else 
			{
				//prints out "X" if the character doesn't match any if the word's characters
				System.out.print("X");
			}
		}
	}
	
	
	public static void charFour(String playerGuess, String answer)
	{
		if (playerGuess.charAt(3) == answer.charAt(3))
		{
			System.out.print(answer.charAt(3));
		}
		else 
		{
			//checks if the letter is correct but in the wrong place
			if(playerGuess.charAt(3) == answer.charAt(0))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(3) == answer.charAt(1))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(3) == answer.charAt(2))
			{
				System.out.print("?");
			}
			else if(playerGuess.charAt(3) == answer.charAt(4))
			{
				System.out.print("?");
			}
			else 
			{
				//prints out "X" if the character doesn't match any if the word's characters
				System.out.print("X");
			}
		}
	}
	
	
	public static void charFive(String playerGuess, String answer)
	{
		if (playerGuess.charAt(4) == answer.charAt(4))
		{
			System.out.println(answer.charAt(4));
		}
		else 
		{
			//checks if the letter is correct but in the wrong place
			if(playerGuess.charAt(4) == answer.charAt(0))
			{
				System.out.println("?");
			}
			else if(playerGuess.charAt(4) == answer.charAt(1))
			{
				System.out.println("?");
			}
			else if(playerGuess.charAt(4) == answer.charAt(2))
			{
				System.out.println("?");
			}
			else if(playerGuess.charAt(4) == answer.charAt(3))
			{
				System.out.println("?");
			}
			else 
			{
				//prints out "X" if the character doesn't match any if the word's characters
				System.out.println("X");
			}
		}
	}

	/**
	 * This method is used to allow the player to guess as many times as they need.
	 * @param playerGuess
	 * @param answer
	 */
	public static void playAgain(String playerGuess, String answer)
	{
		if(playerGuess.length() == 5)
		{
			if(!playerGuess.equals(answer))
			{
				System.out.println("Please try again!");
				playerGuess = gameReader.next();
				//re-checks the player's second guess
				int validCheck = doublesCheck(playerGuess);
				if(validCheck == -1)
				{
					System.out.println("Not a valid answer, please try again with no double letters.");
					playAgain(playerGuess, answer);

				}
				else if (validCheck == 1) 
				{
				charOne(playerGuess, answer);
				charTwo(playerGuess, answer);
				charThree(playerGuess, answer);
				charFour(playerGuess, answer);
				charFive(playerGuess, answer);
				//if the player is still wrong then it lets them guess again and checks again
				playAgain(playerGuess, answer);
				}
			}
			//if answer is right then it prints the good job message
			else if (playerGuess.equals(answer))
			{
				System.out.print("You guessed right! The answer is "+ answer);
			}
		}
		else
		{
			System.out.print("Not a valid answer, please try again with a 5 letter word.");
		}
	}
	
	/**
	 * This method is used to check if the player uses a character more than once.
	 * @param index
	 * @param playerGuess
	 */
	public static int doublesCheck(String playerGuess) {
		if(playerGuess.charAt(0) == playerGuess.charAt(1) || playerGuess.charAt(0) == playerGuess.charAt(2) || playerGuess.charAt(0) == playerGuess.charAt(3) || playerGuess.charAt(0) == playerGuess.charAt(4))
		{
			return -1;
		}
		else if (playerGuess.charAt(1) == playerGuess.charAt(0) || playerGuess.charAt(1) == playerGuess.charAt(2) || playerGuess.charAt(1) == playerGuess.charAt(3) || playerGuess.charAt(1) == playerGuess.charAt(4))
		{
			return -1;
		}
		else if (playerGuess.charAt(2) == playerGuess.charAt(0) || playerGuess.charAt(2) == playerGuess.charAt(1) || playerGuess.charAt(2) == playerGuess.charAt(3) || playerGuess.charAt(2) == playerGuess.charAt(4))
		{
			return -1;
		}
		else if (playerGuess.charAt(3) == playerGuess.charAt(0) || playerGuess.charAt(3) == playerGuess.charAt(1) || playerGuess.charAt(3) == playerGuess.charAt(2) || playerGuess.charAt(3) == playerGuess.charAt(4))
		{
			return -1;
		}
		else if (playerGuess.charAt(4) == playerGuess.charAt(0) || playerGuess.charAt(4) == playerGuess.charAt(1) || playerGuess.charAt(4) == playerGuess.charAt(2) || playerGuess.charAt(4) == playerGuess.charAt(3))
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
