/**
 * This class is used to keep the position of the player.
 * @author amberkanthack
 */
public class Player {
	int rPos;
	int cPos;
	
	public Player()
	{
		rPos = 0;
		cPos = 0;
	}

	/*
	 * This gets the row position of the player
	 */
	public int getRowPos() 
	{
		return rPos;
	}
	
	/*
	 * This gets the column position of the player
	 */
	public int getColPos() 
	{
		return cPos;
	}
	

	/*
	 * This sets the row position of the player
	 */
	public void setR(int row) 
	{
		rPos = row;
	}

	/*
	 * This sets the column position of the player
	 */
	public void setC(int col) 
	{
		cPos = col;
	}
	
	
}
