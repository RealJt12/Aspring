package com.realjt.aspring.generic;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T>
{
	@Autowired
	private BaseRepository<T> baseRepository;

	public BaseRepository<T> getUserRepository()
	{
		return baseRepository;
	}

	public void setUserRepository(BaseRepository<T> baseRepository)
	{
		this.baseRepository = baseRepository;
	}

	public void add()
	{
		System.out.println("UserService<T> add " + baseRepository);
	}

}
