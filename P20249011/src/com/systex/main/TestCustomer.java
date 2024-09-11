package com.systex.main;

import java.util.GregorianCalendar;

import com.systex.model.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c1 = new Customer("A123456789",
									"王曉明",
									"台北市大同區",
									new GregorianCalendar(2008, 9, 11).getTime(),
									'M',
									false,
									"");
		System.out.println(c1);
		Customer c2 = new Customer("A123456789",
									"王曉明",
									"台北市大同區",
									new GregorianCalendar(2025, 5, 11).getTime(),
									'M',
									false,
									"");
		System.out.println(c2);

	}

}
