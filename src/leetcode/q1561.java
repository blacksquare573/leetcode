package leetcode;

import java.util.Arrays;

public class q1561 {

	public static int maxCoins(int[] piles) {
		int sum = 0;
		Arrays.sort(piles);
		for (int i = 0; i < piles.length / 3 * 2; i += 2) {
			sum += piles[piles.length - 2 - i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] piles = { 9, 8, 7, 6, 5, 1, 2, 3, 4 };
		System.out.println(maxCoins(piles));

	}

}
