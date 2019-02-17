package bfiller.chess.models;

public enum Type {

	PAWN{
		public String toString() {
			return "Pawn";
		}
	},
	ROOK{
		public String toString() {
			return "Rook";
		}
	},
	KNIGHT{
		public String toString() {
			return "Knight";
		}
	},
	BISHOP{
		public String toString() {
			return "Bishop";
		}
	},
	QUEEN{
		public String toString() {
			return "Queen";
		}
	},
	KING{
		public String toString() {
			return "King";
		}
	}
}
