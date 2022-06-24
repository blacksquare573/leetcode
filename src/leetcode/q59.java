package leetcode;

import java.util.Arrays;

public class q59 {

	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		int up = 0;
		int right = n - 1;
		int down = n - 1;
		int left = 0;
		int count = 1;
		while (count <= n * n) {
			for (int i = left; i <= right; i++) {
				result[up][i] = count;
				count++;
			}
			up++;
			for (int i = up; i <= down; i++) {
				result[i][right] = count;
				count++;
			}
			right--;
			for (int i = right; i >= left; i--) {
				result[down][i] = count;
				count++;
			}
			down--;
			for (int i = down; i >= up; i--) {
				result[i][left] = count;
				count++;
			}
			left++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(generateMatrix(5)));

	}

}
