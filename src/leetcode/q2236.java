package leetcode;

public class q2236 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 4;
		int num3 = 6;

		q2236_class_TreeNode test = new q2236_class_TreeNode();
		test.val = num1;
		test.left.val = num2;
		test.right.val = num3;

		System.out.print(test.checkTree(test));

	}

}
