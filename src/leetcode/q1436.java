package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q1436 {

	public static String destCity(List<List<String>> paths) {
		String result = "";
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		for (int i = 0; i < paths.size(); i++) {
			set1.add(paths.get(i).get(0));
			set2.add(paths.get(i).get(1));
		}
		for (String i : set2) {
			if (!set1.contains(i)) {
				result = i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> path = new ArrayList<String>();
		List<List> paths = new ArrayList<List>();
	}
}
