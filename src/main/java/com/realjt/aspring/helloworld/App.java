package com.realjt.aspring.helloworld;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		// IOC容器，该类中有refresh，close方法
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/helloworld.spring.xml");

		// 通过id获取bean对象
		HelloWorld helloWorld = (HelloWorld) applicationContext
				.getBean("helloWorld");

		// 通过class类型获取bean对象，不用强转，但要求容器中只有一个该类型的bean
		// HelloWorld helloWorld =
		// applicationContext.getBean(HelloWorld.class);

		System.out.println(helloWorld.toString());

		applicationContext.close();
	}

}