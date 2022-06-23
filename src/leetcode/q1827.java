package leetcode;

public class q1827 {

	public int minOperations(int[] nums) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] <= nums[i]) {
				count = nums[i] - nums[i + 1] + 1;
				sum += count;
				nums[i + 1] += count;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
