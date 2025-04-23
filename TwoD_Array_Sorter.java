/**
 * This class is used to sort through 2D arrays in two different ways
 * and then printing the array. First it sorts left-right, top-down 
 * order than it sorts top-down, left-right order.
 * @author amberkanthack
 */
public class TD_Array_Sorter {

	public static void main(String[] args) {
		//array for the left-right, top-down sorter
		double[][] numsLRTD = {
				{5.3,1.2,0.3},
				{6.7,4.5,5.1},
				{9.1,2.3,4.3}};
		
		//sorts through the 2D array
		sortLRTD(numsLRTD);
		//prints the sorted array
		for(int i = 0; i<numsLRTD.length; i++)
		{
			for(int j = 0; j<numsLRTD[0].length; j++)
			{
				System.out.print(numsLRTD[i][j] + ",");
			}
			System.out.println(" ");
		}
		//line between the two sorted arrays
		System.out.println(" ");

		//array for the top-down sorter
		double[][] numsTDLR = {
				{5.3,1.2,0.3},
				{6.7,4.5,5.1},
				{9.1,2.3,4.3}};
		//sorts through the 2D array
		sortTDLR(numsTDLR);
		//prints the sorted array
		for(int i = 0; i<numsTDLR.length; i++)
		{
			for(int j = 0; j<numsTDLR[0].length; j++)
			{
				System.out.print(numsTDLR[i][j] + ",");
			}
			System.out.println(" ");
		}
	}

	/*
	 * This method is used to sort through a 2D array of doubles in left-right, top-down order
	 */
	public static double[][] sortLRTD(double[][] nums)
	{
	
		int min = 0;
		int count = -1;
		//makes sure every row is sorted least to greatest.
		while(count != 0)
		{
			//resets counter
			count = 0;
			for(int i = 0; i < nums[0].length; i++)
			{
				min = i;
				//iterates through each row
				for(int r = 0; r<nums.length; r++)
				{
					//iterates through each column
					for(int c = i; c<nums[0].length; c++)
					{
						//compares everything in a row for the smallest
						if(nums[r][c] < nums[r][min])
						{
							//swaps if it is smaller
							double temp = nums[r][c];
							nums[r][c] = nums[r][min];
							nums[r][min] = temp;
							count++;
						}
					}	
				}										
			}
			
		}
		//goes through each row
		for(int row = 0; row<nums.length-1;row++)
		{
			//checks if the last element in the row is greater than the first element of the next row
			if(nums[row][nums.length-1]>nums[row+1][0])
			{
				//swaps if it is larger
				double temp = nums[row][nums.length-1];
				nums[row][nums.length-1] = nums[row+1][0];
				nums[row+1][0] = temp;
				//goes through the array again to make sure it is sorted
				sortLRTD(nums);
			}
		}
    //returns the sorted array
		return nums;
	}
	
	/*
	 * This method is used to sort through a 2D array of doubles in top-down, left-right order
	 */
	public static double[][] sortTDLR(double[][] nums)
	{
	
		int min = 0;
		int count = -1;
		//makes sure every column is sorted least to greatest.
		while(count != 0)
		{
			//resets counter
			count = 0;
			for(int i = 0; i < nums.length; i++)
			{
				min = i;
				//iterates through each row
				for(int r = i; r<nums.length; r++)
				{
					//iterates through each column
					for(int c = 0; c<nums[0].length; c++)
					{
						//compares everything in a column for the smallest
						if(nums[r][c] < nums[min][c])
						{
							//swaps if it is smaller
							double temp = nums[r][c];
							nums[r][c] = nums[min][c];
							nums[min][c] = temp;
							count++;
						}
					}	
				}										
			}
			
		}
		//loops each column again
		for(int col = 0; col<nums[0].length-1; col++)
		{
			//checks if the last element in the column is greater than the first element in the next column 
			if(nums[0][col+1]<nums[nums.length-1][col])
			{
				//swaps if it is
				double temp = nums[nums.length-1][col];
				nums[nums.length-1][col] = nums[0][col+1];
				nums[0][col+1] = temp;
				//runs through the sorter again
				sortTDLR(nums);
			}
		}
		//returns the sorted array
		return nums;
	}

}
