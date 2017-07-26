package com.realjt.aspring.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/lifecycle.spring.xml");

		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);

		applicationContext.close();
	}

}