package com.User.Dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.User.Bean.NewUserBean;
import com.User.Bean.UserBean;

public interface UserDao {

	public List<UserBean> getUserList()throws SQLException;
	
	public String deleteUser(int id)throws SQLException;

	public String upateUserInfo(UserBean bean)throws SQLException;

	public String addUserInfo(NewUserBean bean)throws SQLException;
}
