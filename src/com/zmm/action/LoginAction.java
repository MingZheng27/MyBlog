package com.zmm.action;

import java.net.InetAddress;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String username;
	private String password;
	
	@Override
	public String execute() throws Exception {
		try{
		if (username.equals("zmm")&&password.equals("123456")){
			ServletActionContext.getRequest().getSession().setAttribute("username", "zmm");
			return "success";
		}else{
			ServletActionContext.getRequest().setAttribute("info", "用户名或密码错误");
			return "failed";
		}
		}catch(Exception e){
			e.printStackTrace();
			return "failed";
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
