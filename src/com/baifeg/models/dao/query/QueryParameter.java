package com.baifeg.models.dao.query;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface QueryParameter
{
	public String field = "";
}
