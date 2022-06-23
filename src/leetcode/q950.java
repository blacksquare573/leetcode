package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class q950 {

	public static int[] deckRevealedIncreasing(int[] deck) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < deck.length; i++) {
			index.add(i);
		}
		int[] newDeck = new int[deck.length];
		Arrays.sort(deck);
		for (int i = 0; i < deck.length; i++) {
			newDeck[index.get(0)] = deck[i];
			if (index.size() > 1) {// 17~21模拟取牌时的位置变化
				int add = index.get(1);
				index.remove(0);
				index.add(add);
				index.remove(0);
			}
		}
		return newDeck;
	}

	public static void main(String[] args) {
		int[] deck = { 17, 13, 11, 2, 3, 5, 7 };
		System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));

	}

}
