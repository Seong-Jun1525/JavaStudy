package ch27;

public abstract class Computer {
	// �߻� Ŭ������ ����� ���� Ŭ����
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
