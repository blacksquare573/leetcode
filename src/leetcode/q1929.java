package leetcode;

public class q1929 {

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[2 * nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {

	}

}
