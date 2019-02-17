package bfiller.chess.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bfiller.chess.PieceIdentifier;
import bfiller.chess.Placement;
import bfiller.chess.models.ChessPiece;
import bfiller.chess.models.Color;
import bfiller.chess.models.Location;
import bfiller.chess.models.Type;

public class FileParser {

	private static final Pattern DEFAULT_LOCATION = Pattern.compile("(?<pieceName>[prnbqkPRNBQK])(?<colorName>[ldLD])(?<CoordsX>[a-hA-H])(?<CoordsY>[1-8])");
	public final Map<String, Enum> types = new HashMap<String, Enum>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put("k", Type.KING);
			put("q", Type.QUEEN);
			put("b", Type.BISHOP);
			put("n", Type.KNIGHT);
			put("r", Type.ROOK);
			put("p", Type.PAWN);
			put("l", Color.WHITE);
			put("d", Color.BLACK);
		}
	};
	
	public void FileReading() {
		String placementPatt = "([rnbqkp])([ld])([a-h])([1-8])";
		String movementPatt = "[a-h][1-8] ?[a-h][1-8]";
		Pattern DEFAULT_LOCATION = Pattern.compile(placementPatt);
		Placement placement = new Placement();
		
		try {
			System.out.println("Input file");
			Scanner scan = new Scanner(System.in);
			BufferedReader reader = new BufferedReader(new FileReader(scan.nextLine()));
			String line = reader.readLine();
			String pieceName = null;
			List<ChessPiece> pieces = new ArrayList<>();
			
			while(line != null) {
				
				int column;
				int row;
				ChessPiece piece;
				Matcher m = DEFAULT_LOCATION.matcher(line);

				if(m.matches()) {
//					String[] input = line.split("");
//					if(input[1].equals("l")) {
//						color = "white";
//					}
//					if(input[1].equals("d")) {
//						color = "black";
//					}
//					
//					switch(input[0]) {
//						case "p":
//							pieceName = "pawn";
//							break;
//						case "r":
//							pieceName = "rook";
//							break;
//						case "n":
//							pieceName = "knight";
//							break;
//						case "b":
//							pieceName = "bishop";
//							break;
//						case "q":
//							pieceName = "queen";
//							break;
//						case "k":
//							pieceName = "king";
//							break;
//					}

					column = placement.getCoordinates().get(m.group(3).toUpperCase());
					row = placement.getCoordinates().get(m.group(4));
					Type type = (Type) types.get(m.group(1));
					Color color = (Color) types.get(m.group(2));
					Location location = new Location(column, row);
					ChessPiece chesspiece = PieceIdentifier.getPiece(type, color, location);
					placement.placement(chesspiece, location);
					System.out.println("places a " + chesspiece.getColor() + " " + chesspiece.getType() + " on " + m.group(3).toUpperCase() + m.group(4));
				}
				if(Pattern.matches(movementPatt, line)) {
					Pattern pattern = Pattern.compile("[a-h][1-8]");
					Matcher matcher = pattern.matcher(line);
					List<String> coordinates = new ArrayList<>();
					while(matcher.find()) {
						coordinates.add(matcher.group());
					}
					System.out.println("moves the piece from " + coordinates.get(0) + " to " + coordinates.get(1));
				}
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
