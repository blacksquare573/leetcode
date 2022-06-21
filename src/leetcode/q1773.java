package leetcode;

import java.util.ArrayList;
import java.util.List;

public class q1773 {

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int a = -1;
		int count = 0;
		if (ruleKey.equals("type")) {
			a = 0;
		} else if (ruleKey.equals("color")) {
			a = 1;
		} else {
			a = 2;
		}
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).get(a).equals(ruleValue)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] item = { "phone", "silver", "iphone" };
		List<String> item1 = new ArrayList<String>();
		item1.add("phone");
		item1.add("computer");
		List<String> item2 = new ArrayList<String>();
		item2.add("blue");
		item2.add("silver");
		item2.add("gold");
		List<String> item3 = new ArrayList<String>();
		item3.add("pixel");
		item3.add("lenovo");
		item3.add("iphone");
		List<List<String>> item4 = new ArrayList<>();
		item4.add(item3);
		item4.add(item2);
		item4.add(item1);
		String s1 = "type";
		String s2 = "phone";
		System.out.println(countMatches(item4, s1, s2));
	}

}
