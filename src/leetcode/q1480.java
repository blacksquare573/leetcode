package leetcode;

public class q1480 {

	public int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			result[i] = sum;
		}
		return result;
	}

	public static void main(String[] args) {

	}

}
