/**
 * This class is used for all the logic for the Invisible Maze game.
 * It generates the maze, moves the player, and checks if they 
 * finished the maze.
 * @author amberkanthack
 */
import java.util.Scanner;

public class Main {

	//scanner used throughout the class
	public static Scanner userInput = new Scanner(System.in);
	//Player object used in the class
	public static Player player = new Player();
	//GameTile object array used for the maze in the class
	public static GameTile[][] maze = new GameTile[5][5];

	public static void main(String[] args) {
		//makes the maze
		makeMaze();
		//Introduces the game mechanics
		System.out.print("""
				Welcome Player to the Invisible Maze! You will have to navigate through the maze without 
				knowing where a wall is. If you run into a wall an X will appear, if you don't run into 
				a wall an O will appear. Your goal is to make it to the end of the maze. 
				""");
		//starts the game
		movePlayer();

	}
	
	/*
	 * This method makes the maze, it makes all the game tiles 
	 * and sets all the walls and the player's starting position
	 */
	public static void makeMaze()
	{
		//makes the maze
		for(int i =0; i<maze.length; i++)
		{
			for(int j =0; j<maze[0].length; j++)
			{
				maze[i][j] = new GameTile();
			}
		}
		//sets the player's position
		maze[0][0].setHasPlayer(true);
		//sets all the walls
		maze[0][1].setWall(true);
		maze[0][3].setWall(true);
		maze[0][4].setWall(true);	
		maze[1][4].setWall(true);
		maze[2][0].setWall(true);
		maze[2][2].setWall(true);
		maze[2][3].setWall(true);
		maze[2][4].setWall(true);
		maze[3][4].setWall(true);
		maze[4][1].setWall(true);
		maze[4][2].setWall(true);
		
	}
	
	/*
	 * This method is used to run everything in the game
	 * It moves the player, checks if the moves are valid, 
	 * and checks if they reach the end.
	 */
	public static void movePlayer()
	{
		//prints the current maze
		printMaze();
		//asks the player's move
		System.out.println("Would you like to move up, down, left, or right?");
		//stores the player's move
		String choice = userInput.nextLine();
		
		//checks what choice it is		
		if(choice.equalsIgnoreCase("down"))
		{
			//checks if it is inbounds
			if(player.getRowPos()<4)
			{
				//checks if there is a wall
				if(maze[player.getRowPos()+1][player.getColPos()].getIsWall() == false)
				{
					//moves the player down
					maze[player.getRowPos()][player.getColPos()].setHasPlayer(false);
					maze[player.getRowPos()][player.getColPos()].setRevealed(true);
					player.setR(player.getRowPos()+1);
					maze[player.getRowPos()][player.getColPos()].setHasPlayer(true);
					maze[player.getRowPos()][player.getColPos()].setRevealed(true);

					//checks if the player won
					if(checkWin() == true)
					{
						//win message 
						System.out.println("You reached the end!");
						printMaze();
					}
					else
					{
						//continues if not finished
						movePlayer();
						
					}
				}
				else
				{
					
					System.out.println("There is a wall, cannot move down. Please pick another position.");
					//reveals the wall
					maze[player.getRowPos()+1][player.getColPos()].setRevealed(true);
					//makes them choose again
					movePlayer();
				}
			}
			else
			{
				//makes them pick again
				System.out.println("Cannot move down. Please pick another position.");
				movePlayer();
			}		
		}
		else if(choice.equalsIgnoreCase("up"))
		{
			//checks if it is inbounds
			if(player.getRowPos()>0)
			{
				//checks if there is a wall first
				if(!maze[player.getRowPos()-1][player.getColPos()].getIsWall())
				{
					//moves the player up
					maze[player.getRowPos()][player.getColPos()].setHasPlayer(false);
					player.setR(player.getRowPos()-1);
					maze[player.getRowPos()][player.getColPos()].setHasPlayer(true);
					maze[player.getRowPos()][player.getColPos()].setRevealed(true);
				
					//checks if the player finished the maze
					if(checkWin() == true)
					{
						//win message 
						System.out.println("You reached the end!");
						printMaze();
					}
					else
					{
						//contiues the maze
						movePlayer();
						
					}
				}
				else
				{
					System.out.println("There is a wall, cannot move down. Please pick another position.");
					//reveals the wall
					maze[player.getRowPos()-1][player.getColPos()].setRevealed(true);
					//makes them choose again
					movePlayer();
				}

			}
			else
			{
				//makes them pick another directoin
				System.out.println("Cannot move up. Please pick another position.");
				movePlayer();
			}

		}
		else if(choice.equalsIgnoreCase("left"))
		{
			//checks if it is inbounds
			if(player.getColPos()>0)
			{
				//checks if there is a wall
				if(maze[player.getRowPos()][player.getColPos()-1].getIsWall() == false)
				{
					//moves the player left
					maze[player.getRowPos()][player.getColPos()].setHasPlayer(false);
					player.setC(player.getColPos()-1);
					maze[player.getRowPos()][player.getColPos()].setHasPlayer(true);
					maze[player.getRowPos()][player.getColPos()].setRevealed(true);
					//checks if the player finished the maze
					if(checkWin() == true)
					{
						//win message if finished
						System.out.println("You reached the end!");
						printMaze();
					}
					else
					{
						//loops if not completed
						movePlayer();
						
					}
				}
				else
				{
					System.out.println("There is a wall, cannot move down. Please pick another position.");
					//reveals the wall
					maze[player.getRowPos()][player.getColPos()-1].setRevealed(true);
					//next move
					movePlayer();
				}


			}
			else
			{
				//makes them pick another direction
				System.out.println("Cannot move left. Please pick another position.");
				movePlayer();
			}

		}
		else if(choice.equalsIgnoreCase("right"))
		{
			//checks if it is inbounds
			if(player.getColPos()<4)
			{
				//checks if there is a wall
				if(maze[player.getRowPos()][player.getColPos()+1].getIsWall() == false)
				{
					//moves the player right
					maze[player.getRowPos()][player.getColPos()].setHasPlayer(false);
					player.setC(player.getColPos()+1);
					maze[player.getRowPos()][player.getColPos()].setHasPlayer(true);
					maze[player.getRowPos()][player.getColPos()].setRevealed(true);
					//checks if the player finished the maze
					if(checkWin() == true)
					{
						//win message 
						System.out.println("You reached the end!");
						printMaze();
					}
					else
					{
						//loops if not completed
						movePlayer();
						
					}
				}
				else
				{
					System.out.println("There is a wall, cannot move right. Please pick another position.");
					//reveals the wall
					maze[player.getRowPos()][player.getColPos()+1].setRevealed(true);
					//next move
					movePlayer();
				}

			}
			else
			{
				//makes them pick a valid direction(they reached the end of the maze
				System.out.println("Cannot move right. Please pick another position.");
				movePlayer();
			}

		}
		else
		{
			//makes sure they pick a direction
			System.out.println("Please pick up, down, left, or right.");
			movePlayer();
		}
		
	
	}
	
	/*
	 * This method is used to see if the player has reached the end of the maze
	 */
	public static boolean checkWin()
	{
		//checks where the player is
		if(player.getRowPos() == 4 && player.getColPos() == 4)
		{
			//ends the game if they are at the end
			return true;
		}
		else
		{
			//continues game
			return false;
		}
	}
	
	/*
	 * This method is used to print the maze
	 */
	public static void printMaze()
	{
		//prints the 2D array for the maze
		for(int i =0; i<maze.length; i++)
		{
			for(int j =0; j<maze[0].length; j++)
			{
				//makes all the columns in the row
				System.out.print("[" + maze[i][j].toString() + "]");
			}
			//makes a new row
			System.out.println(" ");
		}
	}
	
}
