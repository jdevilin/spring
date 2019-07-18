package com.org.springaopbefore.springaopbefore.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAcount() {
		System.out.println(getClass()+": Doing My DB Work Adding Ad Account");
	}
}
