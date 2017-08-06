package com.realjt.aspring.aop.proxy;

import com.realjt.aspring.aop.Calculator;
import com.realjt.aspring.aop.spi.CalculatorSpi;

public class App
{
	public static void main(String[] args)
	{
		CalculatorProxy calculatorProxy = new CalculatorProxy();

		CalculatorSpi calculatorSpi = new CalculatorSpi();

		calculatorProxy.setCalculator(calculatorSpi);

		Calculator calculator = calculatorProxy.getCalculatorProxy();

		System.out.println(calculator.add(12, 10));
		System.out.println(calculator.sub(12, 10));

	}

}