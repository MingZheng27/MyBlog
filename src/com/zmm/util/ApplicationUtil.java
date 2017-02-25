package com.zmm.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * spring���Զ�ע��ApplicationContextͨ����̬�������ɻ��Bean����
 * @author dell
 *
 */
public class ApplicationUtil implements ApplicationContextAware{
	
	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		ApplicationUtil.applicationContext = arg0;
		
	}
	
	public static Object getBean(String name){
		return applicationContext.getBean(name);
	}

}
