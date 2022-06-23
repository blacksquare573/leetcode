package leetcode;

import java.util.ArrayList;

public class q1823 {

	public static int findTheWinner(int n, int k) {
		ArrayList<Integer> player = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			player.add(i + 1);
		}
		int remove = k;
		while (player.size() > 1) {
			player.remove(remove - 1);// 移除指定位置的玩家
			remove += k - 1;// 15~17指定下一个坐标
			while (remove > player.size()) {
				remove -= player.size();
			}
		}
		return player.get(0);
	}

	public static void main(String[] args) {
		int n = 5;
		int k = 2;
		System.out.println(findTheWinner(n, k));

	}

}
