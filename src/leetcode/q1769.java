package leetcode;

import java.util.Arrays;

public class q1769 {

	public static int[] minOperations(String boxes) {
		int[] answer = new int[boxes.length()];
		for (int i = 0; i < boxes.length(); i++) {
			int index = 0;
			int sum = 0;
			while (index >= 0) {
				if (boxes.substring(index, index + 1).equals("1")) {
					sum = sum + Math.abs(index - i);
				}
				index = boxes.indexOf("1", index + 1);
				if (index < 0) {
					break;
				}
			}
			answer[i] = sum;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.print(Arrays.toString(minOperations("001011")));
	}

}
