package leetcode;

public class q1021 {

	public static String removeOuterParentheses(String s) {
		String result = "";
		int index = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("(")) {
				count++;
			} else if (s.substring(i, i + 1).equals(")")) {
				count--;
			}
			if (count == 0) {
				if (i - index > 2) {
					result += s.substring(index + 1, i);
				}
				index = i + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "()()";
		System.out.println(removeOuterParentheses(s));
	}
}
