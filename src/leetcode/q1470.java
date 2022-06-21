package leetcode;

import java.util.Arrays;

public class q1470 {

	public static int[] shuffle(int[] nums, int n) {
		int[] newNums = new int[2 * n];
		for (int i = 0; i < 2 * n; i += 2) {
			newNums[i] = nums[i / 2];
			newNums[i + 1] = nums[i / 2 + n];
		}
		return newNums;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(shuffle(nums, 4)));

	}

}
