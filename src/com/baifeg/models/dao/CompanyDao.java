package com.baifeg.models.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.baifeg.models.entity.Company;
import com.baifeg.models.spring.SpringHelper;

public class CompanyDao
{
	private static HibernateTemplate template;

	public CompanyDao()
	{
		template = new HibernateTemplate(SpringHelper.getSessionFactory());
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
