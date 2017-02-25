package com.zmm.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.zmm.bean.Articles;
import com.zmm.daoimpl.ArticleDaoImpl;
import com.zmm.util.ApplicationUtil;

public class GetArticleAction extends ActionSupport{

	Articles article;

	@Override
	public String execute() throws Exception {
		try{
			ArticleDaoImpl articleDaoImpl = (ArticleDaoImpl)ApplicationUtil.getBean("ArticleDaoImpl");
			int id = Integer.valueOf(ServletActionContext.getRequest().getParameter("id"));
			article = articleDaoImpl.get(id);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failed";
		}
	}

	@JSON(name="article")
	public Articles getArticle() {
		return article;
	}

	public void setArticle(Articles article) {
		this.article = article;
	}



}
