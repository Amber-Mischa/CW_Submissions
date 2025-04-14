/**
 * This class is used to give the maze characteristics in the game
 * @author amberkanthack
 */
public class GameTile {
	private boolean hasPlayer;
	private boolean isRevealed;
	private boolean isWall;
	
	public GameTile()
	{
		hasPlayer = false;
		isRevealed = false;
		isWall = false;
	}

	/*
	 * This method gets the hasPlayer
	 */
	public boolean getIsHasPlayer() 
	{
		return hasPlayer;
	}

	/*
	 * This method gets the isRevealed
	 */
	public boolean getIsRevealed() 
	{
		return isRevealed;
	}

	/*
	 * This method gets the isWall
	 */
	public boolean getIsWall() 
	{
		return isWall;
	}

	/*
	 * This method sets the hasPlayer
	 */
	public void setHasPlayer(boolean hasPlayer) 
	{
		this.hasPlayer = hasPlayer;
	}

	/*
	 * This method sets the isRevealed
	 */
	public void setRevealed(boolean isRevealed) 
	{
		this.isRevealed = isRevealed;
	}

	/*
	 * This method sets the isWall
	 */
	public void setWall(boolean isWall) 
	{
		this.isWall = isWall;
	}
	
	/*
	 * This method prints the maze when called in Main
	 */
	public String toString() 
	{
		//checks if the player is there first
		if(hasPlayer == true)
		{
			return "-";
		}
		//checks if the tile is revealed
		else if(isRevealed == true)
		{
			//prints if it is a wall or not
			if(isWall == true)
			{
				return "X";
			}
			else
			{
				return "O";
			}
		}
		//if not revealed prints a '?' for unknown
		else 
		{
			return "?";
		}
	}
	
}
