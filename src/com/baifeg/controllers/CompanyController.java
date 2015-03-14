package com.baifeg.controllers;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.baifeg.models.entity.Company;
import com.baifeg.services.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController
{
	@RequestMapping("/list.do")
	public ModelAndView list()
	{
		List<Company> all = new CompanyService().getAllCompanyList();
		LinkedHashMap<String, Object> model = new LinkedHashMap<String, Object>();
		model.put("companyList", all);
		return new ModelAndView("company/list", model);
	}

}
