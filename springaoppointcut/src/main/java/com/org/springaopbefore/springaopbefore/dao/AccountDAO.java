package com.org.springaopbefore.springaopbefore.dao;

import org.springframework.stereotype.Component;

import com.org.springaopbefore.springaopbefore.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass()+": Doing My DB Work Adding Ad Account");
	}
	
	public boolean doWork() {
		System.out.println(getClass()  + ": doWork()");
		return false;
	}
}
