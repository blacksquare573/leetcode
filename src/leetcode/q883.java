package leetcode;

public class q883 {

	public static int projectionArea(int[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			result += grid[i].length;
		}
		for (int i = 0; i < grid.length; i++) {
			int max = 0;
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] > max) {
					max = grid[i][j];
				}
				if (grid[i][j] == 0) {// 减掉xy面中为0（无方块）的面数
					result--;
				}
			}
			result += max;
		}
		for (int i = 0; i < grid[0].length; i++) {
			int max = 0;
			for (int j = 0; j < grid.length; j++) {
				if (grid[j][i] > max) {
					max = grid[j][i];
				}
			}
			result += max;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] nums = { { 1, 2 }, { 3, 4 } };
		System.out.println(projectionArea(nums));
	}
}
