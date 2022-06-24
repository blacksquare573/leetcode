package leetcode;

import java.util.ArrayList;
import java.util.List;

public class q77 {
	static List<List<Integer>> result = new ArrayList<>();

	public static List<List<Integer>> combine(int n, int k) {
		getList(n, k, 1, new ArrayList<Integer>());
		return result;
	}

	public static void getList(int n, int k, int count, ArrayList<Integer> combineList) {
		if (k == 0) {
			result.add(new ArrayList<>(combineList));
			return;
		}
		for (int i = count; i < n - k + 2; i++) {// 限定集合的大小
			combineList.add(i);
			getList(n, k - 1, i + 1, combineList);// 取i的下一个数的可能的组合
			combineList.remove(combineList.size() - 1);
		}
	}

	public static void main(String[] args) {
		int n = 8;
		int k = 5;
		System.out.println((combine(n, k)));
	}

}
