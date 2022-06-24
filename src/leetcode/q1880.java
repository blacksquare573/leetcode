package leetcode;

public class q1880 {

	public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		boolean result = false;
		String numFirst = "";
		String numSecond = "";
		String numTarget = "";
		for (int i = 0; i < firstWord.length(); i++) {
			numFirst += firstWord.charAt(i) - 'a';
		}
		for (int i = 0; i < secondWord.length(); i++) {
			numSecond += secondWord.charAt(i) - 'a';
		}
		for (int i = 0; i < targetWord.length(); i++) {
			numTarget += targetWord.charAt(i) - 'a';
		}
		if (Integer.parseInt(numFirst) + Integer.parseInt(numSecond) == Integer.parseInt(numTarget)) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		String s1 = "acb";
		String s2 = "cba";
		String s3 = "cdb";
		System.out.println(isSumEqual(s1, s2, s3));

	}

}
