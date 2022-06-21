package leetcode;

public class q2125 {

	public static int numberOfBeams(String[] bank) {
		int sum = 0;
		int row1_1_times = 0;
		int row2_1_times = 0;
		for (int j = 0; j < bank[0].length(); j++) {
			if (bank[0].substring(j, j + 1).equals("1")) {
				row1_1_times++;
			}
		}
		for (int i = 0; i < bank.length - 1; i++) {
			int count1 = i + 1;
			if (bank[count1].contains("1")) {
				row2_1_times = 0;
				for (int j = 0; j < bank[i].length(); j++) {
					if (bank[count1].substring(j, j + 1).equals("1")) {
						row2_1_times++;
					}
				}
				sum += row1_1_times * row2_1_times;
				row1_1_times = row2_1_times;
			} else {
				while (count1 < bank.length - 1) {
					if (bank[count1 + 1].contains("1")) {
						row2_1_times = 0;
						for (int j = 0; j < bank[i].length(); j++) {
							if (bank[count1 + 1].substring(j, j + 1).equals("1")) {
								row2_1_times++;
							}
						}
						sum += row1_1_times * row2_1_times;
						row1_1_times = row2_1_times;
						i = count1;
						break;
					} else {
						count1++;
					}
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] bank = { "011001", "000000", "010100", "001000" };
		System.out.println(numberOfBeams(bank));

	}

}
