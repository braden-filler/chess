package bfiller.chess;

import bfiller.chess.models.Bishop;
import bfiller.chess.models.ChessPiece;
import bfiller.chess.models.Color;
import bfiller.chess.models.King;
import bfiller.chess.models.Knight;
import bfiller.chess.models.Location;
import bfiller.chess.models.Pawn;
import bfiller.chess.models.Queen;
import bfiller.chess.models.Rook;
import bfiller.chess.models.Type;

public class PieceIdentifier {

	public static ChessPiece getPiece(Type pieceName, Color pieceColor, Location location){
		
		if(pieceName.equals(Type.PAWN)){
			return new Pawn(pieceColor, pieceName, location);
		}
		else if(pieceName.equals(Type.KING)){
			return new King(pieceColor, pieceName, location);
		}
		else if(pieceName.equals(Type.QUEEN)){
			return new Queen(pieceColor, pieceName, location);
		}
		else if(pieceName.equals(Type.BISHOP)){
			return new Bishop(pieceColor, pieceName, location);
		}
		else if(pieceName.equals(Type.ROOK)){
			return new Rook(pieceColor, pieceName, location);
		}
		else if(pieceName.equals(Type.KNIGHT)){
			return new Knight(pieceColor, pieceName, location);
		}
		return null;
	}

}
