package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Offer_2_079 {

	public List<List<Integer>> subsets(int[] nums) {
		int count = nums.length;// 计算有多少种长度的子数组
		int sum = 0;

		List<List<Integer>> subsetsList = new ArrayList<>();
		List<Integer> subsets = new ArrayList<Integer>();
		while (count > 0) {
			for (int i = 0; i < nums.length; i++) {// 不同长度的子数组需要计算的次数
				for (int j = 0; j < count; j++) {
					for (int k = 0; k < count; k++) {
						subsetsList.add(new ArrayList<Integer>(subsets));

					}
				}
			}
			count--;// 计算完一种长度的子数组后进行下一长度的计算
		}
		return sum;
	}

	public static void main(String[] args) {

	}

}
