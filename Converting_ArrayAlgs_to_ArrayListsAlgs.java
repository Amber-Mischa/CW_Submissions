/**
 * This class is used to convert array algorithms into usable Array Lists algorithms.
 * @author amberkanthack
 */
import java.util.ArrayList;
public class Converting_Arrays_To_ArrayLists {

	public static void main(String[] args) {
		//TASK1
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(9);
		nums.add(4);
		nums.add(2);
		System.out.println(checkFor4(nums));
		
		//TASK2
		ArrayList<Integer> fives = new ArrayList<Integer>();
		fives.add(5);
		fives.add(0);
		fives.add(8);
		fives.add(5);
		fives.add(5);
		fives.add(20);
		ridAllFives(fives);
		System.out.println(fives);
		
		//TASK3
		ArrayList<Integer> sort = new ArrayList<Integer>();
		sort.add(5);
		sort.add(9);
		sort.add(4);
		sort.add(2);
		bubbleSort(sort);
		System.out.print(sort);

	}
	
	/*
	 * This method is used to find the index of the first 4 in the Array List. 
	 */
	public static int checkFor4(ArrayList<Integer> num) {
		for(int i = 0; i<num.size(); i++)
		{
			//checks if the element is 4 if it is then it returns the Index
			if(num.get(i) == 4) 
			{
				return i;
			}
		}
		//If there is no 4 then it returns -1
		return -1;
	}
	
	/*
	 * This method is used to remove all the fives in the array.
	 */
	public static void ridAllFives(ArrayList<Integer> nums)
	{
		for(int i = nums.size()-1; i>-1; i--)
		{
			//checks if the element is 5 if it is then it removes it
			if(nums.get(i) == 5) 
			{
				nums.remove(i);
			}
		}
	}
	
	/*
	 * This method is used to bubble sort and Array List.
	 * I hated this.
	 */
		public static void bubbleSort(ArrayList<Integer> nums)
		{
			//variables for the method
			int count = 3;
			//makes sure everything is sorted
			while(count != 0)
			{
				//resets counter
				count = 0;
				//checks for everything in the array
				for(int i =0; i<nums.size()-1; i++)
				{
					//sees if it is in order
					if(nums.get(i) > nums.get(i+1))
					{
						//swaps the numbers
						int temp = nums.get(i);
						nums.set(i, nums.get(i+1));
						nums.set(i+1, temp);
						count++;
					}
				}
			}
		}

}
