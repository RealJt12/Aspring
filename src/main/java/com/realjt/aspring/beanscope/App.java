package com.realjt.aspring.beanscope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * scope
 * 
 * @author realjt
 */
public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/beanscope.spring.xml");

		Car car0 = (Car) applicationContext.getBean("car0");
		System.out.println(car0);

		Car car1 = (Car) applicationContext.getBean("car0");
		System.out.println(car0 == car1); // 此处会相等

		Car car2 = (Car) applicationContext.getBean("car1");
		System.out.println(car2);

		Car car3 = (Car) applicationContext.getBean("car1");
		System.out.println(car2 == car3); // 此处不相等

		applicationContext.close();
	}

}