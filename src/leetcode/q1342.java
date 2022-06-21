package leetcode;

public class q1342 {

	public int numberOfSteps(int num) {
		int count = 0;
		while (num != 0) {
			if (num % 2 == 1) {
				num = num - 1;
			} else {
				num = num / 2;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
