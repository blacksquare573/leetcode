package leetcode;

import java.util.Scanner;

public class test2 {

	public static void searchSeat(boolean[][] seat, int[] state) {
		for (int i = 0; i < state[1]; i++) {
			for (int j = 0; j < state[2]; j++) {
				if (seat[i][j] == false && ((Math.abs(i - state[3])) + (Math.abs(j - state[4])) == 2)) {
					System.out.println(i + " " + j);
				} else if (seat[i][j] == false && i == state[3] && j == state[4]) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] state = new int[5];
		for (int i = 0; i < 5; i++) {
			state[i] = sc.nextInt();
		}
		boolean[][] seat = new boolean[state[1]][state[2]];
		int x = 0;
		int y = 0;
		for (int i = 0; i < state[0]; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			seat[x][y] = true;
		}
		searchSeat(seat, state);
	}

}
