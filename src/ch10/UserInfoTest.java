package ch10;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userSeong = new UserInfo();
		
		userSeong.userId = "s12345";
		userSeong.userPassword = "12345678";
		userSeong.userName = "Seong Jun";
		userSeong.userAddress = "¿Œ√µ";
		
		System.out.println(userSeong.showUserInfo());
		
		
		UserInfo userWoo = new UserInfo("w12345", "12341234", "Woo");
		
		System.out.println(userWoo.showUserInfo());
	}

}
