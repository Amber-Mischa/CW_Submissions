/**
 * This is the code used in Main() to generate the Kites 
 * @author amberkanthack 
 */
public class Kite {
	//gives the needed variables to create stats for the rectangles
	private double diagonalOne;
	private double diagonalTwo;
	private double shortSide;
	private double longSide;
	
	/**
	 * Used to build a new rectangle
	 * Also used modify the private variables in Main()
	 */
	public Kite (double p, double q, double a, double b)
	{
		 diagonalOne = p;
		 diagonalTwo = q;
		 longSide = a;
		 shortSide = b;
	}
	
	//functionality
	/**
	 * @return the shape I am creating
	 */
	public static String getShape() 
	{
		return " Kite \n------";
	}
	

	/**
	 * @return diagonal one's number
	 */
	public double getDiagonalOne() 
	{
		return diagonalOne;
	}

	
	/**
	 * @return diagonal two's number
	 */
	public double getDiagonalTwo() 
	{
		return diagonalTwo;
	}

	
	/**
	 * @return the shorter side's number
	 */
	public double getShortSide() 
	{
		return shortSide;
	}

	/**
	 * @return the longer diagonal's number
	 */
	public double getLongSide() 
	{
		return longSide;
	}

	
	/**
	 * lets you change diagonalOne's value
	 */
	public void setDiagonalOne(double diagonalOne) {
		this.diagonalOne = diagonalOne;
	}

	
	/**
	 * lets you change diagonalTwo's value
	 */
	public void setDiagonalTwo(double diagonalTwo) {
		this.diagonalTwo = diagonalTwo;
	}

	
	/**
	 * lets you change shortSide's value
	 */
	public void setShortSide(double shortSide) {
		this.shortSide = shortSide;
	}

	/**
	 * lets you change longSide's value
	 */
	public void setLongSide(double longSide)
	{
		this.longSide = longSide;
	}

	/**
	 * @return the side lengths
	 */
	public String getSides()
	{
		return getShortSide()+" and "+ getLongSide();
	}
	/**
	 * @return the diagonals lengths
	 */
	public String getDiagonal()
	{
		return getDiagonalOne()+" and "+ getDiagonalTwo();
	}
	
	/**
	 * @return the Kite's perimeter
	 */
	public double getPerimeter(double a, double b)
	{
		return 2*(longSide+shortSide);
	}

	/**
	 * @return the Kite's area
	 */
	public double getArea(double p, double q)
	{
		return (diagonalOne*diagonalTwo)/2;
	}
	
	/**
	 * @return all the kite's stats in one String method
	 */
	public String toString() 
	{
		return "This is a kite with sides of " +getSides()+
				" and diagnols of " +getDiagonal()+
				" and an area of "+getArea(0,0)+
				" and a perimeter of "+getPerimeter(0,0);
	}
	
}
