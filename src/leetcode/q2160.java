package leetcode;

import java.util.Arrays;

public class q2160 {

	public int minimumSum(int num) {
		int sum = 0;
		String str = String.valueOf(num);
		char[] ch = str.toCharArray();
		int[] numCh = new int[ch.length];
		for (int i = 0; i < numCh.length; i++) {
			numCh[i] = ch[i] - '0';
		}
		Arrays.sort(numCh);
		sum = (numCh[0] + numCh[1]) * 10 + numCh[2] + numCh[3];
		return sum;
	}

	public static void main(String[] args) {
		char ch = '9';
		int n1 = ch - '0';
		System.out.println(n1);
	}

}
