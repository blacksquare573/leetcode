package leetcode;

public class q1528 {

	public String restoreString(String s, int[] indices) {
		String result = "";
		String[] str = new String[indices.length];
		for (int i = 0; i < indices.length; i++) {
			str[indices[i]] = s.substring(i, i + 1);
		}
		for (int i = 0; i < str.length; i++) {
			result += str[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
