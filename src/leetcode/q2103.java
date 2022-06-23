package leetcode;

public class q2103 {

	public int countPoints(String rings) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			String str = "";
			if (rings.contains(str + "B" + i) && rings.contains(str + "R" + i) && rings.contains(str + "G" + i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

	}

}
