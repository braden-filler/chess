package bfiller.chess;

import java.util.HashMap;
import java.util.Map;

import bfiller.chess.models.ChessPiece;
import bfiller.chess.models.Location;

public class Placement {

	public static Map<Location, ChessPiece> pieceContainer = new HashMap<>();
	public static Map<String, Integer> coordinates = new HashMap<String, Integer>() {
		{
			put("A", 0);
			put("B", 1);
			put("C", 2);
			put("D", 3);
			put("E", 4);
			put("F", 5);
			put("G", 6);
			put("H", 7);
			put("1", 7);
			put("2", 6);
			put("3", 5);
			put("4", 4);
			put("5", 3);
			put("6", 2);
			put("7", 1);
			put("8", 0);
		}

	};
	
	public void placement(ChessPiece piece, Location location) {
		if(pieceContainer.get(location) == null) {
			System.out.println("LOCATION: " + location);
			pieceContainer.put(location, piece);
		}
		else {
			System.out.println("THERE IS NOTHING");
		}
	}

	public static Map<String, Integer> getCoordinates() {
		return coordinates;
	}
	
	
	
//	public Placement() {
//		// TODO Auto-generated constructor stub
//	}
	

}
