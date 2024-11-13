/**
 * This class is used for the Loops Intro Practice assignment.
 * it has all three methods and prints out to make sure it does return what it is supposed to.
 * @author amberkanthack
 */
public class Loops_Practice {

	public static void main(String[] args) {
		//prints out what countLetters returns
		System.out.println(countLetters("abqcdqefghqqijk", 'q'));
		System.out.println(getFactorial(5));
		System.out.println(printIfRepeats("fkekn"));
	}
	/**
	 * @param str
	 * @param let
	 * @return how many times a letter repeats in a given string.
	 */
	public static int countLetters(String str, char let)
	{
		//initial letter count
		int letterCount = 0;
		//checks if the character is in String then adds one to the letter if there is. 
		//if there isn't then letterCount stays at 0
		for(int i = 0; i < str.length(); i++)
		{
			if(let == str.charAt(i))
			{
				letterCount++;
			}
			
		}
		return letterCount;
	}
	
	
	/**
	 * @param num
	 * @return the factorial of a given number
	 */
	public static int getFactorial(int num)
	{
		//multiply by i first that subtracts 1 from i and repeat.
		for(int i = num-1; i > 0;)
		{
			num = num*i;
			i -= 1;
		}
		return num;
	}
	
	/**
	 * this method is used to check if there are double letters
	 * for example 'abbcd' and 'aabbc' both are true. Or 'abcde'
	 * and 'fedcg' are both false.
	 * @param str
	 * @return true or false 
	 * I hate this thing so much.
	 */
	public static boolean printIfRepeats(String str)
	{
		boolean repeat = false;
		//repeats checking for repeat chars in every place
		for(int i = 0; i < str.length(); i++)
		{
			//checks that i has a character after it to grab
			if(i+1 >str.length())
			{
				//check that there is a character before it to grab
				if(i-1 >= 0)
				{
					//checks if the chracter before or after i is the same as it in the string
					if(str.charAt(i) == str.charAt(i-1) || str.charAt(i) == str.charAt(i+1))
					{
						repeat = true;
					}
					else
					{
						 repeat = false;
					}
					
				}
				else
				{
					//checks if the char after i is the same as i in the string
					 if (str.charAt(i) == str.charAt(i+1))
				 	 {
						 repeat = true;
					 }
					 else
					 {
						 repeat = false;
					 }
				}
				
			}
			else
			{
				//checks if i-1 will be above 0 so it doesn't produce an error when grabbing the character
				if(i-1 >= 0)
				{
					//compares the character at i and the character before i
					if(str.charAt(i) == str.charAt(i-1))
					{
						repeat = true;
					}
					else
					{
						 repeat = false;
					}
					
				}
				else 
				{
					//false because if there isn't a letter before i or one after i then it is just one letter
					repeat = false;
				}
			}
		}
		return repeat;
	}
	
}
