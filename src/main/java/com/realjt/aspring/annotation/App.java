package com.realjt.aspring.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/annotation.spring.xml");

		UserRepository userRepository = (UserRepository) applicationContext
				.getBean("userRepository");
		userRepository.add();

		UserController userController = (UserController) applicationContext
				.getBean("userController");
		userController.excute();

		applicationContext.close();
	}

}
