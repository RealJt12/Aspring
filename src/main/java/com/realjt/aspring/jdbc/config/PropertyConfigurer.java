package com.realjt.aspring.jdbc.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * 继承PropertyPlaceholderConfigurer类，并配置为一个bean
 *
 * @author realjt
 */
public class PropertyConfigurer extends PropertyPlaceholderConfigurer
{
	private Properties properties;

	@Override
	protected Properties mergeProperties() throws IOException
	{
		// 通过mergeProperties()方法，把配置保存下来
		properties = super.mergeProperties();

		return properties;
	}

	public Properties getProperties()
	{
		return properties;
	}

	public void setProperties(Properties properties)
	{
		this.properties = properties;
	}

}
