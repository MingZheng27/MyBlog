package com.zmm.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zmm.bean.Articles;
import com.zmm.bean.Images;
import com.zmm.dao.Dao;

public class FileDaoImpl implements Dao<Images> {

	private SessionFactory sessionFactory;
	private Session session;
	
	@Override
	public boolean save(Images t) {
		try{
			//session = sessionFactory.openSession();
			session = sessionFactory.getCurrentSession();
			//Transaction ran = session.beginTransaction();
			session.save(t);
			//System.out.println(session.isOpen());
			//tran.commit();
			//session.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Images get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Images> list(int num) {
		//session = sessionFactory.openSession();
		session = sessionFactory.getCurrentSession();
		String hql = "select count(*) from Images";
		int size = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
		String hqlm = "from Images where id <= " + (size-10*num) + "and id > " + (size-10*(num + 1) + " order by id desc"); 
		Query q = session.createQuery(hqlm);
		List<Images> list = q.list();
		//session.close();
		return list;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNum() {
		//session = sessionFactory.openSession();
		session = sessionFactory.getCurrentSession();
		String hql = "select count(*) from Images";
		int size = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
		//session.close();
		return size;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



}
