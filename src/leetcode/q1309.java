package leetcode;

public class q1309 {

	public String freqAlphabets(String s) {
		StringBuilder str = new StringBuilder(s);
		String nums = "0123456789";
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("#")) {
				str.replace(i - 2, i + 1, String.valueOf((char) ('`' + (Integer.parseInt(str.substring(i - 2, i))))));
				i -= 2;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (nums.contains(str.substring(i, i + 1))) {
				str.replace(i, i + 1, String.valueOf((char) ('0' + (str.charAt(i)))));
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		String s = "10#11#12";
		String nums = "0123456789";
		StringBuilder str = new StringBuilder(s);
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("#")) {
				str.replace(i - 2, i + 1, String.valueOf((char) ('`' + (Integer.parseInt(str.substring(i - 2, i))))));
				i -= 2;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (nums.contains(str.substring(i, i + 1))) {
				str.replace(i, i + 1, String.valueOf((char) ('0' + (str.charAt(i)))));
			}
		}
		System.out.println(str);
		System.out.println((char) ('`' + 10));
	}
}
