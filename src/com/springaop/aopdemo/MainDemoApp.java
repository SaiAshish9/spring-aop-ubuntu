package com.springaop.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
        theAccountDAO.addAccount();
        context.close();
	}

}
