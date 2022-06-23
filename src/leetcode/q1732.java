package leetcode;

public class q1732 {

	public int largestAltitude(int[] gain) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < gain.length; i++) {
			count += gain[i];
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
