package leetcode;

public class q461 {

	public int hammingDistance(int x, int y) {
		int trans = x ^ y;
		String str = Integer.toBinaryString(trans);
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("1")) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
