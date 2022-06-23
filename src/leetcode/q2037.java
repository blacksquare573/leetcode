package leetcode;

import java.util.Arrays;

public class q2037 {

	public static int minMovesToSeat(int[] seats, int[] students) {
		int sum = 0;
		Arrays.sort(seats);
		Arrays.sort(students);
		for (int i = 0; i < students.length; i++) {
			sum += Math.abs(seats[i] - students[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] seats = { 4, 1, 5, 9 };
		int[] students = { 1, 3, 2, 6 };
		System.out.println(minMovesToSeat(seats, students));
	}

}
