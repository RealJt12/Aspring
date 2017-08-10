package com.realjt.aspring.jdbc.config;

import org.springframework.util.StringUtils;

/**
 * 使用静态方法得到配置项，减少代码侵入
 *
 * @author realjt
 */
public class Config
{
	private static Config config = new Config();

	private static PropertyConfigurer propertyConfigurer;

	private Config()
	{

	}

	public static Config getInstance(PropertyConfigurer propertyConfigurer)
	{
		Config.propertyConfigurer = propertyConfigurer;

		return config;
	}

	public static String getString(String key)
	{
		if (!StringUtils.isEmpty(key))
		{
			return (String) propertyConfigurer.getProperties().get(key);
		}

		return null;
	}

	public static String getString(String key, String defaultValue)
	{
		if (!StringUtils.isEmpty(key))
		{
			return propertyConfigurer.getProperties().getProperty(key,
					defaultValue);
		}

		return null;
	}

}
