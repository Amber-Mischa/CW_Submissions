/**
 * This Class is used as an introduction for using String methods. 
 * There are 4 additional methods in this class. The main method is used to call all the methods.
 * @author amberkanthack
 */
import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args)
	{
		/*
		 * Sets up the scanner and the myInput variable for later methods to use.
		 */
		Scanner myReader = new Scanner(System.in);
		String myInput = new String(myReader.next());
		myReader.close();
		
		/*
		 * Calls all the methods using myInput as the param to execute all the tasks.
		 */
		printSecondAndLastLetter(myInput);
		System.out.println("The index of e is " + findTheE(myInput));
		System.out.println("The length of " +myInput + " is " + getLength(myInput));
		printFirstAndLastThree(myInput);

	}
	
	
	/**
	 * This method prints out the second and last character of the word inputed by the user.
	 */
	public static void  printSecondAndLastLetter(String input)
	{
		int lastChar = input.length()-1;
		System.out.print("The second letter is " + input.charAt(1) + " and the last letter is " + input.charAt(lastChar)+"\n");
	}
	
	
	/**
	 * @return the index of the e if there is one.
	 * If there is not an e in the word inputed the method will return -1
	 */
	public static int findTheE(String input) {
		return input.indexOf("e");
	}
	
	
	/**
	 * @return the length of the inputed word
	 */
	public static int getLength(String input)
	{
		return input.length();
	}
	
	
	/**
	 * This method prints out the first three characters of the inputed word 
	 * and the last three characters of the inputed word.
	 */
	public static void printFirstAndLastThree(String input){
		int thirdToLastChar = input.length()-3;
		int lastChar = input.length();
		System.out.print("The first three characters are " + input.substring(0, 3) + " and the last three characters are " + input.substring(thirdToLastChar,lastChar));
	}
}
