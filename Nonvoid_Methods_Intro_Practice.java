
public class NonVoid_Methods_Practice {

	public static void main(String[] args) {
		//Task 1
		System.out.println(stateName());
		System.out.println(stateHairStyle());
		System.out.println(stateFavoriteFood());
		//Task 2
		System.out.println(printCircleStats());
		//Task 3
		int numOne = 3;
		int numTwo = 5;
		
		System.out.println("\nThe sum of "+numOne+"+"+numTwo+" is "+getSum(numOne, numTwo)+".");
		System.out.println("The difference of "+numOne+"-"+numTwo+" is "+getDifference(numOne, numTwo)+".");
		System.out.println("The product of "+numOne+"*"+numTwo+" is "+getProduct(numOne, numTwo)+".");
		System.out.println("The quotient of "+numOne+"/"+numTwo+" is "+getQuotient(numOne, numTwo)+".");
		System.out.print("The remainder of "+numOne+"%"+numTwo+" is "+getRemainder(numOne, numTwo)+".");

	}
	//task 1
	/** 
	 * @return my full name when called 
	 */
	public static String stateName() 
	{
		return "My name is Amber Mischa Flores Kanthack.";
	}
	
	/**
	 * @return my eye color when called
	 */
	public static String stateEyeColor() 
	{
		return "My eye color is brown!";
		//I've had people tell me different colors
	}
	
	/**
	 * @return my hair style when called
	 */
	public static String stateHairStyle() 
	{
		return "My hair style is currently in a low ponytail with left sideswept bangs and a black headband.";
	}
	
	/**
	 * @return my Best Friends' name when called
	 */
	public static String stateBestFriend() 
	{
		return "My Best friends are Julia Gonzales and Justine Waje!";
	}
	
	/**
	 * @return my favorite food when called
	 */
	
	public static String stateFavoriteFood() 
	{
		return "My favorite food is currently fried rice! This changes often.";
	}
	
	//task 2
	/** Var key
	 * pi is π
	 * dia is diameter
	 * r is radius
	 * circm is circumference
	 * area is area of the circle
	 */
	
	/**
	 * @return the circle's diameter
	 */
	public static double getDiameter(double r) 
	{
		return 2*r;	
	}
	
	/**
	 * @return the circle's circumference
	 */
	public static double getCircumference(double r) 
	{
		final double pi = 3.14;
		return  2*pi*r;
	}
	
	/**
	 * @return the circle's surface area
	 */
	public static double getArea(double r) 
	{
		final double pi = 3.14;
		return pi*(r*r);
	}
	
	/**
	 * prints the circle's states
	 */
	public static String printCircleStats() {
		double r=2;
		return "\nThe radius of the circle is " + r +"\nThe diameter of the circle is " + getDiameter(r) +"\nThe circumference of the circle is "+ getCircumference(r)+ "\nThe area of the circle is " + getArea(r);
	}
	//task 3
	/* Var key
	 * sum is sum
	 * diff is difference
	 * pro is product
	 * quot is quotient
	 * modu is remainder 
	 */
	
	/**
	 * finds out sum of two ints
	 */
	public static int getSum(int numOne, int numTwo) 
	{
		return numOne+numTwo;
	}
	
	
	/**
	 * finds out difference of two ints
	 */
	public static int getDifference(int numOne, int numTwo) 
	{
		return numOne-numTwo;
	}
	
	
	/**
	 * finds out product of two ints
	 */
	public static int getProduct(int numOne, int numTwo) 
	{
		return numOne*numTwo;
	}
	
	
	/**
	 * finds out quotient of two ints
	 */
	public static int getQuotient(int numOne, int numTwo) 
	{
		return numOne/numTwo;
	}


	/**
	 * finds out remainder of two ints
	 */
	public static int getRemainder(int numOne, int numTwo) 
	{
		return numOne%numTwo;
	}

}