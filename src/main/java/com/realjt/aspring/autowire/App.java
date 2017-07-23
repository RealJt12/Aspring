package com.realjt.aspring.autowire;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * autowire byName byType 不够灵活
 * 
 * @author realjt
 */
public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/autowire.spring.xml");

		Person person0 = (Person) applicationContext.getBean("person0");
		System.out.println(person0);

		Person person1 = (Person) applicationContext.getBean("person1");
		System.out.println(person1);

		applicationContext.close();
	}

}