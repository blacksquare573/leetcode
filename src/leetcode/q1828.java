package leetcode;

import java.util.Arrays;

public class q1828 {

	public static int[] countPoints(int[][] points, int[][] queries) {
		int[] count = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int k = 0;
			for (int j = 0; j < points.length; j++) {
				if (Math.sqrt((Math.pow((queries[i][0] - points[j][0]), 2)
						+ Math.pow((queries[i][1] - points[j][1]), 2))) <= queries[i][2]) {
					k += 1;
				}
				count[i] = k;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] p = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 } };
		int[][] area = { { 1, 2, 2 }, { 2, 2, 2 }, { 4, 3, 2 }, { 4, 3, 3 } };
		System.out.print(Arrays.toString(countPoints(p, area)));

	}

}
