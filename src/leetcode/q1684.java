package leetcode;

public class q1684 {

	public int countConsistentStrings(String allowed, String[] words) {
		int count = words.length;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (allowed.contains(words[i].substring(j, j + 1)) != true) {
					count--;
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

	}

}
