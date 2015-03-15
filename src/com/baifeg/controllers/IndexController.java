package com.baifeg.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
	@RequestMapping("/")
	public String index()
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (null == auth)
			return "Not login yet!";

		String username = auth.getName();
		return "Hello, " + username + "!";
	}
}
