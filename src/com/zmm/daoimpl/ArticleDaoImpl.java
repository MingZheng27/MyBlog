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
		//session = sessionFactory.openSession();
		session = sessionFactory.getCurrentSession();
		//Transaction tran = session.beginTransaction();
		//事务已经开启了，再开启就事务嵌套了。。。
		//Transaction tx = session.beginTransaction();
		try{
			session.save(t);
			///tx.commit();
			//System.out.println(session.isOpen());
			//tran.commit();
			//session.close();
			return true;
		}catch(Exception e){
			//tran.rollback();
			e.printStackTrace();
			//tx.rollback();
			//session.close();
			return false;
		}
	}

	@Override
	public Articles get(int id) {
		//session = sessionFactory.openSession();
		session = sessionFactory.getCurrentSession();
		Articles arti = (Articles) session.get(Articles.class, id);
		//session.close();
		return arti;
	}
	
	public Articles loadNewest(){
		//session = sessionFactory.openSession();
		session = sessionFactory.getCurrentSession();
		//System.out.println(session == null);
		String hql = "select count(*) from Articles";
		int size = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
		Articles arti = (Articles) session.get(Articles.class, size);
		//session.close();	//不要忘记！！！！
		return arti;
	}

	@Override
	public List<Articles> list(int num) {
		// TODO Auto-generated method stub
		//session = sessionFactory.openSession();
		session = sessionFactory.getCurrentSession();
//		String sql = "select count(*) from articles;";
//		Query q1 = session.createSQLQuery(sql);
		
		String hql = "select count(*) from Articles";
		int size = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
		String hqlm = "select title,id from Articles where id <= " + (size-10*num) + "and id > " + (size-10*(num + 1) + " order by id desc"); 
		Query q = session.createQuery(hqlm);
		List<Articles> list = q.list();
		//session.close();
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
		//session = sessionFactory.openSession();
		session = sessionFactory.getCurrentSession();
		String hql = "select count(*) from Articles";
		int size = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
		//session.close();
		return size;
	}
	

}
