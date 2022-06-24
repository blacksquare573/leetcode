package leetcode;

public class q2057 {

	public int smallestEqual(int[] nums) {
		int min = -1;
		for (int i = 0; i < nums.length; i++) {
			if (i % 10 == nums[i]) {
				min = i;
				break;
			}
		}
		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
