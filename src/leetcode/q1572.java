package leetcode;

public class q1572 {

	public int diagonalSum(int[][] mat) {
		int sum = 0;
		for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
			sum += mat[i][i] + mat[i][j];
		}
		if (mat.length % 2 == 1) {
			sum -= mat[mat.length / 2][mat.length / 2];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
