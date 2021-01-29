package com.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.User.Bean.NewUserBean;
import com.User.Bean.UserBean;
import com.User.Service.UserService;

@Controller
public class UserOperationController {

	
	@Autowired
	private UserService service;
	
	@PostMapping("/getUserList")
	@ResponseBody
	public List<UserBean> userList() {
		List<UserBean> beanList = null;
		try {
			beanList = service.getUserList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(beanList);
		return beanList; 
	}
	
	
	@PostMapping("/deleteRecord")
	@ResponseBody
	public String deleteRecord(@RequestParam int id) {
		String status= "";
		try {
			status = service.deleteRecord(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status; 
	}
	
	
	@PostMapping("/updateUserInfo")
	@ResponseBody
	public String deleteRecord(@ModelAttribute UserBean bean) {
		String status= "";
		try {
			System.out.println(bean);
			status = service.updateUserInfo(bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status; 
	}
	
	@PostMapping("/addUserInfo")
	@ResponseBody
	public String addUserInfo(@ModelAttribute NewUserBean bean) {
		String status= "";
		try {
			System.out.println(bean);
			status = service.addUserInfo(bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status; 
	}
}
