/**
 * This class is used for the Searching Arrays Intro Homework
 * It completes the three different problems by creating different
 * methods.
 * This was kinda easy...
 * @author amberkanthack
 */
public class Searching_Arrays {

	public static void main(String[] args) {
		//array given
		int[] arr = {4,7,3,5,4,9,3,0,4,7,4};
		//calls all the methods and prints out what they return
		System.out.println(checkFor4(arr));
		System.out.println(countFor4(arr));
		System.out.println(checkForFour4(arr));
		
	}
	
	/*
	 * This method is used for the first problem.
	 * It checks to see if there are 4s in the given array.
	 */
	public static boolean checkFor4(int[] arr)
	{
		//copies the original array
		int[] copyArr = arr;
		//used to see if there is a 4
		int count = 0;
		//used to tell if there is a 4
		boolean check = false;
		
		//checks all elements in the array to see if it is a 4
		for(int i = 0; i<copyArr.length; i++)
		{
			if(copyArr[i] == 4)
			{
				//if it is a 4 then it adds to the count
				count++;
			}
		}
		
		//returns true or false if there is or is not a four
		if(count >= 1)
		{
			check = true;
		}
		return check;
	}
	
	/*
	 * This method is for the second problem.
	 * It counts how many 4s are in the 
	 */
	public static int countFor4(int[] arr)
	{
		//copies the original array
		int[] copyArr = new int[arr.length];
		//I want to try the copy by each element
		for(int i = 0; i<copyArr.length; i++)
		{
			copyArr[i] = arr[i];
		}
		
		//used to see if there is a 4
		int count = 0;
		
		
		//checks all elements in the array to see if it is a 4
		for(int j = 0; j<copyArr.length; j++)
		{
			if(copyArr[j] == 4)
			{
				//if it is a 4 then it adds to the count
				count++;
			}
		}
		
		//returns how many 4s are in the array
		return count;
	}
	
	public static boolean checkForFour4(int[] arr)
	{
		//copies the original array
		int[] copyArr = arr;
		//used to see if there is a 4
		int count = 0;
		//used to tell if there is a 4
		boolean check = false;
				
		//checks all elements in the array to see if it is a 4
		for(int i = 0; i<copyArr.length; i++)
		{
			if(copyArr[i] == 4)
			{
				//if it is a 4 then it adds to the count
				count++;
			}
		}
		
		//returns true or false if there is exactly fours 4s
		if(count == 4)
		{
			check = true;
		}
		return check;
	}
	

}
