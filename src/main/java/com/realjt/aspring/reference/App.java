package com.realjt.aspring.reference;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean之间引用
 * 
 * @author realjt
 */
public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/reference.spring.xml");

		Person person0 = (Person) applicationContext.getBean("person0");
		System.out.println(person0);

		Person person1 = (Person) applicationContext.getBean("person1");
		System.out.println(person1);

		Person person2 = (Person) applicationContext.getBean("person2");
		System.out.println(person2);

		Person person3 = (Person) applicationContext.getBean("person3");
		System.out.println(person3);

		Person person4 = (Person) applicationContext.getBean("person4");
		System.out.println(person4);

		Person person5 = (Person) applicationContext.getBean("person5");
		System.out.println(person5);

		Person person6 = (Person) applicationContext.getBean("person6");
		System.out.println(person6);

		Person person7 = (Person) applicationContext.getBean("person7");
		System.out.println(person7);

		applicationContext.close();
	}

}