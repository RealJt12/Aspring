package com.realjt.aspring.factory;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 静态工厂方法和实例工厂方法
 *
 * @author realjt
 */
public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/factory.spring.xml");

		Car car0 = (Car) applicationContext.getBean("car0");
		System.out.println(car0);

		Car car1 = (Car) applicationContext.getBean("car1");
		System.out.println(car1);
		
		Car car2 = (Car) applicationContext.getBean("car2");
		System.out.println(car2);

		applicationContext.close();
	}

}
