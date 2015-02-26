package com.baifeg.models.dao;

import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.baifeg.models.entity.Company;

public class CompanyDaoTest
{

	@Test
	public void test()
	{
		try
		{
			Field field = CompanyDao.class.getDeclaredField("template");
			field.setAccessible(true);
			HibernateTemplate template = (HibernateTemplate) field.get(new CompanyDao());
			String result = template.execute(new HibernateCallback<String>()
			{

				@Override
				public String doInHibernate(Session session) throws HibernateException,
						SQLException
				{
					Query query = session.createQuery("select id from Company");
					String result = query.uniqueResult().toString();
					return result;
				}
			});
			System.out.println("=========> " + result);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testFindAll()
	{
		try
		{
			List<Company> findAll = new CompanyDao().findAll();
			for (Company string : findAll)
			{
				System.out.println("========> " + string);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void testAdd()
	{
		fail("Not yet implemented");
	}

}
