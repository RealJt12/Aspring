package com.realjt.aspring.transaction;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 声明式事务
 * 
 * @author RealJt
 */
public class App
{
	private static ConfigurableApplicationContext applicationContext;

	@BeforeClass
	public static void init()
	{
		applicationContext = new ClassPathXmlApplicationContext("spring/transaction.spring.xml");
	}

	@Test
	public void test()
	{
		System.out.println(applicationContext);
	}

}