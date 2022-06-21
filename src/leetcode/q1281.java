package leetcode;

public class q1281 {

	public int subtractProductAndSum(int n) {
		String numStr = String.valueOf(n);
		char[] numChar = numStr.toCharArray();
		int[] numInt = new int[numChar.length];
		for (int i = 0; i < numInt.length; i++) {
			numInt[i] = numChar[i] - '0';
		}
		int multiplied = 1;
		int sum = 0;
		for (int i = 0; i < numInt.length; i++) {
			multiplied *= numInt[i];
			sum += numInt[i];
		}
		return multiplied - sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
