package leetcode;

public class q1108 {

	public String defangIPaddr(String address) {
		String newIP = address.replace(".", "[.]");
		return newIP;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
