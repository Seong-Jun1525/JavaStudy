package ch27;

public abstract class Computer {
	// 추상 클래스는 상속을 위한 클래스
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
