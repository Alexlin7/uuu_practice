package com.systex.main;

import com.systex.model.MyDate;

public class TestEqules {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(11, 9, 2024);
		MyDate d2 = new MyDate(11, 9, 2024);
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		
		Integer wAmount = 10000; //Auto-Boxing
		int balance = 5000;
		balance += wAmount;// Auto-Unboxing
		System.out.println("balance = " + balance);

	}

}
