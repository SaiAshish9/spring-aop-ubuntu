package com.springaop.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.aopdemo.dao.AccountDAO;
import com.springaop.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
        Account myAccount= new Account();
        theAccountDAO.addAccount(myAccount);
        theMembershipDAO.addAccount();
        context.close();
	}

}
