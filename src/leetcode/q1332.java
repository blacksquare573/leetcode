package leetcode;

public class q1332 {

	public static int removePalindromeSub(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {// 判断本身是不是回文字符串
			if (s.charAt(left) != s.charAt(right)) {
				return 2;
			}
			left++;
			right--;
		}
		return 1;
	}

	public static void main(String[] args) {
		String string = "ababababab/abba/a";// 只存在a和b的情况下必定可以2次内删除
		System.out.println(removePalindromeSub(string));
	}

}
