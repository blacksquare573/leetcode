package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q1557 {

	public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
		HashSet<Integer> end = new HashSet<Integer>();
		for (int i = 0; i < edges.size(); i++) {
			end.add(edges.get(i).get(1));
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (!end.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
