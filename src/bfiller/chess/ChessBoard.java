package bfiller.chess;

import bfiller.chess.models.Location;

public class ChessBoard {
	
	private final int BOARD_SIZE = 8;
	String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
	
//	public void makeBoard() {
//		for(int i = 0; i < BOARD_SIZE; i++) {
//			for(int j = 0; j < BOARD_SIZE; j++) {
//				board[i][j] = "|  |";
//			}
//		}
//	}
	
	public void printBoard() {
		
		int boardNum = BOARD_SIZE;
		for(int i = 0; i < BOARD_SIZE; i++) {
			System.out.print(boardNum--);
			for(int j = 0; j < BOARD_SIZE; j++) {
//				System.out.print(board[i][j]);
				if(Placement.pieceContainer.containsKey(new Location(j, i))) {
					Location location = new Location(j, i);
					board[i][j] = "|" + Placement.pieceContainer.get(location).getDisplay() + "|";
				}
				else {
					board[i][j] = "|--|";
				}
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println("  A   B   C   D   E   F   G   H");
	}

}
