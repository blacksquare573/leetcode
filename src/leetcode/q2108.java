package leetcode;

public class q2108 {

	public String firstPalindrome(String[] words) {
		String result = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				result += words[i].substring(words[i].length() - 1 - j, words[i].length() - j);
			}
			if (result.equals(words[i])) {
				break;
			} else {
				result = "";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
