package com.org.springaopbefore.springaopbefore.dao;

import org.springframework.stereotype.Component;

import com.org.springaopbefore.springaopbefore.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;

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
