package com.baifeg.models.dao;

import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class MyTest
{
	@Test
	public void test()
	{
		String line = "I am a Super start!";

		Pattern pattern = Pattern.compile("super", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(line);
		assertTrue(matcher.find());
		String group = matcher.group();
		System.out.println("=======> " + group);

	}
}
