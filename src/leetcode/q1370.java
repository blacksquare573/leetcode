package leetcode;

public class q1370 {

	public static String sortString(String s) {
		int[] ch = new int[26];
		for (int i = 0; i < s.length(); i++) {
			ch[s.charAt(i) - 'a']++;// 计算26个字符分别有多少个
		}
		String result = "";
		int count = 0;
		while (count < s.length()) {
			for (int i = 0; i < 26; i++) {// 从最小字符开始按顺序各取走一个，跳出循环
				if (ch[i] != 0) {
					result += String.valueOf((char) (i + 'a'));
					count++;
					ch[i]--;
				}
			}
			for (int i = 25; i >= 0; i--) {// 从最大字符开始按顺序各取走一个，跳出循环
				if (ch[i] != 0) {
					result += String.valueOf((char) (i + 'a'));
					count++;
					ch[i]--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String result = "aaaabbbbcccc";
		System.out.println(sortString(result));
	}

}
