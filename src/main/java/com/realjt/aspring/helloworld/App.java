package com.realjt.aspring.helloworld;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/helloworld.spring.xml");

		HelloWorld helloWorld = (HelloWorld) applicationContext
				.getBean("helloWorld");

		System.out.println(helloWorld.toString());

		applicationContext.close();
	}

}