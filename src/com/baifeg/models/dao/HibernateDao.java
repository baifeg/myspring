package com.baifeg.models.dao;

public class HibernateDao<T>
{
	private final Class<T> clszz;

	public HibernateDao(Class<T> clszz)
	{
		this.clszz = clszz;
	}
}
