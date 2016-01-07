package sk.ima.mineSweeperField;

public class Mine extends Tiles {
	private String mineMark;

	public Mine(String mineMark) {
		this.mineMark = "X";
	}
	 	
	public Mine() {
		}


	public String getMineMark() {
		return mineMark;
	}

	public void setMineMark(String mineMark) {
		this.mineMark = mineMark;
	}
	
}
