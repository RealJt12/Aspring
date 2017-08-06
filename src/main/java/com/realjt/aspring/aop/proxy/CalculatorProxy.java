package com.realjt.aspring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.realjt.aspring.aop.Calculator;

/**
 * 动态代理
 *
 * @author realjt
 */
public class CalculatorProxy
{
	private Calculator calculator;

	public Calculator getCalculatorProxy()
	{
		ClassLoader classLoader = calculator.getClass().getClassLoader();

		Class<?>[] classes = new Class<?>[] { Calculator.class };

		InvocationHandler invocationHandler = new InvocationHandler()
		{
			/**
			 * @param proxy
			 *            正在返回的代理对象，一般情况下invoke方法中不使用该对象
			 * @param method
			 *            正在被调用的方法
			 * @param args
			 *            调用方法时，传入的参数
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable
			{
				// 打印前置日志
				System.out.println("Calculator " + method.getName()
						+ " bengin with " + Arrays.asList(args));

				// 执行方法
				Object result = method.invoke(calculator, args);

				// 打印后置日志
				System.out.println("Calculator " + method.getName()
						+ " end with " + result);

				return result;
			}
		};

		return (Calculator) Proxy.newProxyInstance(classLoader, classes,
				invocationHandler);
	}

	public Calculator getCalculator()
	{
		return calculator;
	}

	public void setCalculator(Calculator calculator)
	{
		this.calculator = calculator;
	}

}
