package com.baifeg.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.baifeg.models.spring.ViewFactory;

@RestController
public class IndexController
{
	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request)
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (null != auth)
		{
			request.getSession().setAttribute("username", auth.getName());

		}
		return ViewFactory.render("index");
	}
}
