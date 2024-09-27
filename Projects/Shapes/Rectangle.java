/**
 * This is the code used in Main() to generate the Rectangles 
 * @author amberkanthack 
 */
public class Rectangle {
	//gives the needed variables to create stats for the rectangles
	private double length;
	private double width;
	private double height;
			
	/**
	 * Used to build a new rectangle
	 * Also used modify the private variables in Main()
	 */
	public Rectangle (double l, double w, double h)
	{			 
		length = l;
		width = w;
		height = h;
	}
		
	/**
	 * used if the sides of the rectangle are all the same
	 * I have a square class so this is kinda useless.
	 */
	public Rectangle(double s) 
	{
		length = s;
		width = s;
		height = s;
	}
	/**
	 * @return the shape I am creating
	 */
	public static String getShape() 
	{
		return " Rectangle \n-----------";
		//I spelled this wrong so many times...
	}
		
		/**
		 * @return the length, width, and height of the rectangle
		 */
	public String getNumbers()
	{
		//this makes it easier to place in a print statement
		return length +", "+ width+" and "+height;
	}
		
		/**
		 * @return the perimeter of the rectangle
		 */
	public double getPerimeter(double l, double w)
	{
		/* 
		 * I had to change the variables because it wouldn't work at first with l and w.
		 * That was my bad. Everything works now but, for future reference use the private variables to generate formula.
		 */			
		return 2*(length+width);
	}
		
	/**
	 * @return the area of the rectangle
	 */
	public double getArea(double l, double w)
	{
		return length*width;	
	}
		
	/**
	 * @return the Volume of the rectangle
	 */
	public double getVolume(double l, double w, double h)
	{
		return length*width*height;
	}
		
}
