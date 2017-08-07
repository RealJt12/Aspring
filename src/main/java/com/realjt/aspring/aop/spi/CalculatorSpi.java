package com.realjt.aspring.aop.spi;

import org.springframework.stereotype.Component;

import com.realjt.aspring.aop.Calculator;

@Component
public class CalculatorSpi implements Calculator
{
	@Override
	public int add(int i, int j)
	{
		int result = i + j;

		return result;
	}

	@Override
	public int sub(int i, int j)
	{
		int result = i - j;

		return result;
	}

	@Override
	public int mul(int i, int j)
	{
		int result = i * j;

		return result;
	}

	@Override
	public int div(int i, int j)
	{
		int result = i / j;

		return result;
	}

}
