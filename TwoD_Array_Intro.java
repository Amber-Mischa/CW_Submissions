/**
 * This class is used for the problems in the 2D Array Intro 
 * assignment. It works with 2D arrays to change elements in 
 * two different arrays. It also uses methods to print out 
 * elements in a 2D array.
 */
public class TwoD_Array_Intro {

	public static void main(String[] args) {
		//TASK1: Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword
		int[][] gridNums = new int[4][6];
		
		//TASK2: Instantiate a 2-D array 
		int[][] nums = {
				{4, 5, 7},
				{2, -1, 8},
				{0, 1, 3}
				};
		//TASK3:change the element in the first row, first column to a 17.
		System.out.println(gridNums[0][0]);
		System.out.println(nums[0][0]);
		gridNums[0][0] = 17;
		nums[0][0] = 17;
		System.out.println(gridNums[0][0]);
		System.out.println(nums[0][0]);
		
		//TASK4: change the element in the second row, third column into a 20.
		System.out.println(gridNums[1][2]);
		System.out.println(nums[1][2]);
		gridNums[1][2] = 20;
		nums[1][2] = 20;
		System.out.println(gridNums[1][2]);
		System.out.println(nums[1][2]);
		
		//TASK5:change the last element in the first row to a -5.
		System.out.println(gridNums[0][gridNums[0].length-1]);
		System.out.println(nums[0][nums[0].length-1]);
		gridNums[0][gridNums[0].length-1] = -5;
		nums[0][nums[0].length-1] = -5;
		System.out.println(gridNums[0][gridNums[0].length-1]);
		System.out.println(nums[0][nums[0].length-1]);
		
		//TASK6: change the first element in the last row to a -7
		System.out.println(gridNums[gridNums.length-1][0]);
		System.out.println(nums[nums.length-1][0]);
		gridNums[gridNums.length-1][0] = -7;
		nums[nums.length-1][0]= -7;
		System.out.println(gridNums[gridNums.length-1][0]);
		System.out.println(nums[nums.length-1][0]);
		
		//TASK7:change the last element in the last row to a -30
		System.out.println(gridNums[gridNums.length-1][gridNums[gridNums.length-1].length-1]);
		System.out.println(nums[nums.length-1][nums[nums.length-1].length-1]);
		gridNums[gridNums.length-1][gridNums[gridNums.length-1].length-1] = -30;
		nums[nums.length-1][nums[nums.length-1].length-1]= -30;
		System.out.println(gridNums[gridNums.length-1][gridNums[gridNums.length-1].length-1]);
		System.out.println(nums[nums.length-1][nums[nums.length-1].length-1]);
		
		//Array used in tasks 8-11.
		int[][]  randomInts= {
				{6, 3, 2},
				{22, 10, 8},
				{21, 13, 0}
				};
		//TASK8: prints out the each element in the first row of an array
		printRow(randomInts);
		System.out.print("\n");
		
		//TASK9: prints out the each element in the first column of an array
		printColumn(randomInts);
		System.out.print("\n");
		
		//TASK10: prints out each element in the array in row major order
		printRowMajor(randomInts);
		System.out.print("\n");
		
		//TASK11: prints out each element in the array in column major order
		printColumnMajor(randomInts);
	}
	
	/*
	 * This method prints the first row of a given array
	 */
	public static void printRow(int[][] nums)
	{
		//prints out all the elements in the row
		for(int i = 0; i<nums[0].length; i++)
		{
			System.out.print(nums[0][i] + " ");
		}
	}
	
	/*
	 * This method prints the first column of a given array
	 */
	public static void printColumn(int[][] nums)
	{
		//prints out all the elements in the column
		for(int i = 0; i<nums.length; i++)
		{
			System.out.print(nums[i][0] + " ");
		}
	}
	
	/*
	 * This method is used to print out all the elements in an array in row major order.
	 */
	public static void printRowMajor(int[][] nums)
	{
		//gets the number of the row
		for(int i = 0; i<nums.length; i++)
		{
			//gets what column
			for(int j = 0; j<nums[0].length; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			
		}
	}
	
	/*
	 * This method is used to print out all the elements in an array in column major order.
	 * I have no idea how this works but it does so I'm not gonna question it.
	 */
	public static void printColumnMajor(int[][] nums)
	{
		//gets what column
		for(int i = 0; i<nums.length; i++)
		{
			//gets the number of the row
			for(int j = 0; j<nums[0].length; j++)
			{
				System.out.print(nums[j][i] + " ");
			}
			
		}
	}
}
