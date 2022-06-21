package leetcode;

import java.util.Arrays;

public class q1365 {

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] smallerNum = new int[nums.length];
		for (int i = 0; i < smallerNum.length; i++) {
			int count = 0;
			for (int j = 0; j < smallerNum.length; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
			}
			smallerNum[i] = count;
		}
		return smallerNum;
	}

	public static void main(String[] args) {
		int[] nums = { 8, 1, 2, 2, 3 };
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
	}

}
