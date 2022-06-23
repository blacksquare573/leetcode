package leetcode;

public class q1832 {

	public boolean checkIfPangram(String sentence) {
		boolean check = true;
		String allChar = "qwertyuiopasdfghjklzxcvbnm";
		for (int i = 0; i < 26; i++) {
			if (sentence.contains(allChar.substring(i, i + 1)) != true) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
