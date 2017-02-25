package com.zmm.action;

import java.sql.Timestamp;

import com.opensymphony.xwork2.ActionSupport;
import com.zmm.bean.Articles;
import com.zmm.daoimpl.ArticleDaoImpl;
import com.zmm.util.ApplicationUtil;

public class AddArticleAction extends ActionSupport{

	private String title;
	private String content;
	public static final String author = "zmm";

	@Override
	public String execute() throws Exception {
		try{
			ArticleDaoImpl articleDaoImpl = (ArticleDaoImpl)ApplicationUtil.getBean("ArticleDaoImpl");
			int size = articleDaoImpl.getNum();
			Articles art = new Articles();
			art.setAuthor(author);
			art.setContent(content);
			art.setId(size + 1);
			art.setTitle(title);
			art.setUpdatetime(new Timestamp(System.currentTimeMillis()));
			articleDaoImpl.save(art);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failed";
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
