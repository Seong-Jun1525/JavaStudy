package ch30.domain.userinfo.dao;

import ch30.domain.userinfo.UserInfo;

public interface UserInfoDao {
	void insertUserInfo(UserInfo userinfo);
	void updateUserInfo(UserInfo userinfo);
	void deleteUserInfo(UserInfo userinfo);
}
