package leetcode;

import java.util.Arrays;

public class q1877 {

	public static int minPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			if (nums[i] + nums[nums.length - i - 1] > result) {
				result = nums[i] + nums[nums.length - i - 1];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 3, 5, 2, 1, 5, 5, 2, 3, 1 };
		System.out.println(minPairSum(nums));

	}

}
