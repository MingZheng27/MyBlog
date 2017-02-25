package com.zmm.action;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.zmm.bean.Images;
import com.zmm.daoimpl.FileDaoImpl;
import com.zmm.util.ApplicationUtil;

public class GetImageAction extends ActionSupport {

	private List<Images> list = new ArrayList<Images>();

	@Override
	public String execute() throws Exception {
		try{
			FileDaoImpl fileDaoImpl = (FileDaoImpl) ApplicationUtil.getBean("FileDaoImpl");
			HttpServletRequest req = ServletActionContext.getRequest();
//			String s = InetAddress.getLocalHost().getHostAddress(); ªÒ»°ipµÿ÷∑
//			System.out.println(s);
			int num;
			if (req.getParameter("num") == null){
				num = 0;
			}else{
				num = Integer.valueOf(req.getParameter("num"));
			}
			list = fileDaoImpl.list(num);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failed";
		}
	}

	@JSON(name="list")
	public List<Images> getList() {
		return list;
	}

	public void setList(List<Images> list) {
		this.list = list;
	}



}
