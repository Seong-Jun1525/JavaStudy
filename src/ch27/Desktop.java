package ch27;

public class Desktop extends Computer {

	// Desktop Ŭ������ abstract�� ����Ͽ� �߻� Ŭ������ ������ �� �ֽ��ϴ�.
	// ������ �߻� Ŭ������ �����ϰ� �Ǹ� �� Ŭ������ new�� �� �� �����ϴ�.
	// �߻� Ŭ������ ����� �ϱ� ���ؼ� ���� Ŭ�����Դϴ�.
	// �߻� Ŭ�����ȿ� �����ϴ� �޼������ �Ϻδ� ������ �� �� �ֵ� �ְ� �Ϻδ� ������ ���� ���� �ֽ��ϴ�. � ���� �� ���� ���� �ֽ��ϴ�.
	// �� Ŭ������ ��Ӹ��� �ϱ� ���� Ŭ�����Դϴ�.
	
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
