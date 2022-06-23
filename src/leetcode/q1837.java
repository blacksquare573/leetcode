package leetcode;

public class q1837 {

	public int sumBase(int n, int k) {
		int result = 0;
		String str = Integer.toString(n, k);
		for (int i = 0; i < str.length(); i++) {
			result += Integer.parseInt(str.substring(i, i + 1));
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
