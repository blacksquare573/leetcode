package leetcode;

public class q191 {

	public int hammingWeight(int n) {
		String binary = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.substring(i, i + 1).equals("1")) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
