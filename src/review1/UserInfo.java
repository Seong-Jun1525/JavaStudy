package review1;

public class UserInfo {
	public String userName;
	public int userHeight;
	public int userWeight;
	public int userAge;
	public String userSex;
	
	public void showUserInfo() {
		if (userSex == "����" || userSex == "����") {
			System.out.println("Ű�� " + userHeight + "�̰� �����԰� " + userWeight + "ų���� " + userSex + "�� �ֽ��ϴ�. �̸��� " + userName + "�̰� ���̴� " + userAge + "�� �Դϴ�.");
		}
		else {
			System.out.println("������ �߸� �ۼ��Ǿ����ϴ�.");
		}
	}
}
