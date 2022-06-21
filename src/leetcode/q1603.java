package leetcode;

public class q1603 {

	int big;
	int medium;
	int small;

	public ParkingSystem(int big, int medium, int small) {
		this.big=big;
		this.medium=medium;
		this.small=small;
    }

	public boolean addCar(int carType) {
		boolean addCar = false;
		switch (carType) {
		case 1: {
			if (big - 1 < 0) {
				addCar = false;
			} else {
				big--;
				addCar = true;
			}
			break;

		}
		case 2: {
			if (medium - 1 < 0) {
				addCar = false;
			} else {
				medium--;
				addCar = true;
			}
			break;
		}
		case 3: {
			if (small - 1 < 0) {
				addCar = false;
			} else {
				small--;
				addCar = true;
			}
			break;
		}

		}
		return addCar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
