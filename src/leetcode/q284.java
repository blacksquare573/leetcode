package leetcode;

import java.util.Iterator;

public class q284 {

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
	    this.num=iterator.next();
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return num;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer next = num;
		if (iterator.hasNext()) {
			num = iterator.next();
		} else {
			num = null;
		}
		return next;
	}

	@Override
	public boolean hasNext() {
		if (num != null) {
			return true;
		} else {
			return false;
		}
	}

	Iterator<Integer> iterator;
	Integer num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
