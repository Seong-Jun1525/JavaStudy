package review3;

public class CarFatory {
	private static CarFatory instance = new CarFatory();
	
	private CarFatory() {
		
	}
	
	public static CarFatory getInstance() {
		if (instance == null) {
			instance = new CarFatory();
		}
		
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		
		return car;
	}

}
