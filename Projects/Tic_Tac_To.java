/**
 * This class is used for the game Tic-Tac-To.
 * It is a two player game that prints its own board.
 * The board self updates with every turn and prints again.
 * The class also checks for any wins or draws.
 * @author amberkanthack
 */
import java.util.Scanner;

public class Tic_Tac_To {

	//this is the board used for the game
	private static char[][] board = { 
			{' ', '|', ' ', '|', ' '},
			{'-', '|', '-', '|', '-'},
			{' ', '|', ' ', '|', ' '},
			{'-', '|', '-', '|', '-'},
			{' ', '|', ' ', '|', ' '}		
	};
	//This is the scanner for the players to input answers
	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		//prints a blank board
		printBoard();
		//starts the game
		player1Turn();
		
	
		
	}
	/*
	 * This method is used for player one's(X) turn. 
	 * It gets the row and column, checks if the spot 
	 * if available, changes that spot if it is prints 
	 * the new board, checks for wins after, and then 
	 * goes onto the next player's turn.  
	 */
	public static void player1Turn()
	{		
		//asks the player's choices and stores them to use later
		System.out.println("Player 1 turn!");

		System.out.println("What row?(please enter 0, 2, or 4)");
		//stores the player's row answer
		int playerOneRow = Integer.parseInt(userInput.nextLine());
		
		System.out.println("What column?(please enter 0, 2, or 4)");
		//stores the player's column answer
		int playerOneColumn = Integer.parseInt(userInput.nextLine());
		
		//Checks that the player inputed a valid row
		if(playerOneRow == 0 || playerOneRow == 2 ||playerOneRow == 4)
		{
			//Checks that the player inputed a valid column
			if(playerOneColumn == 0 || playerOneColumn == 2 ||playerOneColumn == 4)
			{
				//Checks if the spot they chose is available
				if(board[playerOneRow][playerOneColumn] == 'X' || board[playerOneRow][playerOneColumn] == 'O')
				{
					//makes the player pick another place if the spot is taken
					System.out.println("Please pick another place.");
					player1Turn();
				}
				else
				{
					//places the X on the board
					board[playerOneRow][playerOneColumn] = 'X';

				}
			}
			else
			{
				//if the column isn't valid it makes them pick another one
				System.out.println("That isn't an option!");
				player1Turn();
			}
		}
		else
		{
			//if the row isn't valid it makes them pick another one
			System.out.println("That can't be right!");
			player1Turn();
		}
		//prints the new board
		printBoard();
		//checks for wins
		if(winCheck() == false)
		{
			//checks to see if the board is filled
			if(tieCheck() <9)
			{
				player2Turn();
				
			}
			else
			{
				System.out.println("It's a tie! Nobody wins.");
			}

		}
		


	}
	
	/*
	 * This method is the same as the one on top but it is used for player two(O)
	 */
	public static void player2Turn()
	{
		//asks the player's choices and stores them to use later
		System.out.println("Player 2 turn!");
		System.out.println("What row?(please enter 0, 2, or 4)");
		//stores the player's row answer
		int playerTwoRow = Integer.parseInt(userInput.nextLine());
		
		System.out.println("What column?(please enter 0, 2, or 4)");
		//stores the player's column answer
		int playerTwoColumn = Integer.parseInt(userInput.nextLine());
		
		//Checks that the player inputed a valid row
		if(playerTwoRow == 0 || playerTwoRow == 2 ||playerTwoRow == 4)
		{
			//Checks that the player inputed a valid column
			if(playerTwoColumn == 0 || playerTwoColumn == 2 ||playerTwoColumn == 4)
			{
				//Checks if the spot they chose is available
				if(board[playerTwoRow][playerTwoColumn] == 'X' || board[playerTwoRow][playerTwoColumn] == 'O')
				{
					//makes the player pick another place if the spot is taken
					System.out.println("Please pick another place.");
					player2Turn();
				}
				else
				{
					//places the O on the board
					board[playerTwoRow][playerTwoColumn] = 'O';
				}
			}
			else
			{
				//if the column isn't valid it makes them pick another one
				System.out.println("That isn't an option!");
				player2Turn();
			}
		}
		else
		{
			//if the row isn't valid it makes them pick another one
			System.out.println("That can't be right!");
			player2Turn();
		}
		//prints the new board
		printBoard();
		//checks for wins
		if(winCheck() == false)
		{
			//checks if the board is filled, if not it goes onto the next turn
			if(tieCheck() <9)
			{
				player1Turn();
			}
			else
			{
				System.out.println("It's a tie! Nobody wins.");
			}

		}
		



	}
	
	/*
	 * This method prints the game board
	 */
	public static void printBoard()
	{
		//prints the boards in row major order
		for(int i = 0; i<board.length; i++)
		{
			for(int j = 0; j<board[0].length; j++)
			{
				System.out.print(board[i][j] + " ");

			}
			System.out.print(" \n");

					
		}
		

	}
	
	/*
	 * This method checks if there is a win on the board
	 */
	public static boolean winCheck()
	{
		boolean win = false;
		//This checks each row for a win
		for(int i = 0; i<board.length; i++)
		{	
			//Checks for Xs
			if(board[i][0] == 'X' && board[i][2] == 'X' && board[i][4] == 'X' )
			{
				win = true;
				System.out.println("Player 1 wins!");
			}
			//checks for Os
			else if(board[i][0] == 'O' && board[i][2] == 'O' && board[i][4] == 'O' )
			{
				win = true;
				System.out.println("Player 2 wins!");

			}
			
				
		}
		
		//Checks for if diagonals are possible for X
		if(board[2][2] == 'X')
		{
			//checks one way
			if(board[0][0] == 'X' && board[4][4] == 'X')
			{
				win = true;
				System.out.println("Player 1 wins!");
			}
			//checks the other way
			if(board[4][0] == 'X' && board[0][4] == 'X')
			{
				win = true;
				System.out.println("Player 1 wins!");
			}

		}
		//Checks for if diagonals are possible for O
		else if(board[2][2] == 'O')
		{
			if(board[0][0] == 'O' && board[4][4] == 'O')
			{
				win = true;
				System.out.println("Player 2 wins!");
			}
			if(board[4][0] == 'O' && board[0][4] == 'O')
			{
				win = true;
				System.out.println("Player 2 wins!");
			}

		}
		
		//This check each column for a win
		for(int i = 0; i<board.length; i++)
		{	
			//checks for Xs
			if(board[0][i] == 'X' && board[2][i] == 'X' && board[4][i] == 'X' )
			{
				win = true;
				System.out.println("Player 1 wins!");
			}
			//checks for Os
			else if(board[0][i] == 'O' && board[2][i] == 'O' && board[4][i] == 'O' )
			{
				win = true;
				System.out.println("Player 2 wins!");

			}
			
				
		}
		return win;
	}
	
	/*
	 * This method checks how many spaces is filled
	 */
	public static int tieCheck()
	{
		int count = 0;
		for(int i = 0; i<board.length; i++)
		{
			for(int j = 0; j<board[0].length;)
			{
				//checks if the space is filled
				if(board[i][j] == 'X' || board[i][j] == 'O') 
				{
					count++;
				}
				//skips the spacing column
				j = j+2;
			}
		}
		return count;
	}
		
	
}
