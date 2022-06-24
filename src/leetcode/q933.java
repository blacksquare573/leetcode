package leetcode;

import java.util.ArrayList;

public class q933 {

	public RecentCounter() {	
		this.requests.removeAll(requests);
    }

	public int ping(int t) {
		requests.add(t);
		int sum = 0;
		for (int i = 0; i < requests.size(); i++) {
			if (requests.get(i) <= t && requests.get(i) >= t - 3000) {
				sum++;
			}
		}
		return sum;
	}

	ArrayList<Integer> requests = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
