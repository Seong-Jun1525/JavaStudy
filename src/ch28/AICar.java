package ch28;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� ������ ������ ����ϴ�.");
	}

	@Override
	public void wiper() {
		
	}

	@Override
	public void washCar() { // �Ÿ޼���. �ʿ��� ��쿡 ���� Ŭ�������� ����� �޼��带 �������ؼ� ���.
		System.out.println("�ڵ� ������ �մϴ�.");
	}
}
