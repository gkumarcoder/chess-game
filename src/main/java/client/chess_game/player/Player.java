package client.chess_game.player;

import client.chess_game.general.Piece;

/**
 * @author Gaurav Kumar
 * @since 14/11/2009
 */
public class Player {

	//global variables
	private int side; //white 0, black 1

	/**
	 * Default constructor.
	 */
	public Player() {
		
	}
	
	/**
	 * Constructor which allows to set side.
	 * @param side
	 */
	public Player(int side) {
		setSide(side);
		
	}
	
	/**
	 * Get side. Black or white.
	 * @return side
	 */
	public int getSide() {
		return side;
	}

	/**
	 * Set side. Black or white.
	 * @param side
	 */
	public void setSide(int side) {
		this.side = side;
	}
	
	/**
	 * Get enemy side.
	 * @return int
	 */
	public int getEnemySide() {
		if (getSide()==0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * Find out if piece is owned by player.
	 * @param piece
	 * @return boolean
	 */
	public boolean isOwnPiece(Piece piece) {
		if (piece.getColor() == getSide()) {
			return true;
		} else {
			return false;
		}
	}
	
}
