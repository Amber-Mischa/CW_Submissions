/**
 * This is an object class used to generate the npcs for the game Aether: New Beginnings. 
 * There are two kinds of characters stored in the class. The first are npcs that are 
 * generated in the Main class. They all have different attributes and are used throughout 
 * the story line. The second type stored are the player's information. It asks a series 
 * of questions that fit the universe. The class also has methods to introduce the npcs 
 * and tell you what you inputed.
 * @author amberkanthack
 */
import java.util.Scanner;
public class Characters {
	
	//all the variables used to make the player's character
	public static String playerName;
	public static String playerAge;
	public static String playerWeapon;
	public static String playerAnimal;
	public static Scanner userInput = new Scanner(System.in);
	private static String playerBondedAnimal;
	public static String fairyAttributes;
	
	//variables used to make the npcs
	private String npcName;
	private String npcWeapon;
	private int npcAge;
	private String npcBondedAnimal;
	private String npcEmotion;
	
	//Constructor for making npcs
	public Characters (String name, int age, String weapon, String bondedAnimal, String emotion)
	{
		npcName = name ;
		npcAge = age;
		npcWeapon = weapon;
		npcBondedAnimal = bondedAnimal;
		npcEmotion = emotion;
		
	}
	
	/**
	 * String called to introduce the npc characters in the player's party
	 */
	public String toString()
	{
		return "My name is " + getNpcName() 
				+ ". I'm " + npcAge 
				+ " this is my bonded animal, a " + npcBondedAnimal + 
				". I use a " + npcWeapon + ".";
	}
	
	/**
	 * @return the npc's name
	 * used when another character calls the npc's name
	 */
	public String getNpcName() 
	{
		return npcName;
	}

	/**
	 * @return the npc name & emotion
	 * used when the npc is saying something, tells which npc says what
	 */
	public String getNpcNameAndEmotion() 
	{
		return npcName + "(" + npcEmotion + ")";
	}

	/**
	 * @return the npc's weapon
	 */
	public String getNpcWeapon() 
	{
		return npcWeapon;
	}

	/**
	 * @return the npc's age
	 */
	public int getNpcAge() 
	{
		return npcAge;
	}

	/**
	 * @return the npc's bonded animal
	 */
	public String getNpcBondedAnimal() 
	{
		return npcBondedAnimal;
	}
	
	
	/**
	 * used to set the characters emotion at the time
	 * @param npcEmotion
	 */
	public void setNpcEmotion(String npcEmotion) 
	{
		this.npcEmotion = npcEmotion;
	}
	
	
	/**
	 * This method gets the player's bonded animal.
	 */
	public static void getPlayerAttributes()
	{
		System.out.println("\nWelcome User! Here are your attributes. \nName: " + setPlayerName() + "\nAge: " + setPlayerAge()+ "\nWeapon: " + setPlayerWeapon() + "\nBonded Animal: " + setPlayerAnimal());
		
	}
	
	/**
	 * This method gets the player's bonded animal.
	 */
	public static String getPlayerName() {
		return playerName ;
	}

	/**
	 * This method gets the player's bonded animal.
	 */
	public static String getPlayerAge() {
		return playerAge;
	}

	/**
	 * This method gets the player's bonded animal.
	 */
	public static String getPlayerWeapon() {
		return playerWeapon;
	}

	/**
	 * This method gets the player's bonded animal.
	 */
	public static String getPlayerBondedAnimal() {
		return playerBondedAnimal;
	}

	/**
	 * This method asks what the player's name is and then sets it as their character name.
	 */
	public static String setPlayerName()
	{
		System.out.println("What is your first name?");
		playerName = userInput.nextLine();
		return playerName;
	}
	/**
	 * This method asks what the player's age is and then sets it as their character age.
	 */
	public static String setPlayerAge()
	{
		try
		{
			System.out.println("What is your age?");
			playerAge = userInput.nextLine();
			Integer.parseInt(playerAge);
		}
		catch (Exception e)
		{
			System.out.println("Please put in a real number... or don't spell it out.");
			setPlayerAge();
		}
		return playerAge;
	}
	
	/**
	 * This method asks what the player's favorite weapon is and then sets it as their weapon.
	 */
	public static String setPlayerWeapon()
	{
		System.out.println("What is your favorite weapon?");
		playerWeapon = userInput.nextLine();
		
		return playerWeapon;
	}
	
	/**
	 * This method asks the user what their favorite kind of animal is to determine what spirit animal 
	 * they are bonded to. Each answer has a specific spirit animal connected to the answer. Also 
	 * determines what the attribute for their fairy is.
	 */
	public static String setPlayerAnimal()
	{
		
		System.out.println("What is your favorite kind of animal between: birds; snakes; lizards; cats; dogs; insects?");
		playerAnimal = userInput.nextLine();
		if (playerAnimal.equalsIgnoreCase("birds"))
		{
			playerBondedAnimal = "lightning robin";
			
		}
		else if (playerAnimal.equalsIgnoreCase("snakes"))
		{
			playerBondedAnimal = "sun serpant";
			
		}
		else if (playerAnimal.equalsIgnoreCase("lizards"))
		{
			playerBondedAnimal = "draconis";
			
		}
		else if (playerAnimal.equalsIgnoreCase("cats"))
		{
			playerBondedAnimal = "snow ocelot";
			
		}
		else if (playerAnimal.equalsIgnoreCase("dogs"))
		{
			playerBondedAnimal = "crystal wolf";
			
		}
		else if (playerAnimal.equalsIgnoreCase("insects"))
		{
			System.out.println("What is your favorite alchemic element?");
			fairyAttributes = userInput.nextLine(); 
			playerBondedAnimal = fairyAttributes + " fairy";
			
		}
		else
		{
			System.out.println("You must pick one of the options.");
			setPlayerAnimal();
		}
		return playerBondedAnimal;
	}
	
	
}
