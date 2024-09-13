package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.SortedMap;

import com.systex.model.MyDate;

public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(13, 9, 2024));
		dates.add(new MyDate(11, 8, 2020));
		dates.add(new MyDate(5, 12, 2019));
		dates.add(new MyDate(8, 10, 2025));
		dates.add(new MyDate(25, 2, 2030));
		dates.add(new MyDate(30, 1, 2008));
		dates.add(new MyDate(22, 3, 2004));
		dates.add(new MyDate(17, 7, 2012));
		dates.add(new MyDate(19, 6, 2015));
		
		System.out.println("========Not Yet Sorted========");
		dates.forEach(System.out::println);
		System.out.println("========Sorted By Year========");
		Collections.sort(dates);
		dates.forEach(System.out::println);
		
		System.out.println("========Sorted by month========");
		Collections.sort(dates, MyDate.MONTH_COMPARATOR);
		dates.forEach(System.out::println);
		
		System.out.println("========Sorted by Day(Asendent)========");
		Collections.sort(dates, MyDate.DAY_COMPARATOR);
		dates.forEach(System.out::println);
		
		System.out.println("========Sorted by Day(Dessendant)========");
		Collections.sort(dates, MyDate.DAY_COMPARATOR.reversed() );
		dates.forEach(System.out::println);
		
	}

}
