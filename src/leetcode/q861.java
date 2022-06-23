package leetcode;

public class q861 {

	public static int matrixScore(int[][] grid) {
		String[] hexStrings = new String[grid.length];
		for (int i = 0; i < hexStrings.length; i++) {
			String hex = "";
			for (int j = 0; j < grid[i].length; j++) {
				hex += grid[i][j];
			}
			if (hex.substring(0, 1).equals("0")) {
				hex = Integer.toBinaryString(~Integer.parseInt(hex, 2));
				hex = hex.substring(hex.length() - grid[i].length);
			}
			hexStrings[i] = hex;// 让第一位都为1，输入数据进String数组
		}
		String[] hexStringsCol = new String[hexStrings[0].length()];
		for (int i = 0; i < hexStringsCol.length; i++) {
			String hex = "";
			int count0 = 0;
			int count1 = 0;
			for (int j = 0; j < hexStrings.length; j++) {
				if (hexStrings[j].substring(i, i + 1).equals("0")) {
					count0++;
				} else {
					count1++;
				}
				hex += hexStrings[j].substring(i, i + 1);
			}
			if (count0 > count1) {
				hex = Integer.toBinaryString(~Integer.parseInt(hex, 2));
				hex = hex.substring(hex.length() - grid.length);
			}
			hexStringsCol[i] = hex;// 让每一列0的数量变为最大
		}
		for (int i = 0; i < hexStrings.length; i++) {
			String hex = "";
			for (int j = 0; j < hexStringsCol.length; j++) {
				hex += hexStringsCol[j].substring(i, i + 1);
			}
			hexStrings[i] = hex;// 返回最后的每个字符串回数组
		}
		int sum = 0;
		for (int i = 0; i < hexStrings.length; i++) {
			sum += Integer.parseInt(hexStrings[i], 2);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] hex = new int[4][6];
		String[] hexStrings = { "001011", "101011", "001010", "000001" };
		String s1 = "001011";
		String s2 = "101011";
		String s3 = "001010";
		String s4 = "000001";
		String s5 = "111010";
		String s6 = "010011";
		for (int i = 0; i < hex.length; i++) {
			for (int j = 0; j < 6; j++) {
				hex[i][j] = Integer.parseInt(hexStrings[i].substring(j, j + 1));
			}
		}
		System.out.println(matrixScore(hex));

	}

}
