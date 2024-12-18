/**
 * This is the Main Class for the game Aether: New Beginnings.
 * All the logic is located in this class. This is where all 
 * the code used to play the is stored. Also it is where you 
 * play the game. 
 * @author amberkanthack
 */
import java.util.Scanner;

public class Main {
	//class attributes
	//scanner that I use throughout the class
	public static Scanner userInput = new Scanner(System.in);
	//Variables that I uses in the class
	public static String retryChoice;
	//The variables to change the color of the different characters and who they belong to
	//so you know who is saying what
	private static final String textReset = "\u001B[0m";
	private static final String textAelar = textReset + "\033[38;2;219;0;0m";
	private static final String textNarrator = textReset + "\033[38;2;179;175;121m";
	private static final String textPhosrea = textReset + "\033[38;2;169;255;40m";
	private static final String textBartholomw = textReset + "\033[38;2;255;160;75m";
	private static final String textKing = textReset + "\033[38;2;245;190;82m";
	private static final String textOrmr = textReset + "\033[38;2;75;124;225m";
	private static final String textCassia = textReset + "\033[38;2;250;140;250m";
	private static final String textEkas =  textReset + "\033[38;2;140;250;155m"; 
	private static final String textAster = textReset + "\033[38;2;178;102;225m";
	private static final String textKhunm = textReset + "\033[38;2;84;74;222m"; 
	private static final String textHaru = textReset + "\033[38;2;247;253;70m";
	private static final String textPlayer = textReset + "\033[38;2;139;125;186m";



	
	
	public static void main(String[] args) {
		
		//NPC characters
		Characters womanNPC = new Characters("Phosrea", 23, "Sword", "Amethyst Fox", null);
		Characters manNPC = new Characters("Bartholomew", 19, "Dagger", "Thunder Serpent", null);
		Characters teenNPC = new Characters("Ekas", 15, "Staff", "Lunar jay", null);
		Characters boyHeroOneNPC = new Characters("Aster", 15, "dagger", null, null);
		Characters boyHeroTwoNPC = new Characters("Haru", 14, "Bow", null, null);
		Characters girlHeroNPC = new Characters("Cassia", 15, "Sword", null, null);
		Characters boyHeroThreeNPC = new Characters("Ormr", 16, "Broadsword", null, null);
		//Custom colors

		//gets the player's information
		Characters.getPlayerAttributes();
		//introduces the game's setting and world.
		welcomePlayer();
		//this starts the game
		questChoice(womanNPC, manNPC, teenNPC, boyHeroOneNPC, boyHeroTwoNPC, girlHeroNPC, boyHeroThreeNPC);
		
	}
	
	
	/**
	 * This method is used to tell the player a little bit about the world they are playing in first.
	 * After in small introduction to the world the player is introduced to their surroundings
	 */
	public static void welcomePlayer()
	{
		//This is the world building part of the story. Tells about the history of the world that is common knowledge.
		System.out.println("""
				\nWelcome to the world of Aether! This is a mystical world where people and spirit animals work together. Everyone 
				should have a bonded animal that they fight with. There are two known generations of heroes, the four Ancient 
				Heroes that saved the world by separating the Spirit and Human realm. Then the four Archaic Heroes who disappeared 
				after going into the ancient ruins. However they changed the world, now spirit animals can jump between realms and 
				are no longer attacking humans. Then just 50 years ago a group of four students disappeared in the ancient ruins. 
				You are an adventurer in this world. Good luck!
				""");
	
		//The story begins here. Gives information about the players surroundings in the beginning. Also sets up the first choice.
		System.out.println("""
				You blink open your eyes to see an ornate plush rug under you. You glance around and see that you are in the palace,
				you realize it is Khemet's palace. There are three other people in the room with you, all of you kneeling in front of 
				the dais. One of the people is a lean man in leather armor, typical for adventurers. Several small daggers strapped 
				on him. The two largest ones are strapped to his back and hip. You also notice that he is around the same size 
				as the adult women in the room. The woman is in chainmail armor and has a sword strapped around her waist. The last 
				person kneeling with you is a child. He is small and skinny, unlikely to even be 16 yet. You wonder how this tiny kid 
				managed to get into this mess. Then you notice that the teen has a large wooden staff strapped on his back. You don't 
				know who the people are or why you are in the throne room. Suddenly the King speaks.
				""");
	}
	
	
	/**
	 * This method is used to explain the quest and give the player their first choice.
	 * Then the method uses the player's input & tells them the consequences of their choice.
	 * Can be a bad ending or move further into the story.
	 */
	public static void questChoice(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		//emotions of the characters
		Phosrea.setNpcEmotion("Calm");
		Bartholowmew.setNpcEmotion("determined");
		Ekas.setNpcEmotion("nervous");
		Aster.setNpcEmotion(null);
		Haru.setNpcEmotion(null);
		Cassia.setNpcEmotion(null);
		Ormr.setNpcEmotion(null);
		//Explains the quest and asks if you'd like to join.
		System.out.println(textKing + """
				King(Confident): Heroes! Raise your heads, I have a quest offer. You must go into the ancient ruins where the Archaic
				Heroes once ventured. I request that you investigate the ruins to try find the heroes and the four missing students 
				from 50 years ago. This will be a dangerous quest and you might not survive. You can refuse to come. 
				""" + textReset+
				"Will you help the King and join the other heroes on the quest? (yes/no)");
					
		 String questChoice = userInput.nextLine();
		
			if(questChoice.equalsIgnoreCase("no"))
			{
				//Tells you the consequences of you saying no to the quest.
				System.out.println("""
						You turn down the king's quest and are guided outside the palace by the guards. You stay in town completing 
						quests from the Adventurer's guild. It's been two weeks and you're still in the capital of Khemet. You are 
						anxious to hear news from the hero's party that set out. As you're walking down the main street you hear cries 
						of alarm. You look around and see a beat up carriage. The heroes must've returned. Guards pile out of the carriage 
						carrying three wrapped up bodies. You realize that those were the heroes that went on the quest. That was the child. 
						You feel sick. Turning you rush into a nearby alley and vomited. You can't help but feel regret for allowing them go on 
						their own into death. Maybe you could've changed things.
						""");
				//Ask if you want to retry after failing.
				badEndingBeforeQuest(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
				
			}
			else if(questChoice.equalsIgnoreCase("yes"))
			{
				//Sets up what happens if you accept the quest. Also allows you to get to know the other characters better.
				System.out.println("""
						You accept the king's quest. He tells to to get acquainted and prepare for the journey, then a carriage will take 
						you to the ruins and stay there. There will be food and guards stationed in the ruins but they cannot help you, 
						they are just there to contain anything dangerous that might be in the ruins. If you die they will bring back your 
						bodies. You stand up and look at the other participants of the quest.
						""");
				//goes into the next choice to introduce the characters.
				npcInteractions(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
			}
			else
			{
				/*
				 * You think you're funny putting in something that isn't yes or no. Well too bad you
				 * don't say anything unless it was yes or no
				 */
				System.out.println("""
						You fail to say anything and the king takes it as you refusing to go. He sends you on your way and you begin
						a journey of your own. A few weeks later you hear that those heroes on the quest died a gruesome death. You 
						are glad that you didn't join their fate and die with them, but also wonder if you could have saved them.
						""");
				//Ask if you want to retry after failing.
				badEndingBeforeQuest(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
			}
	}
	
	/**
	 * This method is used to introduce the NPC characters.
	 */
	public static void npcInteractions(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		//emotions of the characters
		Phosrea.setNpcEmotion("Calm");
		Bartholowmew.setNpcEmotion("determined");
		Ekas.setNpcEmotion("nervous");
		Aster.setNpcEmotion(null);
		Haru.setNpcEmotion(null);
		Cassia.setNpcEmotion(null);
		Ormr.setNpcEmotion(null);
		
		//loops it so you can ask all three characters and makes sure you ask all the characters.
		boolean womanIntro = false;
		boolean manIntro = false;
		boolean childIntro = false;
		for(int i = 1; i <= 3; i++)
		{
			//asks the player who they want to meet
			System.out.println(textReset + "Who would you like to meet? (man/woman/child)");
			//makes sure they input one of the options. If not then it repeats.
			boolean stop = false;
			while(stop == false)
			{
				//saves the character the player chooses.
				String interactionChoice = userInput.nextLine();
				//checks which npc the player chooses to meet first.
				//gives all the important information about each npc
				if (interactionChoice.equalsIgnoreCase("woman"))
				{
					//makes sure you haven't asked this npc before
					if(womanIntro == false)
					{
						//introduces the woman
						System.out.println(textPhosrea+ Phosrea.toString()+textReset);
						stop = true;
						womanIntro = true;
					}
					else
					{
						System.out.println("Please pick a different character.");
					}
					
					
				}
				else if (interactionChoice.equalsIgnoreCase("man"))
				{
					//makes sure you haven't asked this npc before
					if(manIntro == false)
					{
						//introduces the man
						System.out.println(textBartholomw+ Bartholowmew.toString()+textReset);
						stop = true;
						manIntro = true;
					}
					else
					{
						System.out.println("Please pick a different character.");
					}
					
				}
				else if(interactionChoice.equalsIgnoreCase("child"))
				{
					//makes sure you haven't asked this npc before
					if(childIntro == false)
					{
						//introduces the child
						System.out.println(textEkas+Ekas.toString()+textReset);
						stop = true;
						childIntro = true;
					}
					else
					{
						System.out.println("Please pick a different character.");
					}
					
				}
				else
				{
					System.out.println("Please pick one.");
				}
				
			}
			
		}
		//continues the game after introductions
		goToRuins(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
				
	}
	
	
	
	/**
	 * This method introduces the ancient ruins. and introduces the choice of which hallway to go down.
	 */
	public static void goToRuins(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		//emotions of the characters
		Phosrea.setNpcEmotion("Intrigued");
		Bartholowmew.setNpcEmotion("Adventurous");
		Ekas.setNpcEmotion("nervous");
		Aster.setNpcEmotion(null);
		Haru.setNpcEmotion(null);
		Cassia.setNpcEmotion(null);
		Ormr.setNpcEmotion(null);
		/*
		 * all the dialogue is contained in here
		 * gives you a little more information about the world
		 * declares your position in the party as the leader.
		 * introduces the personality of the characters a little bit
		 * Declares the choice at the end.
		 */
		System.out.println(textReset + """ 
				\nAfter a long and bumpy journey in the carriage to the Ancient Ruins you finally make it. When you arrive you 
				notice that there are guards stationed everywhere. They nod to you as you pass them, heading into the ruins. 
				Welcome to the Ancient Ruins! You look around nervously. \n"""
				
				+ textEkas + Ekas.getNpcNameAndEmotion() +": This place looks scary. There is an awful lot of mana swirling around the ruins. \n"
				+ textPhosrea + Phosrea.getNpcNameAndEmotion() +": We'll find where the magic is the strongest. That'll lead us to where our quest is. \n"
				+ textBartholomw + Bartholowmew.getNpcNameAndEmotion() +": Right. Let's go!\n"
				+ textReset + """
				Your party follows the swirling magic. You end up going down many hallways and reach a fork in the road. """);
		
		//emotions of the characters
		Phosrea.setNpcEmotion("Wary");
		Bartholowmew.setNpcEmotion("Confused");
		Ekas.setNpcEmotion("Determined");
		Aster.setNpcEmotion(null);
		Haru.setNpcEmotion(null);
		Cassia.setNpcEmotion(null);
		Ormr.setNpcEmotion(null);
		
		System.out.println( textBartholomw + Bartholowmew.getNpcNameAndEmotion() +": Huh? Why'd you stop 'lil guy? \n" + textReset
				+ Ekas.getNpcName() +" glares at the older man before turning to you. \n"
				+textEkas +Ekas.getNpcNameAndEmotion() +": There is a lot of mana leading down both hallways. I'm not sure which one is the correct way.\n"
				+ textPhosrea+ Phosrea.getNpcNameAndEmotion() +": Well, our party leader should decide. " + Characters.getPlayerName()+", which hallway do you want to go down? \n" 
				+ textReset +"She turns to you expectantly. (Left/Right)");
		//goes into the next choice.
		hallwayChoice(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		
	}
	
	/**
	 * This method is used to decide which hallway to go down
	 * first major decision in the game
	 */
	public static void hallwayChoice(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		
		String hallwayChoice = userInput.nextLine();
		if(hallwayChoice.equalsIgnoreCase("left"))
		{
			//emotions of the characters
			Phosrea.setNpcEmotion("Hesitant");
			Ekas.setNpcEmotion("Awe/Scared");
			Aster.setNpcEmotion(null);
			Haru.setNpcEmotion(null);
			Cassia.setNpcEmotion(null);
			Ormr.setNpcEmotion(null);
			
			/*
			 * all the dialogue is contained in here
			 * We meet another major character that will determine how the game ends
			 * big block of text that I hate.
			 * Declares the choice at the end.
			 */
			System.out.println("""
					You head down the left hallway and reach an area that stinks of rot. You hear your party member scream and turn around. \n"""
					+ textPhosrea + Phosrea.getNpcNameAndEmotion() +": I think we found those missing kids. \n" + textReset +  
					 """
						You look down and see the bodies of the kids that disappeared. However the strangest thing is that the bodies are 
						perfectly preserved.\n"""
					+ textBartholomw + Bartholowmew.getNpcNameAndEmotion()+ ": How? They died like 50 years ago! How can they possibly be anything more than a skeleton! \n"
					+ textEkas +Ekas.getNpcNameAndEmotion() + ": Guys! There's a strange crystal here...In the middle of them. What is going on. \n"
					+ textReset + """
							\nYou see the kid reach down and grab the crystal. There is a bright light that envelops you. You are surrounded by 
							darkness, floating, weightless. You can't see your party members anymore. You try to call out for them only to be
							met with silence. \n"""
					+ textAelar + "???: Hmmm? How strange. It's been a long time since I've last had a visitor I didn't invite. Who are you?"
					+ textReset + """
							\nYou look around and see a strange man. He is wearing flowing white robes and a sash that changes colors every so often. 
							'Who is this?' you think. He tilts his head and smiles widely. You flinch back. There is something off about this man? 
							being? Entity.\n"""
					+ textAelar + "???: Hehehe! Hello, User! Ah I suppose you have a name now actually. What was it? \nOh right! It was " + Characters.getPlayerName() +" wasn't it? \n"
					+ textReset +"""
							You stare at the entity. How did it know your name? You thought that is wasn't human but that just solidified it. 
							You have a choice. Fight the entity or continue talking to it. (Talk/fight)"""
					);
			//goes into the next choice.
			entityChoice(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
				
		}
		else if(hallwayChoice.equalsIgnoreCase("right"))
		{
			//emotions of the characters
			Phosrea.setNpcEmotion("Aloof");
			Bartholowmew.setNpcEmotion("Apprehensive");
			Ekas.setNpcEmotion("Awe");
			Aster.setNpcEmotion(null);
			Haru.setNpcEmotion(null);
			Cassia.setNpcEmotion(null);
			Ormr.setNpcEmotion(null);
			/*
			 * all the dialogue is contained in here
			 * This choice determine how the game ends
			 * Declares the choice at the end.
			 */
			System.out.println("""
					You head down the right hallway and come to a door. You open the door and see a huge multi-colored crystal 
					in the center. Surrounding the crystal are statues of the four Archaic heroes. 
					"""
					+ textEkas + Ekas.getNpcNameAndEmotion() +": It's the heroes! We found them! \n"
					+ textBartholomw + Bartholowmew.getNpcNameAndEmotion() +": They're clearly dead though. I think we have to destroy the crystal to finish the quest. \n"
					+ textPhosrea + Phosrea.getNpcNameAndEmotion()+ ": Do you want to break the crystal or return to the Kingdom?" + textReset + "(break/return)");
			//goes into the next choice.
			stoneChoiceOne(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			/*
			 * You think you're funny putting in something that isn't left or right. Well too bad. :)
			 * you get the bad ending!
			 */
			System.out.println(textReset+"""
					You decide to not go down either and turn around. You are waiting outside the ruins for your party members when you feel 
					a very intense rush of mana. The guards rush into the ruins and you are told to stay where you are. The guards come back
					out holding the mutilated bodies of your party members. Their eyes are still open and staring dead at you. You feel 
					regret trying to drown you. Suddenly it goes dark and a you hear a voice in your mind.""");
			//takes you to the bad ending to ask if you want to retry.
			badEndingBeforeQuest(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
			
		}
	}
	
	
	/**
	 * This method is used to give the player the choice of what to do with the entity.
	 *
	 */
	public static void entityChoice(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		//stores the player's answer
		String entityChoice = userInput.nextLine();
		//checks the player's answer and executes different code depending on the answer
		if(entityChoice.equalsIgnoreCase("Talk"))
		{
			System.out.println(textPlayer + Characters.getPlayerName() + ": What is your name? \n"
					+textAelar + "???: My name? I like you! You're bold asking me that! I'm Aelar. \n"
					+ textReset+ """
					Is there something you want to know? Maybe you can use this information to aid you in your quest. What would you want to 
					know more about? (Heroes/Spirit realm/bonded Animals/magical artifacts)""");
			//executes the next choice
			convoChoice(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			//You die because you literally cannot face what is essentially a god. Why did you think this was a good idea?
			System.out.println(textReset + "You pull out your " + Characters.getPlayerWeapon() + " and attack with it. Your " + Characters.getPlayerBondedAnimal()
				+ " charges up their mana and attacks with it. \nThey aid your effort but it was all useless. Despiste your attacks the entity is "
				+ "just standing there. Its eyes glow gold. \n"
				+ textAelar +"???: This fight is your last. Now you will die. \n"
				+ textReset + "You back away from the entity as they launch a blast of pure Aether at you. \nYou feel your body burn up as you die, you wish you were "
				+ "smarter. Would you like to try again? (Yes/no)");
			
			//This replaces the bad ending because the entity doesn't want to revive you this time.
			String retryChoice = userInput.nextLine();
			if (retryChoice.equalsIgnoreCase("yes"))
			{
				System.out.println(textNarrator + "You've angered one of the most powerful beings in this world. \nHowever, I will grant you this favor and restart "
						+ "this choice. Please use it wisely."+textReset);
				//takes you back to the start of this choice
				System.out.println("Fight the entity or continue talking to it. (Talk/fight)");
				entityChoice(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
			}
			else
			{	//takes you back to the start of this choice
				System.out.println(textNarrator + "Funny how you think you have a choice. It is your duty to do this."+textReset);
				System.out.println("Fight the entity or continue talking to it. (Talk/fight)");
				entityChoice(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
			}
		}
	}
	
	/**
	 * This method give the player more information on the world around them
	 * Tells about the past that was only briefly mentioned.
	 */
	public static void convoChoice(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		String convoChoice = userInput.nextLine();
		if (convoChoice.equalsIgnoreCase("Heroes"))
		{
			/*
			 * I hate this block of text...
			 * Aelar tells the player more about the world and how to complete the quest.
			 * gives the stories of the heroes that were only briefly touched on in the beginning
			 */
			System.out.println(textAelar + """
					Aelar: You want to learn more about the heroes? Ok, well let's start at the beginning. Once upon a time, there was an 
					evil tamer that would use spirit animals as tools. She didn't care if they were killed or hurt. Spirit animals were 
					outraged and started attacking humans after her death. The Ancient Heroes met after they were adults and had children. 
					The four set off on a journey to end the violence. They achieved relative peace, spirit animals weren't attacking 
					constantly but there were still some that did. However, they paid the greatest price. They were turned to stone. As 
					time moved on, thousands of years, their souls being trapped here and the Spirit Realm. They left behind their families 
					to save the world. The next group of heroes, the Archaic Heroes, came to finally put an end to the violence. The same 
					thing happened to them as the previous generation of heroes. They are stuck in stone and are slowly losing their spirits. 
					However, spirit animals can now bond with humans and they never attack for no reason. The final generation of heroes are 
					ones you don't know. They were those kids that disappeared. Only those four have the power to break the curse placed on the 
					Archaic Heroes and solidify the change. However they fell prey to deadly vines and never even had the chance to reach the 
					correct room. The same vines that attacked them have been defeated by your party since you've arrived. """
					+textReset+
					"""
					\nYou stare in shock at Aelar. You never knew about those tales. That they were real. That those motionless kids were meant 
					to be heroes. You won't be able to complete the quest without the kids. What will you do? (revive/leave)."""
					);
			//goes into the next choice.
			requestChoice(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else if(convoChoice.equalsIgnoreCase("Spirit Realm"))
		{
			//emotions of the characters
			Phosrea.setNpcEmotion("Tense");
			Bartholowmew.setNpcEmotion("Relief");
			Ekas.setNpcEmotion("Bored");
			Aster.setNpcEmotion(null);
			Haru.setNpcEmotion(null);
			Cassia.setNpcEmotion(null);
			Ormr.setNpcEmotion(null);
			/*
			 * Touches a little more on the story of the heroes. Explains more about the world
			 * doesn't give any information about the quest.
			 */
			System.out.println(textAelar + """
					Aelar: The Spirit Realm? It's rather basic. The Spirit Realm is where spirit animals go when they don't want to be in 
					the human realm. It was created by the Ancient Heroes and has been around since. What am I missing? Oh! Right. Bonded 
					spirit animals cannot reach the spirit realm without their human. That's just to make sure the human can call upon 
					their spirit animal. Since spirit animals cannot hear the summon inside the spirit realm. I'll send you back now.
					Good luck! I'll be watching """ + " "
					+ Characters.getPlayerName() + "!\n" +textReset + "Well that didn't give you much info. You blink and see the faces of your party members again. \n"
					+ textBartholomw + Bartholowmew.getNpcNameAndEmotion() + ": "+Characters.getPlayerName() + " Where have you been! You just disappeared. \n"
					+ textReset + "You tell your party about the information you gained from Aelar. They ask you what the party is going to do, go back to the \n"
					+ "right hallway or head back to the kingdom. (hallway/Kingdom)");
			//goes into the next choice.
			majorQuestChoiceThree(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else if(convoChoice.equalsIgnoreCase("Bonded Animals"))
		{
			//emotions of the characters
			Phosrea.setNpcEmotion("Aloof");
			Bartholowmew.setNpcEmotion("Relief");
			Ekas.setNpcEmotion("Awe");
			Aster.setNpcEmotion(null);
			Haru.setNpcEmotion(null);
			Cassia.setNpcEmotion(null);
			Ormr.setNpcEmotion(null);
			
			/*
			 * Touches a little more on bonded animals. Explains more about the world
			 * Doesn't give any information about the quest.
			 */
			System.out.println(textAelar + """
					Aelar: Bonded animals? Well they weren't always like that, bonded that is. Originally they were Spirit animals until 
					one day a tamer class appeared and tamed the first spirit animal. That's a long story that I doubt you really want to 
					know, so I'll skip it. You just have to know that spirit animals now bond with humans if both parties want to. There 
					used to be destined pairs that just bond upon seeing each other but there aren't many anymore. Bonded animals help 
					increase the magical output of their partner's attacks. They can even launch their own attacks using their magic. That's 		
					basically all you need to know I think. I'll send you back now. Good luck! I'll be watching """ + " "
					+ Characters.getPlayerName() + "!\n" +textReset + "Well that didn't give you much info. You blink and see the faces of your party members again. \n"
					+ textBartholomw + Bartholowmew.getNpcNameAndEmotion() + ": "+Characters.getPlayerName() + " Where have you been! You just disappeared. \n"
					+ textReset + "You tell your party about the information you gained from Aelar. They ask you what the party is going to do, go back to the \n"
					+ "right hallway or head back to the kingdom. (hallway/Kingdom)");
			//goes into the next choice.
			majorQuestChoiceThree(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else if(convoChoice.equalsIgnoreCase("Magical Artifacts"))
		{
			//emotions of the characters
			Phosrea.setNpcEmotion("Tense");
			Bartholowmew.setNpcEmotion("Relief");
			Ekas.setNpcEmotion("Bored");
			Aster.setNpcEmotion(null);
			Haru.setNpcEmotion(null);
			Cassia.setNpcEmotion(null);
			Ormr.setNpcEmotion(null);
			
			/*
			 * Touches a little more on magical artifacts. Explains more about the world
			 * Doesn't give any information about the quest.
			 */
			System.out.println( textAelar + """
					Aelar: Magical Artifacts? Why would you want to know about those things? I guess since you're a User it makes sense. 
					It's a rather basic concept. You humans came up with magical artifacts to combat the wild creatures that attacked for 
					so long. They've lost most of their power since you now have spirit animals to help you out. But you should still be 
					careful. If you mess with a magical artifact without knowing what it does, it could kill you. There are only certain 
					people that can break them. It has to be just the right power so the backlash doesn't make them explode. If you do run 
					into an artifact you don't know anything about just leave it be. It's not worth your life. I'll send you back to your 
					friends. Good luck! I'll be watching""" + " "
					+ Characters.getPlayerName() + "!\n" +textReset + "Well that didn't give you much info. You blink and see the faces of your party members again. \n"
					+ textBartholomw + Bartholowmew.getNpcNameAndEmotion() + ": "+Characters.getPlayerName() + " Where have you been! You just disappeared. \n"
					+ textReset + "You tell your party about the information you gained from Aelar. They ask you what the party is going to do, go back to the \n"
					+ "right hallway or head back to the kingdom. (hallway/Kingdom)");
			//goes into the next choice.
			majorQuestChoiceThree(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			//Leads back to the start so the player has to choose one of the options
			//very funny. Pick one
			System.out.println(textAelar + "Aelar: You must have something you want to know. You must choose one of the options."+textReset);
			//restarts the method to force you to pick one of the options.
			convoChoice(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
	}
	
	
	/**
	 * This method is the lead up to one of the most important choices in the game.
	 * Leads to the failure or succeeding the quest
	 */
	public static void requestChoice(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		String requestChoice = userInput.nextLine();
		if(requestChoice.equalsIgnoreCase("revive"))
		{
			//emotions of the characters
			Phosrea.setNpcEmotion("Tense");
			Bartholowmew.setNpcEmotion("Relief");
			Ekas.setNpcEmotion("Bored");
			Aster.setNpcEmotion(null);
			Haru.setNpcEmotion(null);
			Cassia.setNpcEmotion(null);
			Ormr.setNpcEmotion(null);
			//This leads to the revival of the last generation of heroes.
			//New npc are introduced
			System.out.println(textAelar + """
					Aelar: Huh? You want me to revive the latest generation of heroes? You're very different from the last User that came here. 
					I can't tell your intentions but I know that the Ancient heroes would be upset with me otherwise. Ok. I'll do it! Aelar 
					snaps and you feel the change in the mana. It's more controlled and flows better. 
					"""
					+ Characters.getPlayerName() + ": Thank you Aelar. \n"+ textReset +"Aelar turns to you and smiles. Your vision begins turning dark and "
					+ "you see your party members again.\n"
					+ textBartholomw + Bartholowmew.getNpcNameAndEmotion() + ": "+Characters.getPlayerName() + " where have you been! You just disappeared. \n"
					+textReset + "The group of kids sit up and look around confused. You smile at them and ask what they remember. The group of kids "
					+ "remain \nsilent as they stare at your party. \n"
					+textOrmr + "???(Confused): Who are you? \n"
					+textPlayer + Characters.getPlayerName() + ": I'm " + Characters.getPlayerName() + ". This is my party, " + Bartholowmew.getNpcName() 
					+ ", " + Ekas.getNpcName() + ", and " + Phosrea.getNpcName() +".\n"
					+textAster + "???(Outgoing): Nice to meet you. I'm " + Aster.getNpcName() + ", this is " + Haru.getNpcName() + ", "
					+ Cassia.getNpcName() +", and " + Ormr.getNpcName() + ".\n" + textReset +"""
					The group of kids start talking amongst themselves. You tell your party about the information you gained from Aelar. The 
					group of kids sit up and look around confused. They ask you what the party is going to do, go back to the right hallway or 
					head back to the kingdom. (hallway/Kingdom)""");
			//goes into the next choice.
			majorQuestChoiceOne(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			//this choice seals the party's fate
			//This pathway leads to the player dying or failing the quest.
			System.out.println(textPlayer + Characters.getPlayerName() + ": Aelar. Can you send me back to my party? \n" + textAelar +"Aelar: Hm? Sure! Hehehe! "
					+ "Good luck with your quest User. \n" +textReset+ """
							You open your eyes and see your party. You tell your party about the information you gained from Aelar. The group of kids 
							lie motionless on the ground. You look sadly at the deceased kids. There is nothing you can do for them. The rest of your 
							party ask you what the party is going to do, go back to the right hallway or head back to the kingdom. (hallway/Kingdom)""");
			//goes into the next choice.
			majorQuestChoiceThree(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		
		
	}
	
	
	/**
	 * This method is used if you revived the heroes and reach the choice between the hallway and going back to the Kingdom.
	 * Also decides which path you go on, if you go down the good ending or just get a neutral one.
	 */
	public static void majorQuestChoiceOne(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		String questChoice = userInput.nextLine();
		if (questChoice.equalsIgnoreCase("Hallway"))
		{
			//emotions of the characters
			Phosrea.setNpcEmotion("Aloof");
			Bartholowmew.setNpcEmotion("Apprehensive");
			Ekas.setNpcEmotion("Awe");
			Aster.setNpcEmotion("Confident");
			Haru.setNpcEmotion("Excited");
			Cassia.setNpcEmotion("Anxious");
			Ormr.setNpcEmotion("Calm");
		
			System.out.println(textReset +"You head down the right hallway and come to a door. You open the door and see a huge multi colored crystal\n"
					+ " in the center. Surrounding the crystal are statues of the four Archaic heroes. \n"
					+textEkas + Ekas.getNpcNameAndEmotion() +": It's the heroes! We found them! \n"
					+textHaru + Haru.getNpcNameAndEmotion() + ": Woah! I can't believe it. All this time, the heroes were here.\n"
					+textCassia + Cassia.getNpcNameAndEmotion() + ": That's a magical artifact... Should we even be here " + Aster.getNpcName() + "?\n"
					+textReset + "All the heroes looked towards " + Aster.getNpcName() + ". \n" + textAster +Aster.getNpcNameAndEmotion() +": We should try"
					+ " save them.\n"
					+ textBartholomw + Bartholowmew.getNpcNameAndEmotion() +": They're clearly dead though. " +Characters.getPlayerName()+" I think we have to destroy the crystal to finish the quest. \n"
					+textPhosrea + Phosrea.getNpcNameAndEmotion()+ ": " + Characters.getPlayerName() + " do you want to help them break the crystal or return to "
					+ "the Kingdom?" + textReset + "(break/return)");
			//goes into the next choice.
			stoneChoiceTwo(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			//You failed your quest and the world begins to fade without the stabilizing energy the Heroes' classes bring.
			System.out.println(textReset + """
					You return to the Khemet without completing your quest. You're unsure what happened to the children that you revived. You 
					told the king that there is nothing you can do. The king tells your party that he thought this would happen. He gives you 
					the reward for your time and reassures you everything is fine. You still feel regretful for not finishing the quest 
					completely. The world slowly begins to rot under the Aether's overwhelming drainage of mana to balance the realms. You 
					dearly wish that you could have changed this. That you could have done more. You could have helped the heroes. \n"""
					+ textAelar + "Aelar: " + Characters.getPlayerName() + ", would you like to try to change this world's fate again?" +textReset +"(yes/no)");
			badEndingAfterAelar(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
	}
	
	
	
	/**
	 * This is the same as the method above but it is used when the player didn't revive the heroes.
	 * Doesn't have the good ending, leads to a bad one instead.
	 */
	public static void majorQuestChoiceThree(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		String questChoice = userInput.nextLine();
		if (questChoice.equalsIgnoreCase("Hallway"))
		{
			/*
			 * all the dialogue is contained in here
			 * This choice determine how the game ends
			 * Declares the choice at the end.
			 */
			System.out.println(textReset +"You head down the right hallway and come to a door. You open the door and see a huge multi colored crystal"
					+ " in the center. Surrounding the \ncrystal are statues of the four Archaic heroes. \n"
					+ textEkas + Ekas.getNpcNameAndEmotion() +": It's the heroes! We found them! \n"
					+ textBartholomw + Bartholowmew.getNpcNameAndEmotion() +": They're clearly dead though. I think we have to destroy the crystal to finish the quest. \n"
					+ textPhosrea + Phosrea.getNpcNameAndEmotion()+ ": Do you want to break the crystal or return to the Kingdom?" +textReset + "(break/return)");
			stoneChoiceThree(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			//This is one of the ending of the game
			System.out.println(textReset + """
					You return to the Khemet without completing your quest. You told the king that there is nothing you can do. The king tells your party 
					that he thought this would happen. He gives you the reward for your time and reassures you everything is fine. You still feel regretful 
					for not finishing the quest completely. The world slowly begins to rot under the Aether's overwhelming drainage of mana to balance the 
					realms. You dearly wish that you could have changed this. That you could have done more. 
					"""
					+ textAelar + "Aelar: " + Characters.getPlayerName() + ", would you like to try to change this world's fate again?" +textReset+ "(yes/no)");
			//asks if you want to retry the game.
			badEndingAfterAelar(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
	}
	
	
	/**
	 * Choice without the heroes there to help break the stone or meeting Aelar.
	 */
	public static void stoneChoiceOne(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		String aetherStoneChoice = userInput.nextLine();
		if(aetherStoneChoice.equalsIgnoreCase("break"))
		{
			//You died
			//This text block tells you the consequences of breaking the stone
			System.out.println(textReset + "You decide to break the stone. " + Phosrea.getNpcName() + " started calling out orders to the rest of the party and drew "
					+ "her " + Phosrea.getNpcWeapon() +". " + Bartholowmew.getNpcName() + " walks \nover to the door with his " + Bartholowmew.getNpcWeapon()
					+ " drawn. You can tell he is guarding the door. You walk to the crystal in \nthe center of the room and stand opposite from " 
					+ Ekas.getNpcName() + ". " + Phosrea.getNpcName() + " stands furthest from the door with the crystal between her and the door. \n"
					+ textPlayer + Characters.getPlayerName() + ": Ready to attack? \n" + textEkas + Ekas.getNpcNameAndEmotion() +": Ready! \n" +textPhosrea + Phosrea.getNpcNameAndEmotion()
					+": Ready.\n" +textReset + 
					"You nod to your companions and launch your first attack with your " + Characters.getPlayerWeapon() + ".\n" + """
					Your party members attack too. However, when the crystal cracks you begin to feel something is wrong. You stop attacking 
					and look closely at the stone. You can see the Aether seeping through the crack. You know you shouldn't be able to and try 
					to call out to stop the others. But it is too late. The crystal breaks and everything goes black. ... How strange...you 
					can't feel anything but you can see things. The kingdom is mourning something, every decoration is pitch black. You've only
					seen it like this during the festival for the Archaic Heroes. You can't have been gone that long right? You look around the 
					kingdom and see a crowd gathered in the square. You head over and see a statue of you and your party. It hits you then. You 
					are dead. Nobody can see you, interact with you, or hear you. Khemet is mourning your party's death, not the Heroes' deaths.""" );
			System.out.println(textAelar + "???:Would you like to try again?"+textReset + "(yes/no)");
			//Ask if you want to retry after failing.
			//checks if you want to change your fate.
			retryChoice = userInput.nextLine();
			if (retryChoice.equalsIgnoreCase("yes"))
			{
				goToRuins(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
			}
			else
			{
				System.out.print(textAelar + "???: No? I guess you Users are all the same. Goodbye " + Characters.getPlayerName() + "."
						+ textNarrator + "BAD ENDING! You stay dead alongside your party. You are stuck wandering that dark void and never achieving eternal peace.");
			}		}
		else
		{
			//tells you what happens if you don't break the stone
			System.out.println(textReset + """
					You return to the Khemet without completing your quest. You told the king that there is nothing you can do. The king tells your party 
					that he thought this would happen. He gives you the reward for your time and reassures you everything is fine. You still feel regretful 
					for not finishing the quest completely. The world slowly begins to rot under the Aether's overwhelming drainage of mana to balance the 
					realms. You dearly wish that you could have changed this. That you could have done more. You could have helped the heroes. 
					"""
					+ textAelar +"???: " + Characters.getPlayerName() + ", would you like to try to change this world's fate again?" +textReset+ "(yes/no)");
			retryChoice = userInput.nextLine();
			if (retryChoice.equalsIgnoreCase("yes"))
			{
				goToRuins(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
			}
			else
			{
				System.out.println(textAelar + "???: No? I guess you Users are all the same. Goodbye " + Characters.getPlayerName() + "."
						+ textNarrator +"\n\nNEUTRAL ENDING! Nothing happens to you or your party but the world is deteriorating. Hope you're happy");
			}
		}
	}
	
	/**
	 * Choice without the heroes there to help break the stone.
	 */
	public static void stoneChoiceThree(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		String aetherStoneChoice = userInput.nextLine();
		if(aetherStoneChoice.equalsIgnoreCase("break"))
		{
			//You died
			//This text block tells you the consequences of breaking the stone
			System.out.println(textReset + "You decide to break the stone." + Phosrea.getNpcName() + " started calling out orders to the rest of the party and drew "
					+ "her " + Phosrea.getNpcWeapon() +". " + Bartholowmew.getNpcName() + " walks \nover to the door with his " + Bartholowmew.getNpcWeapon()
					+ " drawn. You can tell he is guarding the door. You walk to the crystal in \nthe center of the room and stand opposite from " 
					+ Ekas.getNpcName() + ". " + Phosrea.getNpcName() + " stands furthest from the door with the crystal between her and the door. \n"
					+ textPlayer + Characters.getPlayerName() + ": Ready to attack? \n" + textEkas + Ekas.getNpcNameAndEmotion() +": Ready! \n" +textPhosrea + Phosrea.getNpcNameAndEmotion()
					+": Ready.\n" +textReset + 
					"You nod to your companions and launch your first attack with your " + Characters.getPlayerWeapon() + "." + """
					
					Your party members attack too. However, when the crystal cracks you begin to feel something is wrong. You stop attacking and look closely at the 
					stone. You can see the Aether seeping through the crack. You know you shouldn't be able to and try to call out to stop the others. But it is too 
					late. The crystal breaks and everything goes black. ... How strange...you can't feel anything but you can see things. The kingdom is mourning 
					something, every decoration is pitch black. You've only seen it like this during the festival for the Archaic Heroes. You can't have been gone that 
					long right? You look around the kingdom and see a crowd gathered in the square. You head over and see a statue of you and your party. It hits you 
					then. You are dead. Nobody can see you, interact with you, or hear you. Khemet is mourning your party's death, not the Heroes' deaths.""" );
			System.out.println(textAelar+"Aelar(grief?): Ah...I'm sorry. I've never felt this way. Why are you so different? Nevermind would you like to try again?" + textReset + "(yes/no)");
			//Ask if you want to retry after failing.
			badEndingAfterAelar(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			//tells you what happens if you don't break the stone
			System.out.println(textReset + """
					You return to the Khemet without completing your quest. You told the king that there is nothing you can do. The king tells your party 
					that he thought this would happen. He gives you the reward for your time and reassures you everything is fine. You still feel regretful 
					for not finishing the quest completely. The world slowly begins to rot under the Aether's overwhelming drainage of mana to balance the 
					realms. You dearly wish that you could have changed this. That you could have done more. You could have helped the heroes. 
					"""
					+ textAelar + "Aelar: " + Characters.getPlayerName() + ", would you like to try to change this world's fate again?" +textReset+ "(yes/no)");
			badEndingAfterAelar(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
	}
	
	
	/**
	 * Choice with the heroes there to help break the stone.
	 */
	public static void stoneChoiceTwo(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		String aetherStoneChoice = userInput.nextLine();
		if(aetherStoneChoice.equalsIgnoreCase("break"))
		{
			
			//You got the good ending YAY!!!
			//This text block tells you the consequences of helping the heroes break the stone
			System.out.println(textReset + "You tell your party to guard the door and nod at the group of kids. The four child heroes surround the "
					+ "stone with their weapons drawn. They begin to launch attacks \nwith their weapons." + Haru.getNpcName()
					+ "uses his " + Haru.getNpcWeapon() + "to create a crack. You see the kids look at each other before "
					+ "attacking more aggressively. You notice the \ncrystal breaking and reach to grab " +Ormr.getNpcName() + " and "
					+ Cassia.getNpcName() + " out of the way. The other two kids get blown back as the crystal shatters. \nHowever, they are"
					+ "caught by two strangers. The boys freak out and start asking them questions. You observe the room and see that the "
					+ "heroes are \nnot stone anymore. \'Those must be the Archaic Heroes\' you thought. \n" + textPlayer + Characters.getPlayerName()
					+": Hello. You're 80 years in the future. Welcome back.\n" + textKhunm + "Khnum: What about our kingdom, is Khemet still around? \n"
					+ textPlayer + Characters.getPlayerName() + ": It is. We're going to head there now if you'd like to come. \n"
					+ textKhunm + "Khnum(relieved): I'd like that. Thank you adventurer.\n" +textReset+"You head back to Khemet with the heroes. "
					+ "Once you arrive, the townspeople stare in shock at the return of the \nadventurers alongside a group of kids and the Archaic Heroes."
					+ "You're party celebrated as the group of heroes \nthat saved the world and brought back the heroes to the kingdom. "
					+ textAelar + "\nAelar: "+ Characters.getPlayerName() +" are you happy? You saved the world! You Users enjoy doing that right? "
					+ "Hahaha! Good job User you \nreached the end alive, with your party alive that's a good ending! Right?\n" + textNarrator + 
					"\nGOOD ENDING! You helped the heroes save the world. Everything is back in the way it should be!");
		}
		else
		{
			//tells you what happens if you don't break the stone
			System.out.println(textReset + """
					You return to the Khemet without completing your quest. You told the king that there is nothing you can do. The king tells your party 
					that he thought this would happen. He gives you the reward for your time and reassures you everything is fine. You still feel regretful 
					for not finishing the quest completely. The world slowly begins to rot under the Aether's overwhelming drainage of mana to balance the 
					realms. You dearly wish that you could have changed this. That you could have done more. You could have helped the heroes. 
					"""
					+textAelar + "Aelar: " + Characters.getPlayerName() + ", would you like to try change this world's fate again?" + textReset+ "(yes/no)");
			badEndingAfterAelar(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
			
		}
	}
	
	/**
	 * This is the bad ending for the game. If the character dies, or if their party members die, or if they leave, then this is the ending the player gets.
	 */
	public static void badEndingAfterAelar(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		//checks if you want to change your fate.
		retryChoice = userInput.nextLine();
		if (retryChoice.equalsIgnoreCase("yes"))
		{
			System.out.println(textReset + "What would you want to know more about? (Heroes/Spirit realm/bonded animals/magical artifacts)");
			convoChoice(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			System.out.print(textAelar + "Aelar: No? I guess you Users are all the same. Goodbye " + Characters.getPlayerName() + ".\n"
					+ textNarrator + "\nNEUTRAL ENDING! Nothing happens to you or your party but the world is deteriorating. Hope you're happy!");
		}		
		
	}
	
	/**
	 * This is the bad ending for the game. If the character dies, or if their party members die, or if they leave, then this is the ending the player gets.
	 */
	public static void badEndingBeforeAelar(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		//checks if you want to change your fate.
		retryChoice = userInput.nextLine();
		if (retryChoice.equalsIgnoreCase("yes"))
		{
			goToRuins(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			System.out.print(textAelar + "???: No? I guess you Users are all the same. Goodbye " + Characters.getPlayerName() + "." +textNarrator
					+ "\n\nBAD ENDING! Everyone dies do you really need an explanation?");
		}
		
	}
	
	/**
	 * This is the bad ending for the game at the start.
	 */
	public static void badEndingBeforeQuest(Characters Phosrea, Characters Bartholowmew, Characters Ekas, Characters Aster, Characters Haru, Characters Cassia, Characters Ormr)
	{
		//A mysterious voice? Does that know your name? Who would've guessed
		//Ask if you want to change your choice about the quest.
		System.out.println(textAelar + "???: Hahaha! You have regrets " + Characters.getPlayerName() + "? I can change that all you have to do is \n"
				+ "say yes. Well? Would you like to change the World?" + textReset + "(yes/no)");
		retryChoice = userInput.next();
		if(retryChoice.equalsIgnoreCase("no"))
		{
			//This is mean but if you refuse you lose the game.
			System.out.println(textAelar + "???: Really? I guess I thought you were different. Goodbye " + Characters.getPlayerName() + " try not to "
					+ "drown in your regrets.\n\n"
					+ textNarrator + "BAD ENDING! Nothing bad happens to you but you also could be the reason three people died. I hope you're happy!");
			
		}
		else if(retryChoice.equalsIgnoreCase("yes"))
		{
			//runs the code again from before the quest offer so you can pick a different option. Also I wonder what that noise was?
			System.out.println(textAelar +"???: Hehehe! Good luck " + Characters.getPlayerName() + " try not to die. We might meet again. But hopefully "
					+ "not too soon!"
					+ textReset + "You hear something click and what sounds like sand falling.");
			System.out.println(textReset + """
					You accept the king's quest. He tells to to get acquainted and prepare for the journey, that a carriage will take 
					you to the ruins and stay there. There will be food and guards stationed in the ruins but they cannot help you 
					they are just there to contain anything dangerous that might be in the ruins. If you die they will bring back your 
					bodies. You stand up and look at the other participants of the quest.
					""");
			npcInteractions(Phosrea, Bartholowmew, Ekas, Aster, Haru, Cassia, Ormr);
		}
		else
		{
			//This ends the game
			System.out.println(textAelar+ "???:...You think you're funny don't you. I was being nice to you, but nooo " + Characters.getPlayerName()
					+ "can't be serious. \nThat really is too bad. Goodbye, child. I hope you're happy.  "
					+textNarrator + "\n\nBAD ENDING! You didn't pick to whether try again or not so you get the ending you left off at. Also the entity \nis annoyed at you for being immature.");
		
		}
	}
	
}
