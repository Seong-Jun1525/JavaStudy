package ch15;

public class Employee {
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	// ��ü�� ������ �� �ʱ�ȭ �۾��� �����ڿ��� ���ش�
	public Employee() {
		serialNum++;
		// �� ������ ����x.
		// �� ������ �ٷ� ������̵�� �� �� ���� ����
		// �� ������ ��� �ν��Ͻ��� �����ϱ� ����
		// �׷��� ��������� ���縦 �Ѵ�
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		int i = 0; // ���� ������ ��� ����
//		employeeName = "Lim"; // error : �� �޼���(getSerialNum())�� �ҷ����� ������ employeeName�� ���� �� �� �ֱ� �����̴� �� static �޼��� �ȿ����� �Ϲ� ��������� ����� �� ����
		return serialNum;
	}

	public int getEmployeeId() {
//		serialNum = 1000; // �Ϲ� �޼��� �ȿ����� static������ ����ص� �ƹ� ������ ���� ������ �޸� �����̴� �ε�ɶ� �޸𸮰� �̹� �ֱ� �����̴� 
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