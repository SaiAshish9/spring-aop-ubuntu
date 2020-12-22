package com.springaop.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springaop.aopdemo.Account;

@Component
public class AccountDAO {

	
	public List<Account> findAccounts(){
		
		List<Account> myAccounts = new ArrayList<>();
		
		Account temp1 = new Account("Sai","Ashish");
		Account temp2 = new Account("Sai1","Ashish1");
		Account temp3 = new Account("Sai2","Ashish2");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);

		return myAccounts;
		
	}
	
	public void addAccount(Account theAccount) {
		System.out.println(getClass() + "Add Account" );
	}
	
}
