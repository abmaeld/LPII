public class Entity {

	private char grapheme;
	private Position position;

	public Entity(char grapheme) {

		this.grapheme = grapheme;
		this.position = new Position();

	}

	public void setGrapheme(char grapheme) {

		this.grapheme = grapheme;

	}

	public char getGrapheme() {

		return grapheme;

	}

	public void setPosition(int x, int y) {

		this.position.x = x;
		this.position.y = y;

	}

	public Position getPosition() {

		return this.position;

	}

}
