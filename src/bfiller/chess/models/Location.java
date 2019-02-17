package bfiller.chess.models;

public class Location {
	
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode()
	{
		String str = this.x + this.y + "";
		return Integer.parseInt(str);
	}

	@Override
	public boolean equals(Object o){
		Location loc = (Location)o;
		if(this.x == loc.x && this.y == loc.y){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public String toString(){
		return this.x +  ", " + this.y;
	}
	
}
