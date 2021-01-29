package com.User.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.User.Bean.NewUserBean;
import com.User.Bean.UserBean;

@Repository
@PropertySource("classpath:user.properties")
public class UserDaoImpl implements UserDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Environment environment;
	
	@Override
	public List<UserBean> getUserList() throws SQLException {
		List<UserBean> userList;
		try {
			userList = jdbcTemplate.query(environment.getProperty("getUserList"), new RowMapper<UserBean>() {

				@Override
				public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
					UserBean bean = new UserBean();
					bean.setName(rs.getString("firstname")+" "+rs.getString("lastname"));
					bean.setLastName(rs.getString("lastname"));
					bean.setPassword(rs.getString("password"));
					bean.setUserName(rs.getString("username"));
					bean.setId(rs.getInt("id"));
					bean.setEmail(rs.getString("email"));
					bean.setDateOfBirth(rs.getString("dateofbirth"));
					return bean;
				}
			});
		}finally {
			
		}
		return userList;
	}

	@Override
	public String deleteUser(int id) throws SQLException {

		jdbcTemplate.update(environment.getProperty("deleteUser"), id);
		
		return "User Deleted.";
	}

	@Override
	public String upateUserInfo(UserBean bean) throws SQLException {

		jdbcTemplate.update(environment.getProperty("updateRecord"), bean.getName(),bean.getLastName(),bean.getDateOfBirth(),bean.getPassword(),bean.getEmail(),bean.getUserName(),bean.getId());
		
		return "Details Updated";
	}

	@Override
	public String addUserInfo(NewUserBean bean) throws SQLException {

		jdbcTemplate.update(environment.getProperty("addRecord"), bean.getName(),bean.getLastName(),bean.getDateOfBirth(),bean.getPassword(),bean.getEmail(),bean.getUserName());
		
		return "User Added";
	}

}
