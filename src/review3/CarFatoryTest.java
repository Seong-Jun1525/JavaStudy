package review3;

public class CarFatoryTest {

	public static void main(String[] args) {
		CarFatory fatory = CarFatory.getInstance();
		
		Car mySonata = fatory.createCar();
		Car yourSonata = fatory.createCar();
		
		System.out.println(mySonata.getCarNum()); // 10001 출력
		System.out.println(yourSonata.getCarNum()); // 10002 출력
	}

}