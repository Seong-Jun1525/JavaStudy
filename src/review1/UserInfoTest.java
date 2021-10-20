package review1;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userInfo1 = new UserInfo();
		
		userInfo1.userName = "Tomas";
		userInfo1.userHeight = 180;
		userInfo1.userWeight = 78;
		userInfo1.userAge = 37;
		userInfo1.userSex = "³²¼º";
		
		userInfo1.showUserInfo();
	}

}
