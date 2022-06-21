package leetcode;

public class q1614 {

	public int maxDepth(String s) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("(")) {
				count++;
			} else if (s.substring(i, i + 1).equals(")")) {
				count--;
			}
			if (count > max) {
				max = count;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
