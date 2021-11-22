package ch28;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞으로 스스로 멈춥니다.");
	}

	@Override
	public void wiper() {
		
	}

	@Override
	public void washCar() { // 훅메서드. 필요한 경우에 상위 클래스에서 써놓은 메서드를 재정의해서 사용.
		System.out.println("자동 세차를 합니다.");
	}
}
