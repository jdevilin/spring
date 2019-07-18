package com.org.springaopbefore.springaopbefore.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAcount() {
		System.out.println(getClass()+": Doing Stuff : Adding Membership Account");
	}

}
