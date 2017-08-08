package com.realjt.aspring.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;

public class ValidatorAspect
{
	public void beforce(JoinPoint joinPoint)
	{
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());

		System.out.println("ValidatorAspect beforce method = " + methodName
				+ ", args = " + args);
	}

}