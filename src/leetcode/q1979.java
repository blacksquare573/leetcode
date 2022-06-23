package leetcode;

import java.util.Arrays;

public class q1979 {

	public int findGCD(int[] nums) {
		Arrays.sort(nums);
		int min = nums[0];
		int max = nums[nums.length - 1];
		int GCD = nums[0];
		while (max % min != 0) {
			GCD = max % min;
			max = min;
			min = GCD;
		}
		return GCD;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
