/**
 * This is a subclass of the superclass Dog. 
 * It is used for puppies since they it needs to
 * be checked if they were fed. There are also 
 * several override methods of the Dog class.
 * @author amberkanthack
 */
public class PuppyDog extends Dog {
	//tracks the puppy's feeding habits every month
	private boolean isFed;
	
	public PuppyDog(int a, String n, boolean adopted, boolean fed)
	{
		super(a, n, adopted);
		isFed = fed;
	}
	
	/*
	 * Overrides the stateAge method in Dog class so 
	 * it counts by months and not years.
	 */
	public void stateAge()
	{
		//prints out the age and name of the puppy
		System.out.println(name +" is " + age +" months old.");
	}
	
	/*
	 * sets the isFed variable to true.
	 * used when the puppy is fed.
	 */
	public void feedPup()
	{
		isFed = true;
	}
	
	/*
	 * Increases the age every month and resets isFed because it is a new month.
	 */
	public void increaseAge()
	{
		//calls the increaseAge method from the super class
		super.increaseAge();
		isFed=false;
	}
	
	/*
	 * Prints out the puppy's features
	 */
	public String toString()
	{
		//checks if the pup was fed.
		if(isFed)
		{
			return super.toString() + " \nI've been fed!";
		}
		else
		{
			return super.toString() + "\nI haven't been fed yet...Please feed me...";
		}
			
	}
	
	/*
	 * Overrides .equals to compare two PuppyDog objects together
	 */
	public boolean equals(PuppyDog puppy)
	{
		//checks if everything is the same
		if(super.equals(puppy) && 
				this.isFed == puppy.isFed)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
