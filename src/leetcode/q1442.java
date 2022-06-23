package leetcode;

public class q1442 {

	public static int countTriplets(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j; k < arr.length; k++) {
					int a = arr[i];
					int b = arr[j];
					int countA = 1;
					int countB = 1;
					while (countA < j - i) {// a的异或次数
						a ^= arr[i + countA];
						countA++;
					}
					while (countB < k - j + 1) {// b的异或次数
						b ^= arr[j + countB];
						countB++;
					}
					if (a == b) {
						result++;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] queries = { 2, 3, 1, 6, 7 };
		System.out.println(countTriplets(queries));

	}

}
