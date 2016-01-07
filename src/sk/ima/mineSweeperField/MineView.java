package sk.ima.mineSweeperField;
import java.util.Arrays;
import java.util.Scanner;


public class MineView {
static MineField mine = new MineField();
static MineSweeperField jmgh = new MineSweeperField();

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
				
			System.out.println("Insert count of rows");
			int rowCount = sc.nextInt();
		
			System.out.println("Insert count of columns");
			int columnCount = sc.nextInt();
	
			System.out.println("Insert count fo mines");
			int minesCount = sc.nextInt();
		
	
		System.out.println("");	
		
		System.out.println(jmgh.printGrid().toString());
		System.out.println("Please enter your selection <X> EXIT, <MA1> MARK, <OA1> OPEN :");

		String input = sc.nextLine();

		switch (input) {
		case "X":
			System.exit(0);
			break;

		}
	}


}
