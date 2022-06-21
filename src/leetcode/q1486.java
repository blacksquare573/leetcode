package leetcode;

public class q1486 {

	public static int xorOperation(int n, int start) {
		int result = 0;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = start + 2 * i;
			result ^= nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print(xorOperation(10, 5));
	}

}
