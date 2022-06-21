package leetcode;

public class q1725 {

	public int countGoodRectangles(int[][] rectangles) {
		int maxLen = 0;
		int count = 1;
		int temp = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i][0] <= rectangles[i][1]) {
				temp = rectangles[i][0];
			} else {
				temp = rectangles[i][1];
			}
			if (maxLen < temp) {
				maxLen = temp;
				count = 1;
			} else if (maxLen == temp) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
