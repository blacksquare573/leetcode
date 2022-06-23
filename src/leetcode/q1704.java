package leetcode;

public class q1704 {

	public boolean halvesAreAlike(String s) {
		String vowels = "aeiouAEIOU";
		int countA = 0;
		int countB = 0;
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			if (vowels.contains(s.substring(i, i + 1))) {
				countA++;
			}
			if (vowels.contains(s.substring(j, j + 1))) {
				countB++;
			}
		}
		if (countA == countB) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
