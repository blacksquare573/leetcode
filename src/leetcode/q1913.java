package leetcode;

public class q1913 {

	public static int maxProductDifference(int[] nums) {
		int max = 0;
		int min = nums[0] * nums[1];
		int count = nums[0] * nums[1];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					count = nums[i] * nums[j];
				}
				if (count > max) {
					max = count;
				}
				if (count <= min) {
					min = count;
				}
			}
		}
		return max - min;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 3987, 7139, 9649, 6561, 8585, 1289, 6485, 5084, 5563, 3631, 5457, 2755, 1252, 8364,
				1869, 8694 };
		System.out.println(maxProductDifference(nums));
	}
}
