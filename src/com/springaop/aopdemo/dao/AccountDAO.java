package com.springaop.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.springaop.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount) {
		System.out.println(getClass() + "Add Account" );
	}
	
}
