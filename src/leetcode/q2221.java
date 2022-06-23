package leetcode;

import java.util.ArrayList;

public class q2221 {

	public static int triangularSum(int[] nums) {
		int result = nums[0];
		if (nums.length == 1) {
			return result;
		}
		int count = nums.length;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			numList.add(nums[i]);
		}
		while (count > 0) {
			for (int i = 0; i < count - 1; i++) {
				int tri = (numList.get(numList.size() - count) + numList.get(numList.size() - count + 1)) % 10;
				numList.add(tri);
			}
			count--;
		}
		return numList.get(numList.size() - 1);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };

		System.out.println(triangularSum(nums));
	}

}
