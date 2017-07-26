package com.realjt.aspring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean后置处理器，不需要声明bean的id，IOC容器自动识别
 * 
 * @author realjt
 */
public class LifeCyclePostProcessor implements BeanPostProcessor
{
	/**
	 * init 之前被调用
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanId)
			throws BeansException
	{
		System.out.println("beforce init BeanPostProcessor " + bean + " "
				+ beanId);

		return bean;
	}

	/**
	 * init 之后被调用
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanId)
			throws BeansException
	{
		System.out.println("after init BeanPostProcessor " + bean + " "
				+ beanId);

		return bean;
	}

}
