package ch12;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
//	public �̳� �������������� ���� ����ϴ� ��ó�� �� �����ؼ� ����ϸ�
//	��������� �߸��� ������� ��ü�� �߸� ���Ǵ� ���� �����ϰ� �ǰ� ��ü�� � ���ҿ����ؼ� ������ ���� �� �ִ�.
//	�׷��� private�� ���� �޼��忡�� ��� ���ְ� �Ǹ� �������� ������ ������ ��������.
	
	private boolean isValid; // default ������ false�� ���´�
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� �ʴ� ��¥ �Դϴ�.");
		}
	}
	
	public boolean getIsValid() {
		return isValid;
		// isValid�� ���� �������� ���� ���� ������ ���ؼ� ��������. �׷��� isValid�� ���� set�޼���� �������� �ʴ´�.
		// �̷� ��찡 read-only �Ӽ�
	}
}
