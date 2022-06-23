package leetcode;

public class q1641 {// 二项式求和

	public int countVowelStrings(int n) {
		int sum = 1;
		for (int i = 1; i < 5; i++) {
			sum *= n + i;
		}
		return sum / 24;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
