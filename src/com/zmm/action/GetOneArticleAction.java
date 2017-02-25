package com.zmm.action;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.zmm.bean.Articles;
import com.zmm.daoimpl.ArticleDaoImpl;
import com.zmm.util.ApplicationUtil;

/**
 * 拿到最新文章，即首页文章
 * @author dell
 *
 */
public class GetOneArticleAction extends ActionSupport {
	
	private Articles article;
	
	@Override
	public String execute() throws Exception {
		try{
		ArticleDaoImpl articleDaoImpl = (ArticleDaoImpl) ApplicationUtil.getBean("ArticleDaoImpl");
		article = articleDaoImpl.getNewest();
		return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failed";
		}
	}

	@JSON(name="details")
	public Articles getArticle() {
		return article;
	}

	public void setArticle(Articles article) {
		this.article = article;
	}
	
	
	
}
