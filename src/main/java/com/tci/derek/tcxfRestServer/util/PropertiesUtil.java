package com.tci.derek.tcxfRestServer.util;

import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;

public class PropertiesUtil implements InitializingBean{
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}


	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(properties.getProperty("dev.property.path"));
		System.out.println(properties.getProperty("util.name"));
	}
	
	
	
	
}
