package leetcode;

public class q419 {

	public int countBattleships(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					count++;
					if (i + 1 < board.length) {
						if (board[i + 1][j] == 'X') {
							count--;
						}
					}
					if (j + 1 < board[i].length) {
						if (board[i][j + 1] == 'X') {
							count--;
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
