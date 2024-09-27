/**
 * This is the code used in Main() to generate the Triangle 
 * @author amberkanthack 
 */
public class Triangle {
	//gives the needed variables to create stats for the rectangles
	private double base;
	private double height;
	private double sideOne;
	private double sideTwo;
	
	/**
	 * Used to build a new rectangle
	 * Also used modify the private variables in Main()
	 */
	public Triangle (double h, double b, double a, double c)
	{
		 base = b;
		 height = h;
		 sideTwo = c;
		 sideOne = a;
	}
	
	//functionality
	/**
	 * @return the shape I am creating
	 */
	public static String getShape() 
	{
		return " Triangle \n----------";
	}
	/**
	 * @return the height, base, and sides of the triangle
	 */
	public String getNumbers()
	{
		return height+", "+ base +", "+ sideOne+" and " +sideTwo;
	}
	
	/**
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter(double a, double b, double c)
	{
		return sideOne+base+sideTwo;
	}
	/**
	 * @return the area of the triangle
	 */
	public double getArea(double h, double b)
	{
		//
		return (height*base)/2;
	}
	
	
}
