/**
 * holds the methods to generate a circle
 * @author amberkanthack
 */
public class Circle {
	//data attributes
	private final double pi = 3.14;
	private double radius;
	
	
	//constructor
	public Circle (double r)
	{
		//Circle(double r) is the signature
		radius = r;
	}
	
	
	//functionality
	
	/**
	 * changes the attributes of
	 */
	public void setRadius(double r) 
	{
		radius = r;
	}
	
	
	/**
	 * @return the shape I am creating
	 */
	public static String declareShape() 
	{
		return "This shape is a circle";
	}
	
	
	/**
	 * @return how a circle works
	 */
	public static String tellHowCircleWorks() 
	{
		return "Hello Amber, a circle is made by ensuring all created points are a radius length away from a set point.";
	}
	
	
	/**
	 * @return the radius of the circle
	 */
	public double getRadius()
	{
		//static means it doesn't depend on a specific object
		return radius;
	}
		

	
	/**
	 * @return the diameter of the circle
	 */	
	public double getDiameter(double r)
	{
		return radius+radius;
	}
	
	
	
	/**
	 * @return the Circumference of the circle
	 */
	public double getCircumference(double r)
	{
		return 2*pi*radius;
	}
	
	
	/**
	 * @return the surface area of the circle
	 */
	public double getArea(double r)
	{
		return pi*(radius*radius);
	}
	
	
}
