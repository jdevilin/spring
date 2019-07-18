package com.org.springaopbefore.springaopbefore;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.springaopbefore.springaopbefore.dao.AccountDAO;
import com.org.springaopbefore.springaopbefore.dao.MembershipDAO;

public class AftertThrowingDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);

		AccountDAO theAccountDao = context.getBean("accountDAO", AccountDAO.class);

		// Adding Memebership Dao Account

		MembershipDAO theMembershipDao = context.getBean("membershipDAO", MembershipDAO.class);

        List<Account> theAccounts = null;
        try {
			 boolean tripWire = true;
			 theAccounts = theAccountDao.findAccounts(tripWire);
			         	
		} catch (Exception e) {
			System.out.println("\n \n Main Program .... Caught Expression :"+e);
		}
		
       // display the accounts
        
        System.out.println("\n \nMain Program : AfterThrowingDemoApp");
        System.out.println("--------------");
        System.out.println(theAccounts);
        System.out.println("\n");
        
		context.close();
	}

}
