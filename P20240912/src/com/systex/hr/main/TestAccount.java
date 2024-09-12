package com.systex.hr.main;

import com.systex.hr.model.Account;

public class TestAccount {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		// TODO Auto-generated method stub
		System.out.println(Account.getInterestRate());
		Account acct1 = new Account(100, 500);
		System.out.println(acct1.getInterestRate());
		Account acct2 = new Account(100, 1000);
		System.out.println(acct2.getInterestRate());
		
		Account.setInterestRate(0.03);
		System.out.println(acct1.getInterestRate());
		System.out.println(acct2.getInterestRate());
		
		int r = 5;
		System.out.println(Math.PI*Math.pow(r, 2));
		long end = System.currentTimeMillis();
		
		System.out.println("Total process time =" + (end - start) );
	}

}
