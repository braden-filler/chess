package bfiller.chess;

import bfiller.chess.io.FileParser;

public class Driver {

	public static void main(String[] args) {
		FileParser parser = new FileParser();
		parser.FileReading();
		ChessBoard board = new ChessBoard();
		board.printBoard();
	}
}
