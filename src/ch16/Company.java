package ch16;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() { // static으로 선언해야지 외부에서 클래스 이름으로 호출할 수 있다
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}