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
	
	// Create pointcut for getter methods
	@Pointcut("execution(* com.org.springaopbefore.springaopbefore.dao.*.get*(..))")
	private void getter() {}
	
	// Create pointcut for setter methods
	@Pointcut("execution(* com.org.springaopbefore.springaopbefore.dao.*.set*(..))")
	private void setter() {}
	// create pointcut : include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter()||setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	
	
	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(){
		System.out.println("|n==== Execution @Before advice on Account()");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>> Performing API analytics");		
	}
}
