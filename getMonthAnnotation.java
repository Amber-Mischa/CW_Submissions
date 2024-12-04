/*
 * This method checks if the int is the same number as the loop's month.
 * Then it returns the month's name.
 */
 public static String getMonth(int n)
 {
	//The string contains all the months of the year to  
	String months = "January February March April May June "
		+ "July August September October November December ";
	//You should have used an array!	

	//repeats trying to find it for all the months.
	for (int i = 1; i <= 12; i++)
	{
		//Goes to the end of the month it is checking.
		int sL = months.indexOf(' ');

		//checks if int 'i' is the same as int 'n'
		if (n == i)
		{
			//returns the name of the month 
			return months.substring(0, sL);
		}
		//if int 'i' isn't the same as int 'n' then the code in this segment runs
		else
		{
			//removes the previous month in the string and goes back in the code.
			months = months.substring(sL + 1);
		}
	}
	//tells the user that the number given doesn't correlate with a month
	return "There isn't a month attached to that number!";
			
}
