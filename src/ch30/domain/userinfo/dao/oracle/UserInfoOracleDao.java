package ch30.domain.userinfo.dao.oracle;

import ch30.domain.userinfo.UserInfo;
import ch30.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into Oracle DB userID = " + userinfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into Oracle DB userID = " + userinfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete from Oracle DB userID = " + userinfo.getUserID());
	}

}
