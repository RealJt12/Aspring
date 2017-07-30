package com.realjt.aspring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法
 * 
 * @author realjt
 */
public class CarStaticFactory
{
	private static Map<String, Car> carMap = new HashMap<String, Car>();

	static
	{
		carMap.put("audi", new Car("Audi", "Shanghai", 300000));
		carMap.put("ford", new Car("Ford", "Changan", 300000));
	}

	public static Car getCar(String brand)
	{
		Car car = carMap.get(brand);

		return car;
	}

}