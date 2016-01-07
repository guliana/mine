package sk.ima.mineSweeperField;

import java.util.Random;

public class MineSweeperField {

	private  int columnCount = 9;
	private int rowCount = 9;
	private int minesCount = 10;
	public Tiles [][] tiles = new Tiles [rowCount][columnCount];

	static MineField mine = new MineField();
	
	public void generateMineSweeperField() {
		generateMines();
		insertNumbers();
			}

	private void insertNumbers() {
		
			}

	private void generateMines() {
		Random random = new Random();
		
		int rowInField = random.nextInt(rowCount);
		int columnInField =random.nextInt(columnCount);
		int counter = 0;
			
		while(counter < minesCount) {
			if (tiles[rowInField][columnInField] == null) {
				tiles[rowInField][columnInField] = new Mine();
				counter++;
			}
		}
	
	}
	public Tiles [][] printGrid () {
		int i= mine.getRowCount();
		int j = mine.getColumnCount();
		
		for (int i1 = 0; i1 < i; i1++) {
			for (int j1 = 0; j1 < j; j1++) {
				
				System.out.print(tiles[i1][j1]);
			}
			System.out.println();	
			}
		return tiles;
			
	}
}


