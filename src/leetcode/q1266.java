package leetcode;

public class q1266 {

	public int minTimeToVisitAllPoints(int[][] points) {
		int sum = 0;
		int absX = 0;
		int absY = 0;
		for (int i = 0; i < points.length - 1; i++) {
			absX = Math.abs(points[i][0] - points[i + 1][0]);
			absY = Math.abs(points[i][1] - points[i + 1][1]);
			if (absX >= absY) {
				sum += absX;
			} else {
				sum += absY;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
