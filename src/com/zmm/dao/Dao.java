package com.zmm.dao;

import java.util.List;

public interface Dao<T> {
	
	public boolean save(T t);
	
	public T get(int id);
	
	public List<T> list(int num);
	
	public boolean delete(int id);
	
	public int getNum();
	
}
