package com.realjt.aspring.constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/constructor.spring.xml");

		Car car0 = (Car) applicationContext.getBean("car0");
		System.out.println(car0);

		Car car1 = (Car) applicationContext.getBean("car1");
		System.out.println(car1);

		Car car2 = (Car) applicationContext.getBean("car2");
		System.out.println(car2);

		Car car3 = (Car) applicationContext.getBean("car3");
		System.out.println(car3);

		Car car4 = (Car) applicationContext.getBean("car4");
		System.out.println(car4);

		applicationContext.close();
	}

}
