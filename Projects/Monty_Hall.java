/**
 * This class is for the game Monty hall. 
 * Player picks one of three doors at first and then a wrong 
 * door is revealed. The player is asked if they want to 
 * switch. If yes then it switches and reveals the door.
 * If no then it just reveals their door.
 * @author amberkanthack
 */

import java.util.Scanner;

public class Monty_Hall {
	/**
	 * Class attributes
	 * allows me to use the same variables throughout the class.
	 * Also lets me use the scanner throughout the class in 
	 * different methods
	 */
	private static int winDoor;
	private static int playerDoor;
	private static Scanner playerInput = new Scanner(System.in);
	private static int revealedDoor;
	
	
	public static void main(String[] args) {
		//introduction to the game and sets the parameters for answers.
		System.out.println("Welcome to Monty Hall! \nThere are three doors in front of you, one has a prize behind it the other two have nothing!");
		System.out.println("Please pick a door by typing one, two, or three. (all lowercase)");
		
		//picks a random door for the prize
		winDoor = pickRandomDoor();
		//set's the door the player picked to the attribute
		playerDoor = initialPick();
		//checks if the input is valid
		if (playerDoor == -1)
		{
			//If input isn't allowed then this is printed and the has to player tries again.
			System.out.print("Not a valid input. Please run code again.");
		}
		//runs code if the input is valid
		else
		{
			System.out.println("You have picked Door " + playerDoor);
			//reveals the wrong door
			System.out.println("Now we will reveal a wrong door between the two that you didn't pick!");
			revealedDoor = wrongDoor();
			System.out.println("There is nothing behind door " + revealedDoor +"!");

			//Switches the door if answer is yes
			System.out.println("Would you like to switch doors? (type \"yes\" or \"no\")");
			playerDoor = switchDoor();
			//checks the input if its valid
			if(playerDoor == -1)
			{
				//checks input again to make sure it is valid
				System.out.print("Not a valid input. Please run code again.");
			}
			else
			{
				//reveals the door if the input is valid
				System.out.println("Your door is Door " + playerDoor);
				revealDoor();
			}
			
		}
		playerInput.close();
	}
	
	
	
	/**
	 * generates a random number 1-3 for the winning door
	 * @return the winning door
	 */
	private static int pickRandomDoor() 
	{
		int correctDoor = (int)(Math.random()*3)+1;
		return correctDoor;
	}
	
	
	
	/**
	 * This method is used by the player to pick an initial door.
	 * If the player inputs an answer that is not valid, it 
	 * asks the player to try again.
	 */
	public static int initialPick()
	{
		//Stores the player's door
		
		String initialPlayerInput = new String(playerInput.next());
		
		//changes the player's door as an int
		if (initialPlayerInput.equals("one"))
		{
			return 1;
		}
		else if (initialPlayerInput.equals("two"))
		{
			return 2;
		}
		else if (initialPlayerInput.equals("three"))
		{
			return 3;
		}
		//accounts for error
		return -1;
	}
	
	
	
	/**
	 * Generates the wrong door that is opened after the player 
	 * chooses their initial door.
	 */
	public static int wrongDoor()
	{
		/*
		 * If the player chooses the win door a coin flip is done 
		 * to determine which wrong door is opened.
		 */
		if(playerDoor == winDoor)
		{
			int coinFlip = (int)(Math.random()*3)+1;
			
			//checks to make sure the coin flip door isn't the win door before opening the door.
			if (coinFlip != winDoor)
			{
				return coinFlip;
			}
		}
		else 
		{
			/*
			 * If the player doesn't choose the win door then it checks 
			 * which door is the player picked and which door is the win
			 * door. After it opens the remaining door and sets the door 
			 * to revealed door to be used later.
			 * This is a lot of nested if statements. Since it was gonna
			 * have less code to do it this way and not the other way.
			 */
			if (playerDoor == 1)
			{
				if (winDoor == 2)
				{
					return 3;
				}
				else if (winDoor != 2)
				{
					return 2;
				}
			}
			else if (playerDoor == 2)
			{
				if (winDoor == 1)
				{
					return 3;
				}
				else if (winDoor != 1)
				{
					return 3;
				}
			}
			else if (playerDoor == 3)
			{
				if (winDoor == 1)
				{
					return 2;
				}
				else if (winDoor != 1)
				{
					return 1;
				}
			}
		}
		return -1;
	}
	
	
	
	/**
	 * This method asks if the player would like to switch.
	 * If yes then it runs the initial pick to change the door.
	 * If no then it reveals their door. If it is correct then
	 * there is a congratulations message. If it is wrong then 
	 * it says there is no prize and reveals the prize door. 
	 */
	public static int switchDoor()
	{
		String yesOrNo = new String(playerInput.next());
		//if the answer is yes then it switches the door to the remaining door.
		if (yesOrNo.equals("yes"))
		{
			//Switches the door based on the revealed door & original player door
			if (playerDoor ==1)
			{
				if(revealedDoor == 3)
				{
					playerDoor =  2;
				}
				else if (revealedDoor ==2)
				{
					playerDoor =  3;
				}
			}
			//Everything after this is the same but for a different door.
			else if (playerDoor ==2)
			{
				if(revealedDoor == 3)
				{
					playerDoor =  1;
				}
				else if (revealedDoor ==1)
				{
					playerDoor =  3;
				}		
			}
			else if (playerDoor == 3)
			{
				if(revealedDoor == 1)
				{
					playerDoor =  2;
				}
				else if (revealedDoor == 2)
				{
					playerDoor = 1;
				}			
			}
			else
			{
				//checks for errors
				playerDoor = -1;
			}
		}
		//if not then it goes straight to revealing the player's door.
		else if(yesOrNo.equals("no"))
		{
			return playerDoor;			
		}
		//used to account for errors
		return playerDoor;
	}
	
	
	
	public static void revealDoor()
	{
		/*The code is all the same for each door.
		 * Just checks which door the player picked. If the player 
		 * picked the wrong door then it says it is wrong and 
		 * reveals the prize door. If player is right it prints a 
		 * congratulation statement.
		 */
		//checks player door
		if (playerDoor == 1)
		{
			//checks for win door & compares to player door
			if(winDoor == 1)
			{
				System.out.print("Congratulation! The prize was behind door 1!");
			}
			else if (winDoor != 1)
			{
				System.out.print("Sorry there is no prize behind door 1 \nThe prize was behind door " + winDoor);
			}
			
		}
		else if (playerDoor == 2)
		{
			
			if(winDoor == 2)
			{
				System.out.print("Congragulation! The prize was behind door 2!");
			}
			else if (winDoor != 2)
			{
				System.out.print("Sorry there is no prize behind door 2 \nThe prize was behind door " + winDoor);
			}
		}
		else if (playerDoor ==3)
		{
			if(winDoor == 3)
			{
				System.out.print("Congragulation! The prize was behind door 3!");
			}
			else if (winDoor != 3)
			{
				System.out.print("Sorry there is no prize behind door 3 \nThe prize was behind door " + winDoor);
			}
		}
		
	}
}
