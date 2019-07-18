package com.org.springaopbefore.springaopbefore;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.springaopbefore.springaopbefore.dao.AccountDAO;
import com.org.springaopbefore.springaopbefore.dao.MembershipDAO;

public class AfterRetrningDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);

		AccountDAO theAccountDao = context.getBean("accountDAO", AccountDAO.class);

		// Call Method to find Accounts
		
		List<Account> theAccounts = theAccountDao.findAccounts();
		
		// display the Accouts
		System.out.println("\n\n Main Program : AfterReturningApp ");
		System.out.println("------------");
		
		System.out.println(theAccounts);
		System.out.println("\n");
		context.close();
	}

}
