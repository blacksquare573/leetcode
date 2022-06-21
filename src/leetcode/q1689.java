package leetcode;

public class q1689 {

	public static int minPartitions(String n) {
		int max = 0;
		for (int i = 9; i > 0; i--) {
			for (int j = 0; j < n.length(); j++) {
				if (Integer.toString(i).equals(n.substring(j, j + 1))) {
					max = i;
				}
				if (max > 0)
					break;
			}
			if (max > 0)
				break;
		}
		return max;
	}

	public static void main(String[] args) {
		String test = "125635";
		System.out.print(minPartitions(test));
	}

}
