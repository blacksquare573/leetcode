package leetcode;

public class q1748 {

	public static int sumOfUnique(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = nums[i];
			int check = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					check = nums[i];
					break;
				}
			}
			if (count != check) {
				sum += count;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2 };
		System.out.println(sumOfUnique(nums));
	}

}
