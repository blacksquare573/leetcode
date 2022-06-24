package leetcode;

import java.util.Arrays;

public class q1860 {

	public static int[] memLeak(int memory1, int memory2) {
		int count = 1;
		int[] result = new int[3];
		while (count <= memory1 || count <= memory2) {
			if (memory1 >= memory2) {
				memory1 -= count;
			} else {
				memory2 -= count;
			}
			count++;
		}
		result[0] = count;
		result[1] = memory1;
		result[2] = memory2;
		return result;
	}

	public static void main(String[] args) {
		int m1 = 2;
		int m2 = 2;
		System.out.println(Arrays.toString(memLeak(m1, m2)));

	}

}
