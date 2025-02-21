/**
 * This class is used for the problems in the ArrayList Intro 
 * assignment. It works with ArrayLists to change elements in 
 * different ways
 */
import java.util.ArrayList;
public class ArrayLists_Intro {

	public static void main(String[] args) {
		//task 1
		//empty general array list
		ArrayList arrList = new ArrayList();
	
		//task 2
		//empty Integer array list
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		//empty string array list
		ArrayList<String> stringArrList = new ArrayList<String>();

		//task 3
		//adds 1, 2, and 3 to the Integer array list
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		
		//adds names to the string array list
		stringArrList.add("Alice");
		stringArrList.add("Bob");
		stringArrList.add("Charlie");
		
		//task 4
		//adds 5 between 2 & 3
		intArrList.add(2, 5);
		//adds Derek before Bob and after Alice
		stringArrList.add(1, "Derek");
		
		//task 5
		//prints out the second and last element of the Integer array List
		System.out.print(intArrList.get(1) + " " + intArrList.get(3));
		//prints out the second and last element of the String array List
		System.out.println(stringArrList.get(1) + " " + stringArrList.get(3));

		//task 6
		//changes the first element in the Integer array list to 0
		System.out.println(intArrList.set(0, 0));
		System.out.println(intArrList.get(0));
		//changes the first element in the String array list to Zero
		System.out.println(stringArrList.set(0, "Zero"));
		System.out.println(stringArrList.get(0));
		
		//task 7
		//removes & prints out the last element in the String array
		System.out.println(intArrList.remove(3));
		//removes & prints out the last element in the String array
		System.out.println(stringArrList.remove(3));


	}

}
