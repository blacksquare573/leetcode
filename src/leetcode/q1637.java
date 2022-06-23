package leetcode;

import java.util.Arrays;

public class q1637 {

	public int maxWidthOfVerticalArea(int[][] points) {
		int[] indexX = new int[points.length];
		for (int i = 0; i < indexX.length; i++) {
			indexX[i] = points[i][0];
		}
		Arrays.sort(indexX);
		int max = 0;
		for (int i = 0; i < indexX.length - 1; i++) {
			if (indexX[i + 1] - indexX[i] > max) {
				max = indexX[i + 1] - indexX[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
