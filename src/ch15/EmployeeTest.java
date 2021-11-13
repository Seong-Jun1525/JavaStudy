package ch15;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLim = new Employee();
		employeeLim.setEmployeeName("Lim");
		
		System.out.println(Employee.getSerialNum());
//		System.out.println(employeeLim.serialNum);
		// 노란밑줄이 있는 이유
		// serialNum는 클래스변수이다
		// 인스턴스의 생성하고는 상관없이 사용할 수 있다
		// 즉, serialNum은 클래스변수이기 때문에 클래스이름으로 참조해서 사용하라는 의미
		
		Employee employeeWoo = new Employee();
		employeeWoo.setEmployeeName("Woo");
//		Employee.serialNum++;
//		employeeWoo.serialNum++;
		
		System.out.println(employeeLim.getEmployeeName() + "님의 사번 : " + employeeLim.getEmployeeId());
		System.out.println(employeeWoo.getEmployeeName() + "님의 사번 : " + employeeWoo.getEmployeeId());
	}
}