/**
 * This class is has several algorithms that do various things to Array Lists. 
 * It has finding the min, average, how many of a given number there is,
 * seeing if all the numbers are even, moving an Array List one to the right,
 * sorting an Array List, and reversing an Array List. 
 */
import java.util.ArrayList;
public class ArrayLists_Algorithms_Project {

	public static void main(String[] args) {
		
		//Task1
		ArrayList<Integer> numsArr = new ArrayList<Integer>();
		numsArr.add(9);
		numsArr.add(38);
		numsArr.add(1);
		numsArr.add(5);
		numsArr.add(10);
		numsArr.add(4);
		System.out.println(findSmallestNum(numsArr));
		
		//Task2
		System.out.println(findSmallestNumIndex(numsArr));
		
		//Task3
		System.out.println(findArrAverage(numsArr));
		
		//Task4
		ArrayList<Integer> evenOddArr = new ArrayList<Integer>();
		evenOddArr.add(0);
		evenOddArr.add(2);
		evenOddArr.add(26);
		evenOddArr.add(92);
		evenOddArr.add(8);
		System.out.println(evenOnly(evenOddArr));
		
		//Task5
		ArrayList<Integer> fiveArr = new ArrayList<Integer>();
		fiveArr.add(4);
		fiveArr.add(5);
		fiveArr.add(5);
		fiveArr.add(2);
		fiveArr.add(1);
		findConsecFives(fiveArr);
		System.out.println(fiveArr);
		
		//Task6
		ArrayList<Integer> threeArr = new ArrayList<Integer>();
		threeArr.add(4);
		threeArr.add(1);
		threeArr.add(4);
		threeArr.add(3);
		threeArr.add(4);
		System.out.println(findThreeRow(threeArr));
		
		//Task7
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(4);
		arrList.add(5);
		arrList.add(5);
		arrList.add(2);
		arrList.add(1);
		//I'm running our of names for these arrays...
		System.out.println(findNum(arrList, 5));
		
		//Task8
		ArrayList<Integer> revArr = new ArrayList<Integer>();
		revArr.add(4);
		revArr.add(5);
		revArr.add(5);
		revArr.add(2);
		revArr.add(1);
		
		reverseArr(revArr);
		System.out.println(revArr);
		

		//Task9
		ArrayList<Integer> moveRight = new ArrayList<Integer>();
		moveRight.add(4);
		moveRight.add(5);
		moveRight.add(5);
		moveRight.add(2);
		moveRight.add(1);
		rightArr(moveRight);
		System.out.println(moveRight);
		
		//Task10
		ArrayList<Integer> sortArr = new ArrayList<Integer>();
		sortArr.add(4);
		sortArr.add(5);
		sortArr.add(5);
		sortArr.add(2);
		sortArr.add(1);	
		selectionSortArr(sortArr);
		System.out.print(sortArr);

		
	}
	
	/*
	 * This method is used to find the smallest number in 
	 * an array.
	 */
	public static int findSmallestNum(ArrayList<Integer> nums)
	{
		int smallest = nums.get(0);
		//increases the index the system is looking at
		for(int i = 0; i<nums.size(); i++)
		{
			//checks if the increment is less then the lowest, if so it is the new lowest
			if(smallest > nums.get(i))
			{
				smallest = nums.get(i);
			}
		}
		
		return smallest;
	}
	
	/*
	 * This method is used to find the index of the smallest
	 *  number in the Array List.
	 */
	public static int findSmallestNumIndex(ArrayList<Integer> nums)
	{
		int minIndex = 0;
		//increases the increments to find the lowest index
		for(int i = 0; i<nums.size(); i++)
		{
			//checks if the increment is less then the lowest, if so the index is the new lowest
			if(nums.get(minIndex) > nums.get(i))
			{
				minIndex = i;
			}
			
		}
		
		return minIndex;
	}
	
	/*
	 * This method adds up all the numbers in the Array List
	 * and then divides by how many numbers are added to find 
	 * the average of the Array List.
	 */
	public static int findArrAverage(ArrayList<Integer> nums)
	{
		int ave = 0;
		int sum = 0;
		//increases the index the system is looking at so everything is added
		for(int i = 0; i < nums.size(); i++)
		{
			//adds all the elements in the Array List
			sum = sum + nums.get(i);
		}
		//divides it by how many elements are in the Array List
		ave = sum/nums.size();
		
		return ave;
	}
	
	/*
	 * This method checks if there are only even numbers in 
	 * the Array List and returns true if there are no odd numbers.
	 */
	public static boolean evenOnly(ArrayList<Integer> nums)
	{
		int evenCount = 0;
		boolean check = false;
		//checks every element if it is even or not.
		for(int i = 0; i<nums.size(); i++)
		{
			if(nums.get(i) % 2 ==0)
			{
				//increases the count if the element is even
				evenCount++;
			}
			
		}
		//checks to see if the count is the same as the how many elements there are
		if(evenCount == nums.size())
		{
			check = true;
		}
		return check;
		
	}
	
	/*
	 * This method is used to see if there are two fives in a row
	 * if there is it changed them to 0.
	 */
	public static void findConsecFives(ArrayList<Integer> nums)
	{
		for(int i = 0; i<nums.size()-1;i++)
		{
			//checks if there are two 5s next to each other in an Array List
			if(nums.get(i) == 5 && nums.get(i+1) == 5)
			{
				//changes the 5s to 0s
				nums.set(i, 0);
				nums.set(i+1, 0);
			}
		}
	}
	
	/*
	 * This method is used to find if there is three consecutive 
	 * numbers are the same
	 */
	public static boolean findThreeRow(ArrayList<Integer> nums)
	{
		boolean check = false;
		//checks if every number is the same as the next two to find 3 consecutive numbers
		for(int i = 0; i<nums.size()-2; i++)
		{
			if(nums.get(i) == nums.get(i+1) && nums.get(i) == nums.get(i+2))
			{
				check = true;
			}
		}
		return check;
	}
	
	/*
	 * This method is used to count how many of a certain 
	 * number is in an Array List
	 */
	public static int findNum(ArrayList<Integer> nums, int n)
	{
		int count = 0;
		//counts how many of the given number is in the Array List
		for(int i = 0; i<nums.size();i++)
		{
			if(nums.get(i) == n)
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
	public static void reverseArr(ArrayList<Integer> nums)
	{
		//how many times the loop needs to execute
		int half = nums.size()/2;
		//finds the index of the last number
		int lastIndex = nums.size()-1;
		for(int i = 0; i<half; i++)
		{
			//swaps the numbers 
			int temp = nums.get(lastIndex-i);
			nums.set(lastIndex - i, nums.get(i));
			nums.set(i, temp);
		}
	}
	/*
	 * This method is used to move every number in 
	 * the Array List one space to the right.
	 */
	public static void rightArr(ArrayList<Integer> nums)
	{
		for(int i = nums.size()-1; i > 0; i--)
		{		
			//swaps the numbers to the right
			nums.set(i, nums.set(i-1, nums.get(i)));

			
		}
	}
	
	/*
	 * This method is for the selection sort Array List. It goes
	 * through all the numbers in the Array List and finds the 
	 * smallest and puts it in the front, then finds the 
	 * second smallest and puts it after and so on, and so on.
	 */
	public static void selectionSortArr(ArrayList<Integer> nums)
	{
		//variable used to keep the index of the smallest number
		int minIndex = 0;
		//goes through each number in the Array List
		for(int i = 0; i < nums.size(); i++)
		{
			minIndex = i;
			//Separates the Array List into a sorted and not sorted areas
			for(int j = i; j<nums.size(); j++)
			{
				if(nums.get(j) < nums.get(minIndex))
				{
					//finds the min in the unsorted Array List
					minIndex = j;							
				}
			}
			//swaps smaller number into place in the unsorted Array List
			int temp = nums.get(minIndex);
			nums.set(minIndex, nums.get(i));
			nums.set(i, temp);
		}
	}
		
		

}
