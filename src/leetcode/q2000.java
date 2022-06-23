package leetcode;

public class q2000 {

	public static String reversePrefix(String word, char ch) {
		if (!word.contains(ch + "")) {
			return word;
		}
		String str = word.substring(0, word.indexOf(ch) + 1);
		char[] array = str.toCharArray();
		String result = "";
		for (int i = array.length; i > 0; i--) {
			result += array[i - 1];
		}
		result += word.substring(word.indexOf(ch) + 1);
		return result;
	}

	public static void main(String[] args) {
		String word = "abcdefd";
		char ch = 'z';
		System.out.println(reversePrefix(word, ch));

	}

}
