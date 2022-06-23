package leetcode;

public class q2185 {

	public int prefixCount(String[] words, String pref) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].startsWith(pref)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
