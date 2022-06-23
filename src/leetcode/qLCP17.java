package leetcode;

public class qLCP17 {

	public int calculate(String s) {
		int x = 1;
		int y = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("A")) {
				x = 2 * x + y;
			} else if (s.substring(i, i + 1).equals("B")) {
				y = 2 * y + x;
			}
		}
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
