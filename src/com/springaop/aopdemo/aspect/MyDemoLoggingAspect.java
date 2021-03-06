package com.springaop.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(public void com.springaop.aopdemo.dao.AccountDAO.add*(..))")
	private void daoPackage() {}

	@Before("daoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("@Before addAccount");
	}

//	A() && B()
//	!A()
//	A() || B()
	
//	(* add*())
	
//	(* addAccount(com.springaop.aopdemo.dao.Account))
//	(* com.springaop.aopdemo.dao.*.*(..))
//	any class any method of given package
//	(* add*(com.springaop.aopdemo.Account))
//	(* add*(com.springaop.aopdemo.Account,..))
	
}

