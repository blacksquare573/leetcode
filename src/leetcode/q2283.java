package leetcode;

public class q2283 {

	public boolean digitCount(String num) {
		boolean digitCount = true;
		for (int i = 0; i < num.length(); i++) {
			int count = 0;
			for (int j = 0; j < num.length(); j++) {
				String str = "";
				if (num.substring(j, j + 1).equals(str + i)) {
					count++;
				}
			}
			if (count != Integer.parseInt(num.substring(i, i + 1))) {
				digitCount = false;
				break;
			}
		}
		return digitCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
