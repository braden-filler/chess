package bfiller.chess.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileParser {

	public void FileReading() {
		try {
			System.out.println("Input file");
			Scanner scan = new Scanner(System.in);
			BufferedReader reader = new BufferedReader(new FileReader(scan.nextLine()));
			String line = reader.readLine();
			String pieceName = null;
			String color = null;
			while(line != null) {
				String[] input = line.split("");
				if(input[1].equals("l")) {
					color = "white";
				}
				if(input[1].equals("d")) {
					color = "black";
				}
				
				switch(input[0]) {
					case "p":
						pieceName = "pawn";
						break;
					case "r":
						pieceName = "rook";
						break;
					case "n":
						pieceName = "knight";
						break;
					case "b":
						pieceName = "bishop";
						break;
					case "q":
						pieceName = "queen";
						break;
					case "k":
						pieceName = "king";
						break;
				}
				System.out.println("places a " + color + " " + pieceName + " on " + input[2] + input[3]);
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
