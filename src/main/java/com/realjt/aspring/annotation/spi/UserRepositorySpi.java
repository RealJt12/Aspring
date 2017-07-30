package com.realjt.aspring.annotation.spi;

import org.springframework.stereotype.Repository;

import com.realjt.aspring.annotation.UserRepository;

@Repository("userRepository")
public class UserRepositorySpi implements UserRepository
{
	@Override
	public void add()
	{
		System.out.println("UserRepositorySpi add");
	}

}
