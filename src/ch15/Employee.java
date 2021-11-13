package ch15;

public class Employee {
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	// 객체가 생성될 때 초기화 작업은 생성자에서 해준다
	public Employee() {
		serialNum++;
		// 이 변수는 공유x.
		// 이 변수를 바로 사번아이디로 할 수 없는 이유
		// 이 변수는 모든 인스턴스가 공유하기 때문
		// 그래서 멤버변수에 복사를 한다
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		int i = 0; // 지역 변수는 사용 가능
//		employeeName = "Lim"; // error : 이 메서드(getSerialNum())이 불려지는 시점에 employeeName이 없을 수 도 있기 때문이다 즉 static 메서드 안에서는 일반 멤버변수를 사용할 수 없다
		return serialNum;
	}

	public int getEmployeeId() {
//		serialNum = 1000; // 일반 메서드 안에서는 static변수를 사용해도 아무 문제가 없다 이유는 메모리 문제이다 로드될때 메모리가 이미 있기 때문이다 
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}