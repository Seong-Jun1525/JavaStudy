package ch30.domain.userinfo.dao.mysql;

import ch30.domain.userinfo.UserInfo;
import ch30.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into MySQL DB userID = " + userinfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into MySQL DB userID = " + userinfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete from MySQL DB userID = " + userinfo.getUserID());
	}

}
