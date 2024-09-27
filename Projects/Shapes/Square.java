/**
 * This is the code used in Main() to generate the Square 
 * @author amberkanthack 
 */
public class Square {
	//gives the needed variable to create stats for the squares 
	private double side;
	
	/**
	 * Used to build a new rectangle
	 * Also used modify the private variables in Main()
	 */
	public Square (double s)
	{
		side = s;
	}
	
	//functionality
	/**
	 * @return the shape I am creating
	 */
	public static String getShape() 
	{
		return " Square \n--------";
	}
	/**
	 * @return the length, width, and height of the Square
	 */
	public double getSide()
	{
		return side;
	}
	
	/**
	 * @return the perimeter of the Square
	 */
	public double getPerimeter(double s)
	{
		return 4*side;
	}
	/**
	 * @return the area of the Square
	 */
	public double getArea(double s)
	{
		return side*side;
	}
	/**
	 * @return the Volume of the Square
	 * in case I want to put volume...I don't currently have it in Main().
	 */
	public double getVolume(double s)
	{
		return side*side*side;
	}
	
}
