package leetcode;

public class q1329 {

	public int[][] diagonalSort(int[][] mat) {
		int times = Math.min(mat.length, mat[0].length);
		for (int i = 0; i < times - 1; i++) {
			for (int j = 0; j < mat.length - 1; j++) {
				for (int k = 0; k < mat[j].length - i - 1; k++) {// 把最大的数放到最外层，然后减少一层
					if (mat[j][k] > mat[j + 1][k + 1]) {
						int tmp = mat[j][k];
						mat[j][k] = mat[j + 1][k + 1];
						mat[j + 1][k + 1] = tmp;
					}
				}
			}
		}
		return mat;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
