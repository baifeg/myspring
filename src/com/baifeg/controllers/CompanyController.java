package com.baifeg.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baifeg.models.dao.CompanyDao;
import com.baifeg.models.entity.Company;

@RestController
@RequestMapping("/company")
public class CompanyController
{
	@RequestMapping("list")
	public List<Company> list()
	{
		return new CompanyDao().findAll();
	}
}
