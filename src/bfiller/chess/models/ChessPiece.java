package bfiller.chess.models;

public abstract class ChessPiece {

	private String display;
	private Color color;
	private Type type;
	private Location location;
	
	public ChessPiece(Color color, Type type, Location location) {
		this.color = color;
		this.type = type;
		this.location = location;
		if(type.equals(Type.KNIGHT)) {
			this.display = type.toString().toUpperCase().charAt(1) + "" + color.toString().charAt(0);
			
		}
		else {
			this.display = type.toString().charAt(0) + "" + color.toString().charAt(0);
		}
		System.out.println("DISPLAY: " + display);
	}
	
	public String getDisplay() {
		return display;
	}
	
	public abstract boolean validMove(int x, int y);

	public Color getColor() {
		return color;
	}

	public Type getType() {
		return type;
	}

	public Location getLocation() {
		return location;
	}

	
}
