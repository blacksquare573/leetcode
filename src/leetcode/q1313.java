package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class q1313 {

	public static int[] decompressRLElist(int[] nums) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < nums.length; i += 2) {
			for (int j = 0; j < nums[i]; j++) {
				list.add(String.valueOf(nums[i + 1]));
			}
		}
		int[] newList = new int[list.size()];
		for (int i = 0; i < newList.length; i++) {
			newList[i] = Integer.parseInt(list.get(i));
		}
		return newList;
	}

	public static void main(String[] args) {
		int[] nums = { 48, 36 };
		System.out.println(Arrays.toString(decompressRLElist(nums)));

	}

}
