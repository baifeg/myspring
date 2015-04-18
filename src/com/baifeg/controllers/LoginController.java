package com.baifeg.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController
{
	@RequestMapping(value = "/login", method = { RequestMethod.GET })
	public ModelAndView login(ModelMap model, HttpServletRequest request)
	{
		String referrer = request.getHeader("Referer");
		if (referrer != null)
		{
			request.getSession().setAttribute("url_prior_login", referrer);
		}
		return new ModelAndView("login");
	}

}
