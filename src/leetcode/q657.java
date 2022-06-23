package leetcode;

public class q657 {

	public boolean judgeCircle(String moves) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < moves.length(); i++) {
			if (moves.substring(i, i + 1).equals("U")) {
				y++;
			} else if (moves.substring(i, i + 1).equals("D")) {
				y--;
			} else if (moves.substring(i, i + 1).equals("R")) {
				x++;
			} else if (moves.substring(i, i + 1).equals("L")) {
				x--;
			}
		}
		return x == 0 && y == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
