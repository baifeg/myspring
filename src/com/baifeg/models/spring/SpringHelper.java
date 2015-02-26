package com.baifeg.models.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelper
{
	private final static ApplicationContext context;
	static
	{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	private SpringHelper()
	{
	}
	
	public static ApplicationContext getApplicationContext()
	{
		return context;
	}
}
