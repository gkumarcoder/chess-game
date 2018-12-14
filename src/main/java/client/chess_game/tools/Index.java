package client.chess_game.tools;

/**
 * @author Gaurav Kumar
 * @since 14/11/2009
 * <br>
 * Info: A very simple but useful data type. It has attributes
 * 		 x&y which can represent a coordinate.
 */
public class Index {

	//global variables
	private int x, y;
	
	/**
	 * Constructor.
	 * @param x
	 * @param y
	 */
	public Index(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Get value of x.
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Get value of y.
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Set value for x.
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Set value of y.
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
}
