package com.org.springaopbefore.springaopbefore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.springaopbefore.springaopbefore.dao.AccountDAO;
import com.org.springaopbefore.springaopbefore.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);

		AccountDAO theAccountDao = context.getBean("accountDAO", AccountDAO.class);

		// Adding Memebership Dao Account

		MembershipDAO theMembershipDao = context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method
		Account myAccount = new Account();
		theAccountDao.addAccount(myAccount, true);
		theAccountDao.doWork();

		// call the membership business method
		theMembershipDao.addSillyMember();
		theMembershipDao.goToSleep();

		// close the context

		context.close();
	}

}
