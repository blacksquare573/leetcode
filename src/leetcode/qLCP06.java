package leetcode;

public class qLCP06 {

	public int minCount(int[] coins) {
		int sum = 0;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] % 2 == 0) {
				sum += coins[i] / 2;
			} else {
				sum += coins[i] / 2 + 1;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

	}

}
