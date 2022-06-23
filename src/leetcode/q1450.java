package leetcode;

public class q1450 {

	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int count = 0;
		for (int i = 0; i < endTime.length; i++) {
			if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
