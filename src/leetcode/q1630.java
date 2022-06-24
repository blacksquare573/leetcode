package leetcode;

import java.util.ArrayList;
import java.util.List;

public class q1630 {

	public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
		ArrayList<Boolean> result = new ArrayList<Boolean>();
		ArrayList<Integer> numsList = new ArrayList<Integer>();
		for (int i = 0; i < r.length; i++) {
			for (int j = l[i]; j <= r[i]; j++) {
				numsList.add(nums[j]);
			}
			numsList.sort(null);
			boolean check = true;
			for (int j = 0; j < numsList.size() - 1; j++) {
				if (numsList.get(j + 1) - numsList.get(j) != numsList.get(1) - numsList.get(0)) {
					check = false;
					break;
				}
			}
			result.add(check);
			numsList.removeAll(numsList);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10 };
		int[] l = { 0, 1, 6, 4, 8, 7 };
		int[] r = { 4, 4, 9, 7, 9, 10 };
		System.out.println(checkArithmeticSubarrays(nums, l, r));
	}

}
