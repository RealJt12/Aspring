package com.realjt.aspring.autowire;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person
{
	private String name;

	private int age;

	private Car car;

	private List<Phone> phones;

	private Map<String, Phone> phoneMap;

	private Properties properties;

	public Person()
	{

	}

	public Person(String name, int age, Car car)
	{
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public Car getCar()
	{
		return car;
	}

	public void setCar(Car car)
	{
		this.car = car;
	}

	public List<Phone> getPhones()
	{
		return phones;
	}

	public void setPhones(List<Phone> phones)
	{
		this.phones = phones;
	}

	public Map<String, Phone> getPhoneMap()
	{
		return phoneMap;
	}

	public void setPhoneMap(Map<String, Phone> phoneMap)
	{
		this.phoneMap = phoneMap;
	}

	public Properties getProperties()
	{
		return properties;
	}

	public void setProperties(Properties properties)
	{
		this.properties = properties;
	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + ", car=" + car
				+ ", phones=" + phones + ", phoneMap=" + phoneMap
				+ ", properties=" + properties + "]";
	}

}