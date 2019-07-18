package com.org.springaopbefore.springaopbefore.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.org.springaopbefore.springaopbefore.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	// add a new method: findAccounts()
	
	public List<Account> findAccounts(boolean tripWire) {
	
		List<Account> myAccounts = new ArrayList<Account>();
		
		// create sample accounts
		Account temp1 = new Account("John", "Silver");
		Account temp2 = new Account("Madhu", "Platinum");
		Account temp3 = new Account("Luca", "Gold");
		
		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		
		return myAccounts;		
	}

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass()+": Doing My DB Work Adding Ad Account");
	}
	
	public boolean doWork() {
		System.out.println(getClass()  + ": doWork()");
		return false;
	}

	public String getName() {
		System.out.println(getClass() +": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() +" : setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass()+": getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
	
}
