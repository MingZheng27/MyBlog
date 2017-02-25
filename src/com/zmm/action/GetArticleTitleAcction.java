package com.zmm.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.zmm.bean.Articles;
import com.zmm.daoimpl.ArticleDaoImpl;
import com.zmm.util.ApplicationUtil;

public class GetArticleTitleAcction extends ActionSupport{

	List<Articles> list = new ArrayList<Articles>();

	@Override
	public String execute() throws Exception {
		try{
			ArticleDaoImpl articleDaoImpl = (ArticleDaoImpl) ApplicationUtil.getBean("ArticleDaoImpl");
			HttpServletRequest req = ServletActionContext.getRequest();
			int num;
			if (req.getParameter("num") == null){
				num = 0;
			}else{
				num = Integer.valueOf(req.getParameter("num"));
			}
			list = articleDaoImpl.list(num);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failed";
		}
	}

	@JSON(name="list")
	public List<Articles> getList() {
		return list;
	}

	public void setList(List<Articles> list) {
		this.list = list;
	}



}
