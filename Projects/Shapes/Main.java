/**
* The main class that is used to generates all the shapes for the Shapes project.
* Characteristics differ for each shape. Even the same type of shape (two of the same kind of shapes are different).
* All shapes are named after real people.
* @author amberkanthack 
*/

public class Main {
	
	public static void main(String[] args)
	{
		/*
		 * Sphere generator 
		 * characteristics are surface area, volume, radius, and diameter
		 * The sphere generator are given the radius of each sphere
		 */
		Sphere sphrOne = new Sphere(5.0);
		Sphere sphrTwo = new Sphere(2.0);
		Sphere sphrThree = new Sphere (4.0);
		
		//Tells what shape is being generated
		String shape = Sphere.getShape();
		System.out.println(shape);
		
		//Sphere 1's characteristics
		System.out.println("Sphere 1's name is Daniel");
		System.out.println("The radius of Daniel is "+sphrOne.getRadius());
		System.out.println("The diameter of Daniel is "+sphrOne.getDiameter(0));
		System.out.println("The volume of Daniel is "+sphrOne.getVolume(0));
		System.out.println("The surface Area of Daniel is "+sphrOne.getArea(0));
	
		//Sphere 2's characteristics
		System.out.println("\nSphere 2's name is Julia");
		System.out.println("The radius of Julia is "+sphrTwo.getRadius());
		System.out.println("The diameter of Julia is "+sphrTwo.getDiameter(0));
		System.out.println("The volume of Julia is "+sphrTwo.getVolume(0));
		System.out.println("The surface area of Julia is "+sphrTwo.getArea(0));
	
		//Sphere 3's characteristics
		System.out.println("\nSphere 3's name is Jayven");
		System.out.println("The radius of Jayven is "+sphrThree.getRadius());
		System.out.println("The diameter of Jayven is "+sphrThree.getDiameter(0));
		System.out.println("The volume of Jayven is "+sphrThree.getVolume(0));
		System.out.println("The surface area of Jayven is "+sphrThree.getArea(0));
		
	
		
		
		/*
		 * Rectangle generator 
		 * characteristics are area, volume, length, width, height, and perimeter.
		 * The generator are given the length, width, and height of each rectangle.
		 */
		Rectangle rectOne = new Rectangle(4.23, 1.23, 4.3);
		Rectangle rectTwo = new Rectangle(5.0, 3.2, 8.2);
		Rectangle rectThree = new Rectangle(2.3, 4.5, 2.4);
		Rectangle rectFour = new Rectangle(3);
		
		shape = Rectangle.getShape();
		System.out.println("\n"+shape);
		
		//rectangle 1's characteristics
		System.out.println("Rectangle 1's name is Javan");
		System.out.println("The length, width, and height of Javan are "+rectOne.getNumbers());
		System.out.println("The volume of Javanis "+rectOne.getVolume(0,0,0));
		System.out.println("The area of Javan is "+rectOne.getArea(0,0));
		System.out.println("The perimeter of Javan is "+rectOne.getPerimeter(0,0));
		
		//rectangle 2's characteristics
		System.out.println("\nRectangle 2's name is Belle");
		System.out.println("The length, width, and height of Belle are "+rectTwo.getNumbers());
		System.out.println("The volume of Belle is "+rectTwo.getVolume(0,0,0));
		System.out.println("The area of Belle is "+rectTwo.getArea(0,0));
		System.out.println("The perimeter of Belle is "+rectTwo.getPerimeter(0,0));
		
		//rectangle 3's characteristics
		System.out.println("\nRectangle 3's name is Jordan");
		System.out.println("The length, width, and height of Jordan are "+rectThree.getNumbers());
		System.out.println("The volume of Jordan is "+rectThree.getVolume(0,0,0));
		System.out.println("The area of Jordan is "+rectThree.getArea(0,0));
		System.out.println("The perimeter of Jordan is "+rectThree.getPerimeter(0,0));
		
		//rectangle 4's characteristics
		System.out.println("\nRectangle 4's name is Maka");
		System.out.println("The length, width, and height of Maka are "+rectFour.getNumbers());
		System.out.println("The volume of Maka is "+rectFour.getVolume(0,0,0));
		System.out.println("The area of Maka is "+rectFour.getArea(0,0));
		System.out.println("The perimeter of Maka is "+rectFour.getPerimeter(0,0));
		
		
		
		/*
		 * Kite generator 
		 * characteristics are sides, diagonals, area, and perimeter.
		 * The generator are given the two diagonals and sides of each kite.
		 * Kites are hard to do because there are so many variables.
		 */
		Kite kiteOne = new Kite(4.0, 3.25, 2.23, 4.43);
		Kite kiteTwo = new Kite(10.0, 12.23, 7.82, 2.00);
		Kite kiteThree = new Kite(2.7, 5.3, 12.3, 4.3);
		
		//Tells what shape is being generated
		shape = Kite.getShape();
		System.out.println("\n"+shape);
		
		//Kite 1's characteristics
		System.out.println("Kite 1's name is Ella");
		System.out.println("The two side lengths of Ella are "+kiteOne.getSides());
		System.out.println("The two diagonal lengths of Ella is "+kiteOne.getDiagonal());
		System.out.println("The area of Ella is "+kiteOne.getArea(0,0));
		System.out.println("The perimeter of Ella is "+kiteOne.getPerimeter(0,0));
	
		//the easier way apparently
		System.out.println("\n"+kiteOne.toString());
		
		//Kite 2's characteristics
		System.out.println("\nKite 2's name is Lyzelle");
		System.out.println("The two side lengths of Lyzelle are "+kiteTwo.getSides());
		System.out.println("The two diagonal lengths of Lyzelle is "+kiteTwo.getDiagonal());
		System.out.println("The area of Lyzelle is "+kiteTwo.getArea(0,0));
		System.out.println("The perimeter of Lyzelle is "+kiteTwo.getPerimeter(0,0));
		
		//Kite 3's characteristics
		System.out.println("\nKite 3's name is Cassidy");
		System.out.println("The two side lengths of Cassidy are "+kiteThree.getSides());
		System.out.println("The two diagonal lengths of Cassidy is "+kiteThree.getDiagonal());
		System.out.println("The area of Cassidy is "+kiteThree.getArea(0,0));
		System.out.println("The perimeter of Cassidy is "+kiteThree.getPerimeter(0,0));
		//why did I choose this shape????
		

		

		/*
		 * Square generator 
		 * characteristics are area, side and perimeter.
		 * The generator are given the sides of each Square.
		 */
		Square squarOne = new Square(3.12);
		Square squarTwo = new Square(2.45);
		Square squarThree = new Square(14.23);
		
		//Tells what shape is being generated
		shape = Square.getShape();
		System.out.println("\n"+shape);
		
		//Square 1's characteristics
		System.out.println("Square 1's name is Taylor");
		System.out.println("The sides of Taylor are "+squarOne.getSide());
		System.out.println("The area of Taylor is "+squarOne.getArea(0));
		System.out.println("The perimeter of Taylor is "+squarOne.getPerimeter(0));
		
		//Square 2's characteristics
		System.out.println("\nSquare 2's name is Victoria");
		System.out.println("The sides of Victoria are "+squarTwo.getSide());
		System.out.println("The area of Victoria is "+squarTwo.getArea(0));
		System.out.println("The perimeter of Victoria is "+squarTwo.getPerimeter(0));
		
		//Square 3's characteristics
		System.out.println("\nSquare 3's name is Liz");
		System.out.println("The sides of Liz are "+squarThree.getSide());
		System.out.println("The area of Liz is "+squarThree.getArea(0));
		System.out.println("The perimeter of Liz is "+squarThree.getPerimeter(0));
		
		//This is sooo tedious, why is this a thing...
		

		
		
		/*
		 * Triangle generator 
		 * characteristics are area, base, sides, height, and perimeter.
		 * The generator are given the base, sides height of each triangle.
		 */
		Triangle triOne = new Triangle(2.0, 4.2, 3.5, 6.3);
		Triangle triTwo = new Triangle(4.5, 3.4, 2.3, 1.2);
		Triangle triThree = new Triangle(23.4, 5.2, 9.3, 4.2);
		
		//Tells what shape is being generated
		shape = Triangle.getShape();
		System.out.println("\n"+shape);
		
		//triangle 1's characteristics
		System.out.println("Triangle 1's name is Alan");
		System.out.println("The height, base, and sides of Alan are "+triOne.getNumbers());
		System.out.println("The area of Alan is "+triOne.getArea(0,0));
		System.out.println("The perimeter of Alan is "+triOne.getPerimeter(0,0,0));
		
		//triangle 2's characteristics
		System.out.println("\nTriangle 2's name is Keola");
		System.out.println("The length, width, and height of Keola are "+triTwo.getNumbers());
		System.out.println("The area of Keola is "+triTwo.getArea(0,0));
		System.out.println("The perimeter of Keola is "+triTwo.getPerimeter(0,0,0));
		
		//triangle 3's characteristics
		System.out.println("\nTriangle 3's name is Cadee");
		System.out.println("The length, width, and height of Cadee are "+triThree.getNumbers());
		System.out.println("The area of Cadee is "+triThree.getArea(0,0));
		System.out.println("The perimeter of Cadee is "+triThree.getPerimeter(0,0,0));
	
		//it's done...finally...why is this a thing????
		//naming things is fun!!!
	}
}
