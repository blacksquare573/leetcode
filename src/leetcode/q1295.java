package leetcode;

public class q1295 {

	public int findNumbers(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			String str = "";
			if ((str + nums[i]).length() % 2 == 0) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
