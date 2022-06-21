package leetcode;

public class q771 {

	public int numJewelsInStones(String jewels, String stones) {
		char[] type = jewels.toCharArray();
		int count = 0;
		for (int i = 0; i < type.length; i++) {
			for (int j = 0; j < stones.length(); j++) {
				if (String.valueOf(type[i]).equals(stones.substring(j, j + 1))) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] str = { "a b c", "d e f", "x y z i g" };
		System.out.print(q2114.mostWordsFound(str));

	}

}
