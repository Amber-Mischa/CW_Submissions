/**
 * This class is used for the Altering Arrays problems.
 * finding out how to call the method with the array was
 * difficult.
 * @author amberkanthack
 */
public class Altering_Arrays {

	public static void main(String[] args) {
		//starting array for the method with 4 elements
		int[] arr = {5, 0, 8, 20};
		//creates a new array to hold the changed array
		int[] copyArr = subtract5FromAll4(arr);
		//prints out each changed element on a separate line
		for(int i =0; i<=4; i++)
		{
			System.out.println(copyArr[i]);

		}
	}

	/*
	 * This method is used to subtract 5 from all elements in the array
	 */
	public static int[] subtract5FromAll4(int[] nums)
	{
		//copies the passed array
		int[] copyNums = new int[4];
		//subtracts 5 from each element
		for(int i =0; i<=4; i++)
		{
			copyNums[i] = nums[i]-5;
			
		}
		//returns the changed array
		return copyNums;
	}
}
