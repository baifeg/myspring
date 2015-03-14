package com.baifeg.models.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.baifeg.models.spring.SpringHelper;

public class CommonDao<T>
{
	private final Class<T> clazz;
	private static HibernateTemplate template;

	public CommonDao(Class<T> clazz)
	{
		this.clazz = clazz;
		template = new HibernateTemplate(SpringHelper.getSessionFactory());
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll()
	{
		String name = clazz.getSimpleName();
		return (List<T>) template.find("from " + name);
	}

	public void add(T t)
	{
		template.save(t);
	}

	public void delete(T t)
	{
		template.delete(t);
	}
}
