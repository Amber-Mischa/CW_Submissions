
public class Methods_Intro_Practice {

	public static void main(String[] args)
	{
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(36.15);
		printMathStuffs(24,18);
	}

	/** 
	 * Prints out my name when called 
	 */
	public static void stateName() 
	{
		//my full name
		System.out.println("My name is Amber Mischa Flores Kanthack.");
	}
	
	/**
	 * Prints out my eye color when called
	 */
	public static void stateEyeColor() 
	{
		System.out.println("My eye color is brown!");
		//I've had people tell me different colors
	}
	
	/**
	 * Prints out my hair style when called
	 */
	public static void stateHairStyle() 
	{
		System.out.println("My hair style is currently fully down with left sideswept bangs and a black headband.");
	}
	
	/**
	 * Prints out my Best Friends' name when called
	 */
	public static void stateBestFriend() 
	{
		System.out.println("My Best friends are Julia Gonzales and Justine Waje!");
		//background information about them and jokes
		System.out.println("I've known them since 7th grade, Justine is my platonic fiance and Julia is my ex-platonic fiance");
	}
	
	/**
	 * Prints out my favorite food when called
	 */
	
	public static void stateFavoriteFood() 
	{
		System.out.println("My favorite food is currently fried rice! This changes often.");
	}
	
	
	/**
	 *  Calculates then prints out the radius, diameter, circumference, and area of the circle.\
	 *  Prints out the stats when called
	 */
	public static void printCircleStats(double r) 
	{
		/* Var key
		 * pi is π
		 * dia is diameter
		 * r is radius
		 * circm is circumference
		 * area is area of the circle
		 */
		final double pi = 3.14;
		double dia = 2*r;
		double circm = 2*pi*r;
		double area = pi*(r*r);
		
		//Prints out the stats(radius, diameter, circumference, and area)
		System.out.println("\nThe radius of the circle is "+r+".");
		System.out.println("The diameter of the circle is "+ dia +".");
		System.out.println("The circumference of the circle is "+ circm +".");
		System.out.println("The area of the circle is "+ area +".");
		
	}
	
	/**
	 * Calculates the sum, difference, product, quotient, and remainder of two given numbers.
	 * Prints out the answers when called
	 */
	
	public static void printMathStuffs(int numOne, int numTwo) 
	{
		/* Var key
		 * sum is sum
		 * diff is difference
		 * pro is product
		 * quot is quotient
		 * modu is remainder 
		 */
	
		//sum, difference, product, quotient, and remainder of two numbers
		int sum = numOne+numTwo;
		int diff = numOne-numTwo;
		int pro = numOne*numTwo;
		int quot = numOne/numTwo;
		int modu = numOne%numTwo;
		
		//calls the answers
		System.out.println("\nThe sum of " + numOne + "+"+numTwo +" is " +sum+ ".");
		System.out.println("The difference of " + numOne + "-"+numTwo +" is " +diff+ ".");
		System.out.println("The product of " + numOne + "*"+numTwo +" is " +pro+ ".");
		System.out.println("The quotient of " + numOne + "/"+numTwo +" is " +quot+ ".");
		System.out.println("The remainder of " + numOne + "%"+numTwo +" is " +modu+ ".");
	}

}
