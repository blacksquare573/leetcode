package leetcode;

import java.util.ArrayList;

public class q804 {

	static String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

	public static int uniqueMorseRepresentations(String[] words) {
		ArrayList<String> type = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			String str = "";
			for (int j = 0; j < words[i].length(); j++) {
				str = str + morseCode[((words[i].charAt(j)) - 97)];
			}
			type.add(str);
		}
		for (int i = 0; i < type.size(); i++) {
			for (int j = i + 1; j < type.size(); j++) {
				if (type.get(i).equals(type.get(j))) {
					type.remove(i);
					i--;// 使移除元素后继续进行下一个元素的检测
					break;
				}
			}
		}
		return type.size();
	}

	public static void main(String[] args) {
		String[] str = { "a" };
		System.out.print(uniqueMorseRepresentations(str));

	}

}
