package com.realjt.aspring.spel;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext appcApplicationContext = new ClassPathXmlApplicationContext(
				"spring/spel.spring.xml");

		Car car = (Car) appcApplicationContext.getBean("car");
		System.out.println(car);

		Person person = (Person) appcApplicationContext.getBean("person");
		System.out.println(person);

		appcApplicationContext.close();
	}

}