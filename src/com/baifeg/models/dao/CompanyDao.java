package com.baifeg.models.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.baifeg.models.entity.Company;
import com.baifeg.models.spring.SpringHelper;

public class CompanyDao
{
	private static HibernateTemplate template;

	public CompanyDao()
	{
		template = new HibernateTemplate(getSessionFactory());
	}

	private static SessionFactory getSessionFactory()
	{
		ApplicationContext context = SpringHelper.getApplicationContext();
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		// Don't close context before execute sql
		// TODO refine this code
		// ((ClassPathXmlApplicationContext) context).close();
		return sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public List<Company> findAll()
	{
		return (List<Company>) template.find("from Company");
	}

	public void add(Company company)
	{
		template.save(company);
	}
}
