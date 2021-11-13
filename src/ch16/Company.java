package ch16;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() { // static���� �����ؾ��� �ܺο��� Ŭ���� �̸����� ȣ���� �� �ִ�
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}