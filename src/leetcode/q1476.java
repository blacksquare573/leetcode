package leetcode;

public class q1476 {

	/**
	 * Your SubrectangleQueries object will be instantiated and called as such:
	 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
	 * obj.updateSubrectangle(row1,col1,row2,col2,newValue); int param_2 =
	 * obj.getValue(row,col);
	 */
	int[][] rectangle;

	public SubrectangleQueries(int[][] rectangle) {
		this.rectangle=rectangle;
    }

	public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
		for (int i = row1; i < row2 + 1; i++) {
			for (int j = col1; j < col2 + 1; j++) {
				rectangle[i][j] = newValue;
			}
		}
	}

	public int getValue(int row, int col) {
		int getValue = rectangle[row][col];
		return getValue;
	}

	public static void main(String[] args) {

	}

}
