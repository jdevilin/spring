package com.org.springaopbefore.springaopbefore.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.org.springaopbefore.springaopbefore.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	@Before("com.org.springaopbefore.springaopbefore.advice.AopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("|n==== Execution @Before advice on Account()");
		
		// display method signature
		
		MethodSignature methodSign = (MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("Method : "+methodSign);
		
		// display method argument
		
		// get ars
		
		Object[] args = theJoinPoint.getArgs();
		
		// Lopp Thur Argu
		
		for(Object tempArg : args) {
               System.out.println(tempArg);	
               if(tempArg instanceof Account) {
            	   Account theAccount = (Account) tempArg;
            	   System.out.println("Account Name : "+theAccount.getName());
            	   System.out.println("Service Level : "+theAccount.getLevel());
               }
		}
			
	}


}
