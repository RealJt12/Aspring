package com.realjt.aspring.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 需要声明为一个切面，并作为组件交给IOC容器管理
 *
 * @author realjt
 */
@Component
@Aspect
public class CalculatorAspect
{
	/**
	 * 前置通知，在目标方法执行前执行
	 * 
	 * @param joinPoint
	 */
	@Before("execution(public int com.realjt.aspring.aop.Calculator.*(int, int))")
	public void beforce(JoinPoint joinPoint)
	{
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());

		System.out.println("Beforce method = " + methodName + ", args = "
				+ args);
	}

	/**
	 * 后置通知，在目标方法执行之后执行，无论目标方法是否发生异常
	 * 
	 * @param joinPoint
	 */
	@After("execution(* com.realjt.aspring.aop.Calculator.*(..))")
	public void after(JoinPoint joinPoint)
	{
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());

		System.out.println("After method = " + methodName + ", args = " + args);
	}

	/**
	 * 返回通知，在目标方法正常执行结束后执行，可以得到目标方法的返回值
	 * 
	 * @param joinpoint
	 */
	@AfterReturning(value = "execution(public int com.realjt.aspring.aop.Calculator.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result)
	{
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());

		System.out.println("AfterReturning method = " + methodName
				+ ", args = " + args + ", result = " + result);
	}

	/**
	 * 异常通知，在目标方法执行发生异常时执行
	 * 
	 * @param joinPoint
	 * @param exception
	 *            可以具体化某个异常类型，如果异常类型匹配不到参数定义的类型，则不会执行
	 */
	@AfterThrowing(value = "execution(* com.realjt.aspring.aop.Calculator.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Exception exception)
	{
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());

		System.out.println("AfterThrowing method = " + methodName + ", args = "
				+ args + ", exception = " + exception);
	}

	/**
	 * 环绕通知，必须有返回值，且该返回值作为目标方法的返回值
	 * 
	 * @param proceedingJoinPoint
	 *            需要携带ProceedingJoinPoint类型的参数
	 */
	@Around("execution(* com.realjt.aspring.aop.Calculator.*(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint)
	{
		String methodName = proceedingJoinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(proceedingJoinPoint.getArgs());

		Object result = null;

		try
		{
			// 前置通知
			System.out.println("Around Beforce method = " + methodName
					+ ", args = " + args);

			// 执行目标方法
			result = proceedingJoinPoint.proceed();

			// 返回通知
			System.out.println("Around AfterReturning method = " + methodName
					+ ", args = " + args + ", result = " + result);
		}
		catch (Throwable throwable)
		{
			// 异常通知
			System.out.println("Around AfterThrowing method = " + methodName
					+ ", args = " + args + ", throwable = " + throwable);
		}
		finally
		{
			// 后置通知
			System.out.println("Around After method = " + methodName
					+ ", args = " + args);
		}

		return result;
	}

}