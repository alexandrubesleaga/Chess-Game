package Objects;

import java.awt.Point;
import java.util.ArrayList;

// a set of functions that help determine the next moves on a specific
// board
//
// PAY ATTENTION TO THE FOLLOWING: 
//		- a piece can't move if, after it has moved, the king is under attack
//		- a pawn can move to the left or to the right if it attacks
//		- try to use direction vectors for the knight and king
//		- check if king can castle ( it hasn't moved, it isn't under attack and
//				no peace controls any square on it's path )
//		- 

public class helper {
	
	public static ArrayList<move> getPawnMoves( board b, Point pos ) {
		
		return new ArrayList<move>();
	}
	
	public static ArrayList<move> getRookMoves( board b, Point pos ) {
		
		return new ArrayList<move>();
	}
	
	public static ArrayList<move> getKnightMoves( board b, Point pos ) {
		
		return new ArrayList<move>();
	}
	
	public static ArrayList<move> getBishopMoves( board b, Point pos ) {
		
		return new ArrayList<move>();
	}
	
	public static ArrayList<move> getQueenMoves( board b, Point pos ) {
		
		return new ArrayList<move>();
	}
	
	public static ArrayList<move> getKingMoves( board b, Point pos) {
		
		return new ArrayList<move>();
	}
}