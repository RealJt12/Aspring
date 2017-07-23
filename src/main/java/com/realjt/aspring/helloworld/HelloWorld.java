package com.realjt.aspring.helloworld;

/**
 * helloworld
 * 
 * @author realjt
 */
public class HelloWorld
{
	private String name;
	
	public HelloWorld()
	{
		System.out.println("HelloWorld Constructor");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "HelloWorld [name=" + name + "]";
	}

}