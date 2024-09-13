package com.systex.main;

import java.util.LinkedList;

import com.systex.model.MyDate;

public class Sorting {

	public static void main(String[] args) {
		int arg = Integer.parseInt(args[0]);

		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(13, 8, 2024));
		dates.add(new MyDate(11, 8, 2024));
		dates.add(new MyDate(5, 12, 2019));
		dates.add(new MyDate(8, 10, 2025));
		dates.add(new MyDate(8, 2, 2025));
		dates.add(new MyDate(30, 1, 2008));
		dates.add(new MyDate(15, 1, 2008));
		dates.add(new MyDate(22, 3, 2004));
		dates.add(new MyDate(17, 7, 2012));
		dates.add(new MyDate(19, 6, 2015));

		System.out.println("=====原先陣列=====");
		dates.forEach(System.out::println);
		switch (arg) {
		case 0:
			System.out.println("=====排序為升冪排序後=====");
			dates.sort(MyDate.COMPARATOR);
			break;

		case 1:
			System.out.println("=====排序為降冪排序後=====");
			dates.sort(MyDate.COMPARATOR.reversed());
			break;
		default:
			System.out.println("輸入參數不對，不進行排序");

		}

		dates.forEach(System.out::println);

	}

}
