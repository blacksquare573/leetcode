package leetcode;

import java.util.ArrayList;
import java.util.List;

public class q728 {

	public static List<Integer> selfDividingNumbers(int left, int right) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			result.add(i);
		}
		for (int i = 0; i < result.size(); i++) {
			String num = Integer.toString(result.get(i));
			if (num.contains("0")) {
				result.remove(i);
				i--;
				continue;
			}
			for (int j = 0; j < num.length(); j++) {
				if (result.get(i) % Integer.parseInt(num.substring(j, j + 1)) != 0) {
					result.remove(i);
					i--;
					break;
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int l = 47;
		int r = 85;
		System.out.println(selfDividingNumbers(l, r));

	}

}
