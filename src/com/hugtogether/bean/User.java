package com.hugtogether.bean;

import java.io.Serializable;

/**  
* @Title:User.java
* @Package:com.hugtogether.bean
* @Description: TODO(用户实体)
* @author LuoFuYun  
* @date 2014年12月30日 下午5:34:41
* @version 0.0.1-SNAPSHOT  
*/ 
public class User implements Serializable {
	private static final long serialVersionUID = -4517944185378137924L;
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
