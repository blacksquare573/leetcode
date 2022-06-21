package leetcode;

public class q1221 {

	public static int balancedStringSplit(String s) {
		int strcount = 0;
		int Rcount = 0;
		int Lcount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("R")) {
				Rcount++;
			} else if (s.substring(i, i + 1).equals("L")) {
				Lcount++;
			}
			if (Rcount == Lcount) {
				strcount++;
			}
		}
		return strcount;
	}

	public static void main(String[] args) {
		String str = "RRLLLLRRLRRRLL";
		System.out.print(balancedStringSplit(str));
	}

}
