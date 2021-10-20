package review1;

public class UserInfo {
	public String userName;
	public int userHeight;
	public int userWeight;
	public int userAge;
	public String userSex;
	
	public void showUserInfo() {
		if (userSex == "남성" || userSex == "여성") {
			System.out.println("키가 " + userHeight + "이고 몸무게가 " + userWeight + "킬로인 " + userSex + "이 있습니다. 이름은 " + userName + "이고 나이는 " + userAge + "세 입니다.");
		}
		else {
			System.out.println("성별이 잘못 작성되었습니다.");
		}
	}
}
