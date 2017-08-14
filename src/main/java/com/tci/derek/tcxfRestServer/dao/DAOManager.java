package com.tci.derek.tcxfRestServer.dao;

import java.util.HashMap;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DAOManager implements BeanPostProcessor{

	private static DAOManager _instance = null;
	
	protected HashMap<String, DBAccess> daoBeanMap = new HashMap<String, DBAccess>();
	private DAOManager() {

	}

	public static DAOManager getInstance() {
		if (_instance == null) {
			_instance = new DAOManager();
		}
		return _instance;
	}

	public DBAccess getDAO(String name) {
		return daoBeanMap.get(name);
	}
	
	@SuppressWarnings("unchecked")
	public <T extends DBAccess> T getDAO(Class<T> daoClass) {
		return (T) daoBeanMap.get(daoClass.getSimpleName());
	}
	
	public void addDAO(String name , DBAccess dao) {
		daoBeanMap.put(name, dao);
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof DBAccess) {
			DBAccess dao = (DBAccess) bean;
			System.out.println("Got this DAO Bean: " + dao.getName());
			String name = dao.getName();
			addDAO(name, dao);
		}
		return bean;
	}
}
