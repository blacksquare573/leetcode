package leetcode;

public class q1812 {

	public boolean squareIsWhite(String coordinates) {
		if ((coordinates.charAt(0) + Integer.parseInt(coordinates.substring(1))) % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
