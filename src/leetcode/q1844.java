package leetcode;

public class q1844 {

	public static String replaceDigits(String s) {
		StringBuilder str = new StringBuilder();
		str = str.append(s);
		for (int i = 1; i < s.length(); i += 2) {
			char ch = (char) (s.charAt(i - 1) + (s.charAt(i) - '0'));
			str.replace(i, i + 1, String.valueOf(ch));
		}
		String result = str.toString();
		return result;
	}

	public static void main(String[] args) {
		String s = "a1b2c3d4e";
		System.out.println(replaceDigits(s));
	}

}
