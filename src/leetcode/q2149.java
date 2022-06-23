package leetcode;

public class q2149 {

	public int[] rearrangeArray(int[] nums) {
		int[] plus = new int[nums.length / 2];
		int[] minus = new int[nums.length / 2];
		int countP = 0;
		int countM = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				plus[countP] = nums[i];
				countP++;
			} else {
				minus[countM] = nums[i];
				countM++;
			}
		}
		int[] result = new int[nums.length];
		countP = 0;
		countM = 0;
		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0) {
				result[i] = plus[countP];
				countP++;
			} else {
				result[i] = minus[countM];
				countM++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
