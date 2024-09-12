package com.systex.hr.model;

public class Account {
	private static double interestRate;
	private int blance;
	
	private final int MYCONST;//blank final instance variable
	
	private static final int MYCONST2;
	
	static {
		MYCONST2 = 100;
	}
	
	private static final int MYCONST3 = 100;
	
	static { //class constructor
		System.out.println("hello static block");
		interestRate = 0.02;
	}
	
	public Account(int blance, int x) { //object constructor
		this.blance = blance;
		this.MYCONST = x;
	}
	
	public int getBlance() {
		final int LOCAL_CONST;
		LOCAL_CONST = 300;
		System.out.println(LOCAL_CONST);
		//LOCAL_CONST = 400;
		return this.blance;
	}
	
	public void deposit(int amt) {
		this.blance += amt;
	}
	
	public void withdrw(int amt) {
		this.blance -= amt;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		if (interestRate < 0) {
			Account.interestRate = 0;
		}
		Account.interestRate = interestRate;
	}
	
	
}
