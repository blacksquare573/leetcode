package leetcode;

public class q2161 {
	/*
	 * 别解：先使用pivot填充整个数组排除掉相等的情况，然后小于pivot的左移，大于pivot的右移
	 * 
	 * public static int[] pivotArray(int[] nums, int pivot) {
	 * 
	 * int[] result =new int[nums.length];
	 * 
	 * Arrays.fill(result , pivot);
	 * 
	 * int left = 0;
	 * 
	 * int right =nums.length-1;
	 * 
	 * for (int i = 0; i < nums.length; i++) {
	 * 
	 * if (nums[i] < pivot) {
	 * 
	 * result[left] = nums[i]; left++;
	 * 
	 * }else if(nums[i] > pivot){
	 * 
	 * result[right] =nums[i]; right--;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * return result;
	 */
	public static int[] pivotArray(int[] nums, int pivot) {
		int[] result = new int[nums.length];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < pivot) {
				result[index] = nums[i];
				index++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == pivot) {
				result[index] = nums[i];
				index++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > pivot) {
				result[index] = nums[i];
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 22, 33, 12, 32, 40, 12, 32 };
		System.out.print(pivotArray(nums, 32));
	}

}
