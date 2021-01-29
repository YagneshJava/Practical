package com.User.Service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Bean.NewUserBean;
import com.User.Bean.UserBean;
import com.User.Dao.UserDao;

@Service
public class UserService {

	
	@Autowired
	UserDao dao;
	
	
	public List<UserBean> getUserList() throws SQLException{
		List<UserBean> list;
		try {
			list = dao.getUserList();
		} finally {

		}
		return list;
	}
	
	public String deleteRecord(int id) throws SQLException {
		String result;
		try {
			result = dao.deleteUser(id);
		}finally {
			
		}
		
		return result;
		
	}

	public String updateUserInfo(UserBean bean) throws SQLException {
		String status;
		try {
		 status =	dao.upateUserInfo(bean);
		}finally {
			
		}
		
		return status;
	}

	public String addUserInfo(NewUserBean bean) throws SQLException {
		String status;
		try {
			status = dao.addUserInfo(bean);
			}finally {
				
			}
		return status;
	}
}
