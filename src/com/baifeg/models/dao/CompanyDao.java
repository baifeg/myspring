package com.baifeg.models.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.baifeg.models.entity.Company;

public class CompanyDao
{
	private static HibernateTemplate template;

	public CompanyDao()
	{
		template = new HibernateTemplate(getSessionFactory());
	}

	private SessionFactory getSessionFactory()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		((ClassPathXmlApplicationContext) context).close();
		return sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public List<Company> findAll()
	{
		return (List<Company>) template.find("select * from `Company`");
	}
}
