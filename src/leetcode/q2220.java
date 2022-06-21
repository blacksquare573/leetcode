package leetcode;

public class q2220 {

	public static int minBitFlips(int start, int goal) {
		String st = "" + Integer.toBinaryString(start);
		String go = "" + Integer.toBinaryString(goal);
		while (st.length() != go.length()) {
			if (st.length() > go.length()) {
				go = "0" + go;
			} else {
				st = "0" + st;
			}
		}
		int count = st.length();
		for (int i = 0; i < st.length(); i++) {
			if (st.substring(i, i + 1).equals(go.substring(i, i + 1))) {
				count--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int start = 100;
		int goal = 0;
		System.out.println(minBitFlips(start, goal));

	}

}
