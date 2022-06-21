package leetcode;

import java.util.Arrays;

public class q2120 {

	public static int[] executeInstructions(int n, int[] startPos, String s) {
		int indexX = startPos[0];
		int indexY = startPos[1];
		int[] times = new int[s.length()];
		for (int i = 0; i < times.length; i++) {
			indexX = startPos[0];
			indexY = startPos[1];
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.substring(j, j + 1).equals("L")) {
					indexY -= 1;
					count++;
				} else if (s.substring(j, j + 1).equals("R")) {
					indexY += 1;
					count++;
				} else if (s.substring(j, j + 1).equals("U")) {
					indexX -= 1;
					count++;
				} else if (s.substring(j, j + 1).equals("D")) {
					indexX += 1;
					count++;
				}
				if (indexX < 0 || indexX > n - 1 || indexY < 0 || indexY > n - 1) {
					times[i] = count - 1;
					s = s.substring(1);
					break;
				}
			}
			if (indexX >= 0 && indexX < n && indexY >= 0 && indexY < n) {
				times[i] = count;
				s = s.substring(1);
			}
		}
		return times;
	}

	public static void main(String[] args) {
		int[] start = new int[] { 0, 1 };
		String s = "RRDDLU";
		System.out.println(Arrays.toString(executeInstructions(3, start, s)));
	}

}
