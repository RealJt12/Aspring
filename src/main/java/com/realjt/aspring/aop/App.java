package com.realjt.aspring.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop
 *
 * @author realjt
 */
public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/aop.annotation.spring.xml");

		Calculator calculator = applicationContext.getBean(Calculator.class);

		int result = calculator.add(12, 20);
		System.out.println("result = " + result);

		result = calculator.div(10, 0);

		applicationContext.close();
	}

}
