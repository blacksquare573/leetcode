package leetcode;

public class q1678 {

	public String interpret(String command) {
		String newString = command.replace("()", "o").replace("(al)", "al");
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
