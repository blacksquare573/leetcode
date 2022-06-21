package leetcode;

public class q2114 {

	public static int mostWordsFound(String[] sentences) {
		int max = 0;
		for (int i = 0; i < sentences.length; i++) {
			int count = 1;
			for (int j = 0; j < sentences[i].length(); j++) {
				if (" ".equals(sentences[i].substring(j, j + 1))) {
					count++;
				}
			}
			if (count > max) {
				max = count;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String[] test = { "please wait", "continue to fight", "continue to win" };
		System.out.print(mostWordsFound(test));
	}

}
