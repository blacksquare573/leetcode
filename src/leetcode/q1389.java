package leetcode;

import java.util.ArrayList;

public class q1389 {

	public int[] createTargetArray(int[] nums, int[] index) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			newArray.add(index[i], nums[i]);
		}
		int[] target = new int[newArray.size()];
		for (int i = 0; i < target.length; i++) {
			target[i] = newArray.get(i);
		}
		return target;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
