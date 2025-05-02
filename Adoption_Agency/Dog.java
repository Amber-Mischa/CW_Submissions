/**
 * This is the superclass Dog. It is used to 
 * organize all Dog objects. It give each 
 * object a name, age, and if it is adopted. 
 * Is used to get the adoption status of a dog, 
 * print out its information, and compare it to 
 * other Dog objects.
 *  @author amberkanthack
 */
public class Dog {
	protected int age;
	protected String name;
	protected boolean isAdopted;
	
	public Dog(int a, String name, boolean adoption)
	{
		age = a;
		this.name = name;
		isAdopted = adoption;
	}
	
	/*
	 * gets the adoption status of the dog
	 */
	public boolean getAdoptionStatus()
	{
		//checks if the dog is adopted or not
		if(isAdopted)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * Prints out the name and age in years of the dog
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age +" years old");
	}
	
	/*
	 * Increases the age of the dog by one year
	 */
	public void increaseAge()
	{
		age++;
	}
	
	/*
	 * Prints out the dog features.
	 * The name, age, and adoption status of the dog
	 */
	public String toString()
	{
		stateAge();
		//checks if the dog is adopted
		if(isAdopted)
		{
			return name + " has a forever home!";
		}
		else
		{
			return name + " hasn't been adopted yet and is still looking for their forever home.";
		}
	}
	/*
	 * Overrides .equals to compare two Dod objects together
	 */
	public boolean equals(Dog dog)
	{
		//checks if everything is the same
		if(this.age == dog.age && 
				this.isAdopted == dog.isAdopted && 
				this.name.equals(dog.name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
