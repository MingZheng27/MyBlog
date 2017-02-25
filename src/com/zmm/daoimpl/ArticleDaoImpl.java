package com.zmm.daoimpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zmm.bean.Articles;
import com.zmm.dao.Dao;
import com.zmm.util.ApplicationUtil;

public class ArticleDaoImpl implements Dao<Articles>{
	
	SessionFactory sessionFactory;
	private Session session;
	
	public ArticleDaoImpl() {
	}
	
	@Override
	public boolean save(Articles t) {
		session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		try{
			session.save(t);
			tran.commit();
			session.close();
			return true;
		}catch(Exception e){
			tran.rollback();
			e.printStackTrace();
			session.close();
			return false;
		}
	}

	@Override
	public Articles get(int id) {
		session = sessionFactory.openSession();
		Articles arti = (Articles) session.get(Articles.class, id);
		session.close();
		return arti;
	}
	
	public Articles getNewest(){
		session = sessionFactory.openSession();
		String hql = "select count(*) from Articles";
		int size = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
		Articles arti = (Articles) session.get(Articles.class, size);
		session.close();	//²»ÒªÍü¼Ç£¡£¡£¡£¡
		return arti;
	}

	@Override
	public List<Articles> list(int num) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
//		String sql = "select count(*) from articles;";
//		Query q1 = session.createSQLQuery(sql);
		
		String hql = "select count(*) from Articles";
		int size = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
		String hqlm = "select title,id from Articles where id <= " + (size-10*num) + "and id > " + (size-10*(num + 1) + " order by id desc"); 
		Query q = session.createQuery(hqlm);
		List<Articles> list = q.list();
		session.close();
		return list;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int getNum() {
		session = sessionFactory.openSession();
		String hql = "select count(*) from Articles";
		int size = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
		session.close();
		return size;
	}
	

}
