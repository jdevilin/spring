package com.org.springaopbefore.springaopbefore.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	//"execution(* com.luv2code.aopdemo.dao.*.*(..))"
	
	@Pointcut("execution(* com.org.springaopbefore.springaopbefore.dao.*.*(..))")
	private void forDaoPackage() {}
	
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice(){
		System.out.println("|n==== Execution @Before advice on Account()");
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>> Performing API analytics");		
	}
}
