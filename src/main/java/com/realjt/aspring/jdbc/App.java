package com.realjt.aspring.jdbc;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args) throws SQLException
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/jdbc.spring.xml");

		DataSource dataSource = (DataSource) applicationContext
				.getBean("dataSource");

		System.out.println(dataSource.getConnection() + "\n");

		applicationContext.close();
	}

}