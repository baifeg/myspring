package com.baifeg.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.baifeg.models.dao.CommonDao;
import com.baifeg.models.dao.DaoFactory;
import com.baifeg.models.entity.Company;

@Transactional
public class CompanyService
{
	private final CommonDao<Company> dao;

	public CompanyService()
	{
		dao = DaoFactory.getDao(Company.class);
	}

	public List<Company> getAllCompanyList()
	{
		return dao.queryAll();
	}
}
