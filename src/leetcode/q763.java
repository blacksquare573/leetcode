package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q763 {

	public static List<Integer> partitionLabels(String s) {
		HashSet<String> chType = new HashSet<String>();
		ArrayList<String> getCh = new ArrayList<String>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int indexL = 0;
		int indexR = 0;
		while (indexL < s.length()) {
			indexR = s.lastIndexOf(s.substring(indexL, indexL + 1));
			for (int i = indexL; i <= indexR; i++) {
				chType.add(s.substring(i, i + 1));// 查找片段的字符种类
			}
			for (String i : chType) {
				getCh.add(i);
			}
			int maxIndex = 0;
			for (int i = 0; i < getCh.size(); i++) {
				if (!s.substring(indexR + 1).contains(getCh.get(i))) {// 查找该字符在后段字符串中是否出现
					continue;
				} else {
					if (maxIndex < s.lastIndexOf(getCh.get(i))) {
						maxIndex = s.lastIndexOf(getCh.get(i));// 在后段有重复字符时选出最后一个字符
						for (int j = indexR + 1; j < maxIndex; j++) {
							getCh.add(s.substring(j, j + 1));// 追加后段的字符
						}
					}
				}
			}
			if (maxIndex == 0) {
				maxIndex = indexR;
			}
			result.add(maxIndex - indexL + 1);
			chType.clear();
			getCh.removeAll(getCh);
			indexL = maxIndex + 1;
		}
		return result;
	}

	public static void main(String[] args) {

		String str = "qiejxqfnqceocmy";
		System.out.println(partitionLabels(str));

	}

}
