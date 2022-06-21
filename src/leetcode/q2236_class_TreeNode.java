package leetcode;

public class q2236_class_TreeNode {
	int val;
	q2236_class_TreeNode left;
	q2236_class_TreeNode right;

	q2236_class_TreeNode() {
	}

	q2236_class_TreeNode(int val) {
		this.val = val;
	}

	q2236_class_TreeNode(int val, q2236_class_TreeNode left, q2236_class_TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public boolean checkTree(q2236_class_TreeNode root) {
		return root.val == (root.left.val + root.right.val);
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 4;
		int num3 = 6;
		q2236_class_TreeNode left;
		q2236_class_TreeNode right;
		q2236_class_TreeNode test = new q2236_class_TreeNode(10, left, right);

		test.val = num1;
		test.left = new left1 left();
		test.right.val = num3;

		System.out.print(test.checkTree(test));

	}
}
