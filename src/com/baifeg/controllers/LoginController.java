package com.baifeg.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.baifeg.models.entity.Admin;
import com.baifeg.services.AdminService;

@RestController
public class LoginController
{
	@RequestMapping(value = "/login", method = { RequestMethod.GET })
	public ModelAndView login()
	{
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public Boolean authenticate(@ModelAttribute Admin admin, Model model)
	{
		return new AdminService().authenticate(admin);
	}
}
