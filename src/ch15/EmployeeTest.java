package ch15;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLim = new Employee();
		employeeLim.setEmployeeName("Lim");
		
		System.out.println(Employee.getSerialNum());
//		System.out.println(employeeLim.serialNum);
		// ��������� �ִ� ����
		// serialNum�� Ŭ���������̴�
		// �ν��Ͻ��� �����ϰ�� ������� ����� �� �ִ�
		// ��, serialNum�� Ŭ���������̱� ������ Ŭ�����̸����� �����ؼ� ����϶�� �ǹ�
		
		Employee employeeWoo = new Employee();
		employeeWoo.setEmployeeName("Woo");
//		Employee.serialNum++;
//		employeeWoo.serialNum++;
		
		System.out.println(employeeLim.getEmployeeName() + "���� ��� : " + employeeLim.getEmployeeId());
		System.out.println(employeeWoo.getEmployeeName() + "���� ��� : " + employeeWoo.getEmployeeId());
	}
}