package leetcode;

import java.util.Arrays;

public class q1051 {

	public int heightChecker(int[] heights) {
		int count = 0;
		int[] expected = new int[heights.length];
		for (int i = 0; i < expected.length; i++) {
			expected[i] = heights[i];
		}
		Arrays.sort(expected);
		for (int i = 0; i < expected.length; i++) {
			if (expected[i] != heights[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
