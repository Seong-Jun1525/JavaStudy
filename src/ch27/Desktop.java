package ch27;

public class Desktop extends Computer {

	// Desktop 클래스를 abstract를 사용하여 추상 클래스로 선언할 수 있습니다.
	// 하지만 추상 클래스로 선언하게 되면 이 클래스는 new를 할 수 없습니다.
	// 추상 클래스는 상속을 하기 위해서 만든 클래스입니다.
	// 추상 클래스안에 구현하는 메서드들은 일부는 구현을 할 수 있도 있고 일부는 구현을 안할 수도 있습니다. 어떤 경우는 다 안할 수도 있습니다.
	// 이 클래스는 상속만을 하기 위한 클래스입니다.
	
	@Override
	public void display() {
		System.out.println("Desktop display");		
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
}
