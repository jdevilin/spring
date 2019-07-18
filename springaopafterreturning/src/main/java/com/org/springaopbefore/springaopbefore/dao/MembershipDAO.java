package com.org.springaopbefore.springaopbefore.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addSillyMember() {
		System.out.println(getClass() + ": Doing Stuff : Adding Membership Account");
	}

	public void goToSleep() {

		System.out.println(getClass() + ": I'm going to sleep now...");

	}

}
