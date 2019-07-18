package com.org.springaopbefore.springaopbefore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.springaopbefore.springaopbefore.dao.AccountDAO;
import com.org.springaopbefore.springaopbefore.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);

		AccountDAO theAccountDao = context.getBean("accountDAO", AccountDAO.class);
		
		// Adding Memebership Dao Account
		
		MembershipDAO theMembershipDao = context.getBean("membershipDAO",MembershipDAO.class);

		theAccountDao.addAcount();
	   
		 // call Membership Account
		
		theMembershipDao.addAcount();
		
		context.close();
	}

}
