package leetcode;

import java.util.Arrays;

public class q877 {

	public boolean stoneGame(int[] piles) {
		Arrays.sort(piles);
		int sumA = 0;
		int sumB = 0;
		for (int i = piles.length - 1; i >= 0; i -= 2) {
			sumA += piles[i];
			sumB += piles[i - 1];
		}
		if (sumA > sumB) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
