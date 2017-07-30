package com.realjt.aspring.annotation.spi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.realjt.aspring.annotation.UserRepository;
import com.realjt.aspring.annotation.UserService;

@Service
public class UserServiceSpi implements UserService
{
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;

	@Override
	public void add()
	{
		System.out.println("UserviceSpi add");

		userRepository.add();
	}

	public UserRepository getUserRepository()
	{
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}

}
