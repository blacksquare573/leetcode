package leetcode;

public class q1791 {

	public int findCenter(int[][] edges) {
		int center = 0;
		if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
			center = edges[0][0];
		} else {
			center = edges[0][1];
		}
		return center;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
