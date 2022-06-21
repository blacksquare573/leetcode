package leetcode;

import java.util.Arrays;

public class q1 {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] ar = { 1, 5, 6, 2, 7, 6, 3 };
		System.out.print(Arrays.toString(twoSum(ar, 20)));
	}

}
