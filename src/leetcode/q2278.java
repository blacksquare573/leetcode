package leetcode;

public class q2278 {

	public static int percentageLetter(String s, char letter) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(String.valueOf(letter))) {
				count++;
			}
		}
		return count * 100 / s.length();
	}

	public static void main(String[] args) {
		String s = "foobar";
		char letter = 'o';
		System.out.println(percentageLetter(s, letter));
	}

}
