package leetcode;

public class q2119 {

	public static boolean isSameAfterReversals(int num) {
		StringBuilder strb = new StringBuilder(String.valueOf(num));
		int reversed1 = Integer.parseInt(strb.reverse().toString());
		strb.replace(0, strb.length(), (String.valueOf(reversed1)));
		int reversed2 = Integer.parseInt(strb.reverse().toString());
		return num == reversed2;
	}

	public static void main(String[] args) {
		int num = 526;
		System.out.println(isSameAfterReversals(num));
	}

}
