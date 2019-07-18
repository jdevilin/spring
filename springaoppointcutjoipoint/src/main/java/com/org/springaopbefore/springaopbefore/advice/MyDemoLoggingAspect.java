package com.org.springaopbefore.springaopbefore.advice;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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

	// Add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(pointcut="execution(* com.org.springaopbefore.springaopbefore.dao.AccountDAO.findAccounts(..))",returning="result")
	public void afterReturningFindAccountAdvice(JoinPoint theJoinPoint,List<Account> result) {
       
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n Executhing @afterrunnong on method "+method);
		
		// Printout the result of the method call
		System.out.println("\n ========= >>> result is"+result);
		
		// let's post-process the data ..... let's modify it :-)
		
		System.out.println(" \n ======= >>> result is "+result);
		
		
	}
	
	public void convertAccountNamesToUpperCase(List<Account> result) {
		for(Account tempAccount : result) {
			String theUpperName = tempAccount.getName().toUpperCase();
			tempAccount.setName(theUpperName);
		}
	}
	
	
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
