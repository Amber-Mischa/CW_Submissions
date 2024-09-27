/**
 * This is the code used in Main() to generate the Sphere 
 * @author amberkanthack 
 */
public class Sphere {
	//gives the needed variables to create stats for the rectangles
	private final double pi = 3.14;
	private double radius;
	
	/**
	 * Used to build a new rectangle
	 * Also used modify the private variables in Main()
	 */
	public Sphere (double r)
	{
		radius = r;
	}
	
	//functionality
	/**
	 * @return the shape I am creating
	 */
	public static String getShape() 
	{
		return " Sphere \n--------";
	}
	
	/**
	 * @return the radius of the Sphere
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * @return the diameter of the Sphere
	 */
	public double getDiameter(double r)
	{
		return radius+radius;
	}
	
	/**
	 * @return the volume of the Sphere
	 */
	public double getVolume(double r)
	{
		return (4.0/3.0*pi)*(radius*radius*radius);
	}
	
	/**
	 * @return the area of the Sphere
	 */
	public double getArea(double r)
	{
		return 4*pi*(radius*radius);
	}
	
}
