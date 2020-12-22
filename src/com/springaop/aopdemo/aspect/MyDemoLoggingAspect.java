package com.springaop.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Before("execution(public void com.springaop.aopdemo.dao.AccountDAO.add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("@Before addAccount");
	}

//	(* add*())
	
//	(* addAccount(com.springaop.aopdemo.dao.Account))
//	(* com.springaop.aopdemo.dao.*.*(..))
//	any class any method of given package
//	(* add*(com.springaop.aopdemo.Account))
//	(* add*(com.springaop.aopdemo.Account,..))
	
}

