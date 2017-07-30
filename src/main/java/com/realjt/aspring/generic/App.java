package com.realjt.aspring.generic;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.realjt.aspring.generic.spi.UserService;

/**
 * 泛型依赖注入
 *
 * @author realjt
 */
public class App
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/generic.spring.xml");

		UserService userService = (UserService) applicationContext
				.getBean("userService");
		// 打印出来的是UserRepository，而不是BaseRepository
		userService.add();

		applicationContext.close();
	}

}
