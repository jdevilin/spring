package com.org.springaopbefore.springaopbefore.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Before("execution(public void com.org.springaopbefore.springaopbefore.dao.AccountDAO.addAcount())")
	public void beforeAddAccountAdvice(){
		System.out.println("|n==== Execution @Before advice on Account()");
	}

}
