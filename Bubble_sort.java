/**
 * This class is to make the bubble sorting array algorithm.
 * @author amberkanthack
 */
public class Sorting_Algorithm {

	public static void main(String[] args) {
		int[] arr = {9,2,5,1};
		
		bubbleSort(arr);
		for(int i = 0; i <arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

	//BUBBLE SORT AN ARRAY
	public static void bubbleSort(int[] nums)
	{
   		//variables for the method
		int[] copyNums = nums;
		int count = -1;
  		//makes sure everything is sorted
		while(count != 0)
		{
      			//resets counter
			count = 0;
     			//checks for everything in the array
			for(int i =0; i<copyNums.length-1; i++)
			{
        			//sees if it is in order
				if(copyNums[i] > copyNums[i+1])
				{
          				//swaps the numbers
					int temp = copyNums[i];
					copyNums[i] = copyNums[i+1];
					copyNums[i+1] = temp;
					count++;
				}
			}
		}
	}
}
	
