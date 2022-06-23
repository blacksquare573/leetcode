package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q2089 {

	public List<Integer> targetIndices(int[] nums, int target) {
		Arrays.sort(nums);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result.add(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
