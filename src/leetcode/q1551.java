package leetcode;

public class q1551 {

	public int minOperations(int n) {
		int result = 0;
		if (n % 2 == 1) {
			result = (n * n - 1) / 4;
		} else {
			result = n * n / 4;
		}
		return result;
	}
	// 因为1/4=0，所以可以化简为return n*n/4 =_=

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
