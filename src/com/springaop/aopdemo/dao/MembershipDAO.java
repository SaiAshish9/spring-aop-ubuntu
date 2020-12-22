package com.springaop.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

//	fully qualified name package + class or interface
	
	public void addAccount() {
		System.out.println(getClass() + ": membership account ");
	}
	
}
