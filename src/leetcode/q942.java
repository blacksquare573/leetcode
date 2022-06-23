package leetcode;

import java.util.Arrays;

public class q942 {

	public static int[] diStringMatch(String s) {
		int left = 0;
		int right = s.length();
		int[] result = new int[s.length() + 1];
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("I")) {
				result[i] = left;
				left++;

			} else if (s.substring(i, i + 1).equals("D")) {
				result[i] = right;
				right--;
			}
		}
		result[result.length - 1] = left;
		return result;
	}

	public static void main(String[] args) {
		String str = "IDIDIDIIIDDDDDIII";
		System.out.println(Arrays.toString(diStringMatch(str)));

	}

}
