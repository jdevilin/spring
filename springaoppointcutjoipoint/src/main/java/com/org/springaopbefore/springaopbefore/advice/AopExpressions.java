package com.org.springaopbefore.springaopbefore.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
	
	@Pointcut("execution(* com.org.springaopbefore.springaopbefore.dao.*.*(..))")
	public void forDaoPackage() {
	}

	// Create pointcut for getter methods
	@Pointcut("execution(* com.org.springaopbefore.springaopbefore.dao.*.get*(..))")
	public void getter() {
	}

	// Create pointcut for setter methods
	@Pointcut("execution(* com.org.springaopbefore.springaopbefore.dao.*.set*(..))")
	public void setter() {
	}

	// create pointcut : include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter()||setter())")
	public void forDaoPackageNoGetterSetter() {
	}


}
