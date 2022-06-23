package leetcode;

public class q338 {

	public int[] countBits(int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i < result.length; i++) {
			int count = 0;
			String binary = Integer.toBinaryString(i);
			for (int j = 0; j < binary.length(); j++) {
				if (binary.substring(j, j + 1).equals("1")) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
