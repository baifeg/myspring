package com.baifeg.services;

import java.util.List;

import com.baifeg.models.dao.CommonDao;
import com.baifeg.models.dao.DaoFactory;
import com.baifeg.models.entity.Admin;

public class AdminService
{
	private final CommonDao<Admin> dao;

	public AdminService()
	{
		dao = DaoFactory.getDao(Admin.class);
	}
	public boolean authenticate(Admin admin)
	{
		List<Admin> list = dao.findAll();
		for (Admin tempAdmin : list)
		{
			if (tempAdmin.getUsername().equals(admin.getUsername())
					&& tempAdmin.getPassword().equals(admin.getPassword()))
				return true;
		}
		return false;
	}
}
