package review3;

public class Car {

	private static int serialNum = 10000;
	
	private int carId;
	
	public int getCarNum() {
		serialNum++;
		return serialNum;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public static int getSerialNum() {
		return serialNum;
	}
}
