package ch67;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		// ���� Ŭ�������� Default constructor�� ������
		// ���� Ŭ������ �ݵ�� �Ű������� �ִ� constructor�� super�� ��������� ȣ���ؾ���. 
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
	}
}
