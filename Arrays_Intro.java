/**
 * This class is for the Arrays Intro assignment.
 * it completes all the tasks
 * @author amberkanthack
 */
public class Arrays_Intro {

	public static void main(String[] args) {
		//Task 1: create arrays for doubles, ints, Strings, booleans, and Circles
		double[] doubArr;
		int[] intArr;
		String[] strArr;
		boolean[] blnArr;
		Circle[] circArr;
		
		//Task 2: create an int array and give it values
		int[] numArr = {7, -12, 88, -88, 0, 5, 2000};
		
		//Task 3: Create a String array and give it 5 values(default values)
		/*
		 * Default values for each data type:
		 * int - 0
		 * double - 0.0
		 * booleans - false
		 * String & reference data types - null
		 */
		String[] fruitsArr = new String[5];
		
		//Task 4: change the 2nd value of fruitsArr 
		fruitsArr[1] = "Bapple";
		
		//Task 5: change the last value of fruitsArr without typing the number
		fruitsArr[fruitsArr.length-1] = "Zanana";
		
		//Task 6: make sure I did task 4 correctly
		System.out.println(fruitsArr[1]);
		
		//Task 7: print out each element of fruitsArr one by one
		for(int i=0;i<fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
	}

}
