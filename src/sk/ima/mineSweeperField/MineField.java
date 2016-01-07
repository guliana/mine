package sk.ima.mineSweeperField;

import java.util.Scanner;

public class MineField {
	
	private int columnCount;
	private int rowCount;
	private int minesCount;
	
	
	public MineField(int columnCount, int rowCount, int minesCount) {
		this.columnCount = columnCount;
		this.rowCount = rowCount;
		this.minesCount = minesCount;
		}

	public MineField() {
			}
	
	public int getColumnCount() {
		return columnCount;
	}

	public int getRowCount() {
		return rowCount;
	}

	public int getMinesCount() {
		return minesCount;
	}
	}
/*
	Scanner sc = new Scanner (System.in);
	
	public void getRowNumber() {
		System.out.println("Insert count of rows");
		rowCount = sc.nextInt();
	}
	
	public void getColumnNumber () {
		System.out.println("Insert count of columns");
		columnCount = sc.nextInt();
	}
	 
	public void getMinesNumber () {
		System.out.println("Insert count fo mines");
		minesCount = sc.nextInt();
	}
}*/
