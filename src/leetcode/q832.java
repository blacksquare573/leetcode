package leetcode;

public class q832 {

	public int[][] flipAndInvertImage(int[][] image) {
		int[][] result = new int[image.length][image.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (image[i][image.length - j - 1] == 0) {
					result[i][j] = 1;
				} else if (image[i][image.length - j - 1] == 1)
					result[i][j] = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
