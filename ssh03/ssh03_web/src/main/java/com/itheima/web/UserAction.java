package com.itheima.web;

import com.itheima.bean.User;
import com.itheima.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:06:06 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User model=new User();

	public User getModel() {
		return model;
	}
	
	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}
	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	public String findById(){
		System.out.println();
		model=userService.findById(model.getId());
		return SUCCESS;
	}
}
  
