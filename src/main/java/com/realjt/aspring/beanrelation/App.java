package com.realjt.aspring.beanrelation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * parent depends-on
 * 
 * @author realjt
 */
public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/beanrelation.spring.xml");

		Phone phone = (Phone) applicationContext.getBean("MX4");
		System.out.println(phone);

		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);

		applicationContext.close();
	}

}