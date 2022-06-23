package leetcode;

import java.util.ArrayList;

public class q1409 {

	public static int[] processQueries(int[] queries, int m) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			list.add(i + 1);
		}
		int[] result = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			result[i] = list.indexOf(queries[i]);
			list.remove(result[i]);
			list.add(0, queries[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] queries = { 4, 1, 2, 2 };
		int m = 8;
		System.out.println(processQueries(queries, m));

	}

}
