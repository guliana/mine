package sk.ima.mineSweeperField;

public class Clues extends Tiles {

	private int numberOfTile;

	public Clues(int numberOfTile) {
		this.numberOfTile = numberOfTile;
	}

	public int getNumberOfTile() {
		return numberOfTile;
	}

	public void setNumberOfTile(int numberOfTile) {
		this.numberOfTile = numberOfTile;
	}
}
