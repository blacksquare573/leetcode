package leetcode;

public class q1588 {

	public static int sumOddLengthSubarrays(int[] arr) {
		int count = (arr.length + 1) / 2;// 计算有多少种长度的子数组
		int sum = 0;
		while (count > 0) {
			for (int i = 0; i < arr.length - (count - 1) * 2; i++) {// 不同长度的子数组需要计算的次数
				for (int j = 0; j < count * 2 - 1; j++) {// 计算一个子数组的总和
					sum += arr[i + j];
				}
			}
			count--;// 计算完一种长度的子数组后进行下一长度的计算
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		System.out.println(sumOddLengthSubarrays(arr));

	}

}
