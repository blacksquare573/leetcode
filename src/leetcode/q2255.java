package leetcode;

public class q2255 {

	public int countPrefixes(String[] words, String s) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (s.startsWith(words[i])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
