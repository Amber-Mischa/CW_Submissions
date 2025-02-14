/**
 * This class is has several algorithms that do various things to arrays. 
 * It has finding the min, average, how many of a given number there is,
 * seeing if all the numbers are even, moving an array one to the right,
 * sorting an array, and reversing an array. 
 */
public class Algorithms_Project {

	public static void main(String[] args) {
		
		//Task1
		int[] numArr = {9, 38, 1, 5, 10, 4};
		System.out.println(findSmallestNum(numArr));
		
		//Task2
		System.out.println(findSmallestNumIndex(numArr));
		
		//Task3
		System.out.println(findArrAverage(numArr));
		
		//Task4
		int[] evenOddArr = {0, 2, 26, 92, 8};
		System.out.println(evenOnly(evenOddArr));
		
		//Task5
		int[] fiveArr = {4, 5, 5, 2, 1};	
		findConsecFives(fiveArr);
		for(int i = 0; i<fiveArr.length; i++)
		{
			System.out.print(fiveArr[i] + " ");
		}		
		
		System.out.println("");
		
		//Task6
		int[] threeArr = {4, 1, 4, 3, 4};
		System.out.println(findThreeRow(threeArr));
		
		//Task7
		int[] arr = {4, 5, 5, 2, 1};
		//I'm running our of names for these arrays...
		System.out.println(findNum(arr, 5));
		
		//Task8
		int[] revArr = {4, 5, 5, 2, 1};	
		reverseArr(revArr);
		for(int i = 0; i<revArr.length; i++)
		{
			System.out.print(revArr[i] + " ");
		}
		System.out.println("");

		//Task9
		int[] moveRight = {4, 5, 5, 2, 1};	
		rightArr(moveRight);
		for(int i = 0; i<moveRight.length; i++)
		{
			System.out.print(moveRight[i] + " ");
		}
		System.out.println("");

		//Task10
		int[] sortArr = {4, 5, 5, 2, 1};	
		selectionSortArr(sortArr);
		for(int i = 0; i<sortArr.length; i++)
		{
			System.out.print(sortArr[i] + " ");
		}
		
	}
	
	/*
	 * This method is used to find the smallest number in 
	 * an array.
	 */
	public static int findSmallestNum(int[] nums)
	{
		int[] copyNums = nums;
		int smallest = copyNums[0];
		//increases the index the system is looking at
		for(int i = 0; i<copyNums.length; i++)
		{
			//checks if the increment is less then the lowest, if so it is the new lowest
			if(smallest > copyNums[i])
			{
				smallest = copyNums[i];
			}
		}
		
		return smallest;
	}
	
	/*
	 * This method is used to find the index of the smallest
	 *  number in the array.
	 */
	public static int findSmallestNumIndex(int[] nums)
	{
		int[] copyNums = nums;
		int minIndex = 0;
		//increases the increments to find the lowest index
		for(int i = 0; i<copyNums.length; i++)
		{
			//checks if the increment is less then the lowest, if so the index is the new lowest
			if(copyNums[minIndex] > copyNums[i])
			{
				minIndex = i;
			}
			
		}
		
		return minIndex;
	}
	
	/*
	 * This method adds up all the numbers in the array and 
	 * then divides by how many numbers are added to find 
	 * the average of the array.
	 */
	public static int findArrAverage(int[] nums)
	{
		int[] copyNums = nums;
		int ave = 0;
		int sum = 0;
		//increases the index the system is looking at so everything is added

		for(int i = 0; i < copyNums.length; i++)
		{
			//adds all the elements in the array
			sum = sum + copyNums[i];
		}
		//divides it by how many elements are in the array
		ave = sum/copyNums.length;
		
		return ave;
	}
	
	/*
	 * This method checks if there are only even numbers in 
	 * the array and returns true if there are no odd numbers.
	 */
	public static boolean evenOnly(int[] nums)
	{
		int[] copyNums = nums;
		int evenCount = 0;
		boolean check = false;
		//checks every element if it is even or not.
		for(int i = 0; i<copyNums.length; i++)
		{
			if(copyNums[i] % 2 ==0)
			{
				//increases the count if the element is even
				evenCount++;
			}
			
		}
		//checks to see if the count is the same as the length
		if(evenCount == copyNums.length)
		{
			check = true;
		}
		return check;
		
	}
	
	/*
	 * This method is used to see if there are two fives in a row
	 * if there is it changed them to 0.
	 */
	public static void findConsecFives(int[] nums)
	{
		for(int i = 0; i<nums.length-1;i++)
		{
			//checks if there are two 5s next to each other in an array
			if(nums[i] == 5 && nums[i+1] == 5)
			{
				//changes the 5s to 0s
				nums[i] = 0;
				nums[i+1] = 0;
			}
		}
	}
	
	/*
	 * This method is used to find if there is three consecutive 
	 * numbers are the same
	 */
	public static boolean findThreeRow(int[] nums)
	{
		int[] copyNums = nums;
		boolean check = false;
		//checks if every number is the same as the next two to find 3 consecutive numbers
		for(int i = 0; i<copyNums.length-2; i++)
		{
			if(copyNums[i] == copyNums[i+1] && copyNums[i] == copyNums[i+2])
			{
				check = true;
			}
		}
		return check;
	}
	
	/*
	 * This method is used to count how many of a certain 
	 * number is in an array
	 */
	public static int findNum(int[] nums, int n)
	{
		int[] copyNums = nums;
		int count = 0;
		//counts how many of the given number is in the array
		for(int i = 0; i<copyNums.length;i++)
		{
			if(copyNums[i] == n)
			{
				count++;
			}
		}
		return count;
	}
	
	/*
	 * This method is used to reverse the array
	 * I hate this method it took so long to figure out
	 */
	public static void reverseArr(int[] nums)
	{
		//how many times the loop needs to execute
		int half = nums.length/2;
		//finds the index of the last number
		int lastIndex = nums.length-1;
		for(int i = 0; i<half; i++)
		{
			//swaps the numbers 
			int temp = nums[lastIndex - i];
			nums[lastIndex - i] = nums[i];
			nums[i] = temp;
		}
	}
	/*
	 * This method is used to move every number in 
	 * the array one space to the right.
	 */
	public static void rightArr(int[] nums)
	{
		for(int i = nums.length-1; i > 0; i--)
		{		
			//swaps the numbers to the right
			int temp = nums[i];
			nums[i] = nums[i-1];
			nums[i-1] = temp;
			
		}
	}
	
	/*
	 * This method is for the selection sort array. It goes
	 * through all the numbers in the array and finds the 
	 * smallest and puts it in the front, then finds the 
	 * second smallest and puts it after and so on, and so on.
	 */
	public static void selectionSortArr(int[] nums)
	{
		//variable used to keep the index of the smallest number
		int minIndex = 0;
		//goes through each number in the array
		for(int i = 0; i < nums.length-1; i++)
		{
			minIndex = i;
			//Separates the array into a sorted and not sorted areas
			for(int j = i; j<nums.length; j++)
			{
				if(nums[j] < nums[minIndex])
				{
					//finds the min in the unsorted array
					minIndex = j;							
				}
			}
			//swaps smaller number into place in the unsorted array
			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
		}
	}
		
		

}
