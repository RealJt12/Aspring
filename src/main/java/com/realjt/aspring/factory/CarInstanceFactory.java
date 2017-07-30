package com.realjt.aspring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法，需要创建工厂本身，在调用工厂的实例方法来返回bean的实例
 * 
 * @author realjt
 */
public class CarInstanceFactory
{
	private Map<String, Car> carMap = new HashMap<String, Car>();

	public CarInstanceFactory()
	{
		carMap.put("audi", new Car("Audi", "Shanghai", 300000));
		carMap.put("ford", new Car("Ford", "Changan", 300000));
	}

	public Car getCar(String brand)
	{
		return carMap.get(brand);
	}

}
