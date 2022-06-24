package leetcode;

import java.util.ArrayList;
import java.util.List;

public class q1380 {

	public static List<Integer> luckyNumbers(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < matrix.length; i++) {
			int min = matrix[i][0];
			int index = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					index = j;
				}
			}
			for (int j = 0; j < matrix.length; j++) {
				if (min < matrix[j][index]) {
					min = 0;
				}
			}
			if (min == 0) {
				continue;
			}
			result.add(min);
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
		System.out.println(luckyNumbers(matrix));

	}

}
