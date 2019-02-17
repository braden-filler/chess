package bfiller.chess.models;

public class Pawn extends ChessPiece {

	public Pawn(Color color, Type type, Location location) {
		super(color, type, location);
	}

	@Override
	public boolean validMove(int x, int y) {
		return false;
	}

}
