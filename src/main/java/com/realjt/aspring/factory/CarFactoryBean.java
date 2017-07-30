package com.realjt.aspring.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * 通过实现FactoryBean接口，来配置Car
 *
 * @author realjt
 */
public class CarFactoryBean implements FactoryBean<Car>
{
	private String brand;

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception
	{
		return new Car(brand, "Shanghai", 400000);
	}

	@Override
	public Class<?> getObjectType()
	{
		return Car.class;
	}

	@Override
	public boolean isSingleton()
	{
		return true;
	}

}
