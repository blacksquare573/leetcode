package leetcode;

public class q2079 {

	public int wateringPlants(int[] plants, int capacity) {
		int step = 1;
		int water = capacity - plants[0];
		for (int i = 1; i < plants.length; i++) {
			if (water < plants[i]) {
				water = capacity;
				step += i + i + 1;
				water -= plants[i];
			} else {
				step += 1;
				water -= plants[i];
			}
		}
		return step;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
