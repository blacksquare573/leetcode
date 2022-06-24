package leetcode;

public class q1768 {

	public String mergeAlternately(String word1, String word2) {
		String result = "";
		int min = Math.min(word1.length(), word2.length());
		for (int i = 0; i < min; i++) {
			result += word1.substring(i, i + 1);
			result += word2.substring(i, i + 1);
		}
		if (word1.length() > word2.length()) {
			result += word1.substring(min);
		} else if (word1.length() < word2.length()) {
			result += word2.substring(min);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
